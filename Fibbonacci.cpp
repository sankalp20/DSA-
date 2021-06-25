using namespace std;
#include<iostream>
 
int fibo(int n)
{
    if(n==0)
    return 1;
    else if(n==1)
    return 1;
    else
    {
        return fibo(n-1)+ fibo(n-2);
    }
}
int main()
{
    int n;
    
    cout<<"enter the last term:";
    cin>>n;
    int k=fibo(n);
    cout<<n<<"th term:"<<k;
 
}
