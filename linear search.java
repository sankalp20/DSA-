;
import java.util.Scanner;
class p1
{
    static Scanner sc=new Scanner(System.in);
    int arr[][],r,c;
    p1(int x,int y)
    {
        r=x;
        c=y;
        arr=new int[r][c];
    }
    void input()
    {
        int i,j;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.println("enter");
                arr[i][j]=sc.nextInt();
            }
        }
    }
            boolean check(int t)
            {
                int i,j;
                boolean f=false;
                for(i=0;i<r;i++)
                {
                    for(j=0;j<c;j++)
                    {
                       if(arr[i][j]==t)
                       {
                          return true;
                        }
                          break;
                       
                    }}
                    return false;
                }
                   
              static void main()
              {
                  int a,b,t1;
                  System.out.println("enter");
                  a=sc.nextInt();
                  b=sc.nextInt();
                  p1 obj=new p1(a,b);
                  obj.input();
                  System.out.println("enter target");
                  t1=sc.nextInt();
                  boolean ch=obj.check(t1);
                  if(ch==true)
                  System.out.println("found");
                  else
                  System.out.println("not found");
                }
            }
