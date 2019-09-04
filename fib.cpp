#include <bits/stdc++.h>
using namespace std;
void fib(unsigned long int a)
{
    unsigned long int t,g0,g1;
    if(a<=1){cout<<a<<"\n";return;}
    g0=1;
    g1=1;
    for(unsigned long int i=2;i<a;i++)
    {
        t=g1;
        g1=g0+g1;
        g0=t;
    }

       cout<<g1<<"\n";

}
unsigned long int fibo(unsigned long int a)
{
    if(a<=1)return a;
    return (fibo(a-1)+fibo(a-2));
}
int main() {
unsigned long int n;

cin>>n;
fib(n);
//cout<<fibo(n);

	return 0;
}

