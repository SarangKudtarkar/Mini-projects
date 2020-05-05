//Created by :Sarang Kudtarkar
//input : time(in seconds)
//output: alarm for time(seconds)
//uses chrono library for clock functions
// '/a' is used for triggering alarm

//Todo:
//1.Add snooze button
//2.Add timer,stopwatch and alarm functions



#include<bits/stdc++.h>
#define lli long long int
using namespace std::chrono;
using namespace std;

int main()
{
lli time,check,previous;
check=1;                           //check initialized to 1 ,check=0 when duration>=time count
cout<<"Enter time in seconds"<<"\n";
cin>>time;
time=time*1000000;                 //convert time(in sec) to microseconds
auto start = high_resolution_clock::now();   // starting time
previous=0;                        //initialize previous time count(in sec) to 0

while(check)
{

auto stop = high_resolution_clock::now();
auto duration = duration_cast<microseconds>(stop - start);
lli current=(lli)duration.count()/1000000;                    //display time in seconds
if(current>previous)
{

    cout<<"Time passed: "<<current<<" sec"<<"\n";
    previous=current;

}

         if(duration.count()>=time)
         {
             check=0;
         }
}
cout<<"Time's up!"<<"\n";
check=10;                                          //Alarm triggered 10 beeps
while(check--)
{

    cout<<'\a';
}

    return 0;
}
