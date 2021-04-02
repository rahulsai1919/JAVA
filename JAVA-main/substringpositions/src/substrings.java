import java.util.*;
public class substrings
{

    public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String str1 = new String();     		// hi this is ra rahul sai how are you rahul sai and rahul sai
		String str2 = new String();				// rahul sai
		System.out.println("enter string1");
		str1 = input.nextLine();
		System.out.println("enter string2");
		str2 = input.nextLine();
		int choice,occurind;

		boolean takeinput = true;
		while(takeinput)
		{
			System.out.println("enter your choice (1-7)");
			choice = input.nextInt();
			if (choice == 1) {
			    occurind = findindex(str1, str2, 1);
			    if(occurind == -1)
                    System.out.println("no presence");
			    else
			        System.out.println("first occuring index " + occurind);
				//takeinput = false;
			}
			else if (choice == 2) {
                occurind = findindex(str1, str2, -1);
                if(occurind == -1)
                    System.out.println("no presence");
                else
                    System.out.println("last occuring index " + occurind);
				//takeinput = false;
			}
			else if (choice == 3) {
				System.out.println("enter the occurence to reverse");
				int index = input.nextInt();
				occurind = findindex(str1, str2, index);
				if (occurind == -1)
					System.out.println("substring not present that many times");
				else {
					str1 = subreverse(str1, str2.length(), occurind);
					System.out.println(str1);
					//takeinput = false;
				}
			}
			else if (choice == 4) {
				System.out.println("enter the occurence to remove");
				int index = input.nextInt();
				occurind = findindex(str1, str2, index);
				if (occurind == -1)
					System.out.println("substring not present that many times");
				else {
					str1 = subremove(str1, str2.length(), occurind);
					System.out.println(str1);
					//takeinput = false;
				}
			}
			else if (choice == 5) {
				System.out.println("enter the occurence to be replaced");
				int index = input.nextInt();
				occurind = findindex(str1, str2, index);
				if (occurind == -1)
					System.out.println("substring not present that many times");

				else {
					System.out.println("enter string to replace");
					String replace = input.next();
					str1 = subreplace(str1, str2.length(), occurind, replace);
					System.out.println(str1);
					//takeinput = false;
				}
			}
			else if (choice == 6) {
				System.out.println("enter new substring to replace and perform");
				input.nextLine();
				String newsubstring = input.nextLine();
				str2 = newsubstring;

			}
			else if(choice == 7)
			{
				System.out.println("exit");
				break;
			}
			else
			{
				System.out.print("invalid input ");
			}
		}
	        
	}
	
	public static int findindex(String str1, String str2, int pos)
	{
	    int len1 = str1.length(), len2 = str2.length(), flag=0;
	    int subpos=-1, count=0, ind1=0, ind2=0;


		while(ind1 < len1)
		{
			if(str1.charAt(ind1) == str2.charAt(ind2) && (ind1==0 || str1.charAt(ind1-1)==' '))
			{
				while(ind2<len2 && ind1<len1 && str1.charAt(ind1) == str2.charAt(ind2))
				{
					++ind1;
					++ind2;
				}

				if(ind2 == len2 && (ind1==len1 || str1.charAt(ind1) == ' '))
				{
					ind2=0;
					subpos = ind1 - len2;
					count += 1;
					if(count == pos)
						break;
				}
			}
			else
			{
				ind1++;
			}
			ind2 = 0;
		}
        if(subpos == -1) {
            //System.out.println("invalid");
            return  -1;
        }
        if(count < pos)
            return -1;
        return subpos;
	    
    }
    
    public static String subreverse(String str1,int revlen,int revind)
    {
        String newstr = "";
        for(int ind=0;ind<revind;ind++)
            newstr += str1.charAt(ind);
        for(int ind=revind+revlen-1 ; ind>=revind ; ind--)
            newstr += str1.charAt(ind);
        for(int ind =revind+revlen ; ind<str1.length(); ind++)
            newstr += str1.charAt(ind);
        return newstr;
    }
    
    public static String subremove(String str1,int remlen,int remind)
    {
        String newstr = "";
        for(int ind=0;ind<remind;ind++)
            newstr += str1.charAt(ind);
        for(int ind=remind+remlen;ind<str1.length();ind++)
			newstr += str1.charAt(ind);
        return newstr;
    }
    
    public static String subreplace(String str1,int sublen,int occurind,String replace)
    {
        String newstr = "";
        for(int ind =0; ind<occurind; ind++)
            newstr += str1.charAt(ind);
        newstr += replace;
        for(int ind=occurind+sublen; ind<str1.length(); ind++)
            newstr += str1.charAt(ind);
        return newstr;
    }
}