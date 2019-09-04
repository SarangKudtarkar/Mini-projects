#include <bits/stdc++.h>
#include<chrono>
using namespace std;
using namespace std::chrono;
void fib(unsigned long int a)
{
    auto start = high_resolution_clock::now();
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
auto stop = high_resolution_clock::now();
auto duration = duration_cast<microseconds>(stop - start);
cout << "Time taken by modified method "<<duration.count() << endl;
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
auto start = high_resolution_clock::now();
cout<<fibo(n)<<"\n";
auto stop = high_resolution_clock::now();
auto duration = duration_cast<microseconds>(stop - start);
cout << "Time taken by simple method "<<duration.count() << endl;
	return 0;
}

