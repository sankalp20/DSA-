import java.util.Scanner;
class q9
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,r,c,f=0,c1,min,max;
        System.out.println("enter size of an array");
        r=sc.nextInt();
        c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("enter elements of an array");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
              a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<r;i++)
        {
            min=a[i][0];c1=0;
            for(j=0;j<c;j++)
            {
              if(a[i][j]<min)
              {
                  min=a[i][j];
                  c1=j;
                }
            }
            max=a[0][c1];
            for(j=0;j<r;j++)
            {
                if(a[j][c1]>max)
               
                 max=a[j][c1];
                }
                if(min==max)
                {
                    f=1;
                    System.out.println("saddle point="+max);
                }
            }
            if(f==0)
            System.out.println("not found");
        }}
       
