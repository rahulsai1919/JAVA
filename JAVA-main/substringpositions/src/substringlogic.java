public class substringlogic {

    public static void main(String[] args) {
        String str1 = new String("hi this is ra rah rahul sai");
        String str2 = new String("rahul sai");
        int len1 = str1.length(),len2 = str2.length();
        int i=0,j=0,count=0;
        int subpos = -1,pos=1;

        while(i < len1)
        {
            if(str1.charAt(i) == str2.charAt(0) && (i==0 || str1.charAt(i-1) == ' '))
            {
                while(j<len2 && i<len1 && str1.charAt(i) == str2.charAt(j))
                {
                    ++i;
                    ++j;
                }

                if(j == len2 && (i==len1 || str1.charAt(i) == ' '))
                {
                    //System.out.println(i);
                    j=0;
                    subpos = i - len2;
                    count++;
                    if(count == pos)
                        break;
                }
            }
            else
            {
                i++;
            }
            j=0;
        }
        if(subpos == -1)
        {
            System.out.println("invalid");
            //return -1;
        }
        if(count < pos)
        {
            System.out.println("not many times");
        }
        //return subpos;
        System.out.println(subpos);

    }
}

//	    for(ind1 = 0 ;ind1<len1;ind1++)
//		{
//            if(str1.charAt(ind1) == str2.charAt(ind2))
//		    {
//                ind2++;
//		        if(ind2 > len2-1)
//		        {
//		            ind2 = 0;
//		            count++;
//		            subpos = ind1 - len2 + 1;
//		            if(count == pos)
//		            {
//		                flag=1;
//		                break;
//		            }
//		        }
//		    }
//		    else
//		        ind2=0;
//	    }
//
//	    if(subpos==-1)
//	    {
//	        //System.out.println("no presence");
//	        //System.exit(0);
//	        return -1;
//	    }
//	    if(count < pos)
//	    {
//	        return -1;
//	    }
//	    return subpos;