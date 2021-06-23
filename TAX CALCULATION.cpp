[20:48] 20BCY10074
    

usingnamespacestd;
#include<iostream>
 
voidtaxCalculator(doublegs, doublets){​​​​​​​​
double tax;
double amt= gs-ts;
if(amt<=100000)
    tax=0.0;
elseif(amt>100000 && amt<=200000)
    {​​​​​​​​
        tax=(10*amt)/100.0;
    }​​​​​​​​
elseif(amt>200000 && amt<=500000)
    tax=(10*amt)/100.0 + (20*(amt-200000))/100;
else
    tax=(10*amt)/100.0 + (20*(amt-200000))/100 + (30*(amt-500000))/100;
 
    cout<<"tax="<<tax;
}​​​​​​​​
 
intmain(){​​​​​​​​
double gs,ts;
    cout<<"enter gross salary:";
    cin>>gs;
    cout<<"enter total savings:";
    cin>>ts;
taxCalculator(gs,ts);
 
return0;
}​​​​​​​​

