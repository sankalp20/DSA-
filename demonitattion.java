import java.util.Scanner;
class bank
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no.");
        String n=sc.nextLine();
        int l=n.length();
        if(l>5)
        System.out.println("INVALID INPUT");
        else
        {
            int co=0,i,j,x,y;
            String s[]={"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
            String str="";
            int m=Integer.parseInt(n);
            while(m!=0)
            {
                int d=m%10;
                str=s[d]+" "+str;
                m=m/10;
            }
            System.out.println(str);
            System.out.println("DENOMINATION");
                int b[]={1000,500,100,50,20,10,5,2,1};
                int t=Integer.parseInt(n);
                while(t!=0)
                {
                    for(i=0;i<9;i++)
                    {
                        x=t/b[i];
                        y=x*b[i];
                        if(x!=0)
                        System.out.println(b[i]+"\t"+"*"+"\t"+x+"="+y);
                        t=t%b[i];
                        co=co+x;
                    }
                }
                System.out.println("TOTAL:"+n);
                System.out.println("Total no. of notes="+co);
            }
        }
    }
