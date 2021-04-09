package threading.exercise;

import java.io.*;
import java.util.ArrayList;

public class ReadWritetofile {
    public static void main(String[] args) {
        File directory = new File("E:\\java\\sample files");
        File outfile = new File("E:\\java\\sample files\\output.txt");
        File[] files = directory.listFiles();
        for(File infile : files)
        {
            FileOperation operate = new FileOperation(infile, outfile);
            Thread t = new Thread(operate);
            t.start();
        }
    }
}

class FileOperation implements Runnable {
    File infile;
    File outfile;

    FileOperation(File infile, File outfile) {
        this.infile = infile;
        this.outfile = outfile;
    }

    @Override
    public void run() {
        ArrayList<String> linelist;
        linelist = readfromfile(infile);
        writetofile(outfile,linelist);
    }

    void writetofile(File outfile,ArrayList<String> linelist)
    {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outfile, true));
            for(String line : linelist)
                writer.write(line);
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    ArrayList<String> readfromfile(File infilename)
    {
        ArrayList<String> lineslist= new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(infilename));
            String record;
            while ((record = reader.readLine()) != null) {
                lineslist.add(record + "\n");
            }
        } catch (FileNotFoundException fne) {
            System.out.println(fne.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return lineslist;
    }


}
