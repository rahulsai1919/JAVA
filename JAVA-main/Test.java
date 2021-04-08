import java.io.*;

public class Test {
    public static void main(String[] args) {

        String path = "C:\\Users\\rahul-pt4060\\IdeaProjects\\practice\\src\\threading\\exercise\\";
        String filename1 = path+"studentrecord1.txt";
        String filename2 = path+ "studentrecord2.txt";
        String outfilename = path+"output.txt";
        try {
           Thread t1 = new FileOperate(filename1,outfilename);
            Thread t2 = new FileOperate(filename2,outfilename);
            t1.start();
            t2.start();
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class FileOperate extends Thread
{
    BufferedReader reader;
    BufferedWriter writer;
    FileOperate(String infilepath, String outfilepath) throws IOException
    {
        reader = new BufferedReader(new FileReader(infilepath));
        writer = new BufferedWriter(new FileWriter(outfilepath));
    }
    void operate() throws IOException
    {
        String line;
        while((line = reader.readLine()) != null)
        {
            System.out.println(line);
            writer.write(line + "\n");
        }
        reader.close();
        writer.close();
    }
    @Override
    public void run() {
        try
        {
            operate();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
