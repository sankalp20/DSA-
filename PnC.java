import java.util.Scanner;
class permu
{
    int n,r;
    static Scanner sc=new Scanner(System.in);
    permu()
    {
        n=0;
        r=0;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ");
        n=sc.nextInt();
        r=sc.nextInt();
    }
    int fact (int k)
    {
        if (k==0)
        return 1;
        else
        return k*fact(k-1);
    }
    double calc()
    {
        int a=fact(n);
        int b=fact(r);
        int c=fact(n-r);
        double p=(double)a/(double)(b*c);
        return p;
    }
    static void main()
    {
        permu obj=new permu();
        obj.accept();
        double q=obj.calc();
        System.out.println("permutation ="+q);
    }
}
