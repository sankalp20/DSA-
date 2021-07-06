import java.util.*;
class series
{
    int x,n;
    
    series(int x,int n)
    {
        this.x=x;
        this.n=n;
    }
    int power(int a,int b)
    {
        if(b==0)
        return 1;
        else
        return a*power(a,b-1);
    }
    void display()
    {
        System.out.println("base="+x);
        System.out.println("power="+n);
    }
    
    class sumseries extends series
    {
        double sum;
        sumseries(int xa,int na,double s)
        {
            super(xa,na);
            sum=s;
        }int factorial(int a)
        {
            int f=1;
            for(int i=a;i>0;i--)
            f=f*i;
            return f;
        }
        void calc()
        {
            for(int i=1;i<=n;i++)
            {
                int num=power(x,i);
                int dem=factorial(i);
                sum=sum+1.0*num/dem;
            }
        }
        void display()
        {
            super.display();
            System.out.println("sum="+sum);
        }
         void main()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter");
            int a=sc.nextInt();
            int b=sc.nextInt();
            sumseries obj=new sumseries(a,b,0);
            obj.calc();
            obj.display();
        }
    }
}
