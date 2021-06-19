usingnamespacestd;
#include<iostream>
 
intmain()
{​​​​​​​​
int a;
int* aptr=&a;
int** p=&aptr;
 
    cout<<"enter a value:";
    cin>>a;
    cout<<"address of pointer to variable(i.e. aptr):"<<p;
 
return0;
}​​​​​​​​

