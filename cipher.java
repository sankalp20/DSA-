import java.io.*;
import java.util.*;
class cipher
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        String s,st,w="",output="";
        char ch;
        int L,l,co=0,i,j,c;
        System.out.println("ENTER A STRING");
        s=sc.nextLine();
        L=s.length();
        if(L<=3||L>=100)
        System.out.println("INVALID INPUT");
        else
        {
            StringTokenizer str=new StringTokenizer(s,"., ?!");
            c=str.countTokens();
            for(i=1;i<=c;i++)
            {
                st=str.nextToken();
                l=st.length();
                for(j=0;j<l;j++)
                {
                    ch=st.charAt(j);
                    if((int)ch>=65||(int)ch<=77||(int)ch>=97||(int)ch<=109)
                    {
                        co=(int)ch+13;
                    }
                    else
                    
                    {
                        co=(int)ch-13;
                    }
                    w=(String)(w+(char)co);
                }
                output=output+w+" ";
                w="";
            }
            System.out.println("THE CIPHER TEXT IS:"+output);
        }
    }
}
