#include<iostream>

using namespace std;
int main ()
{
int n,i,higher,lower=0,middle,number,a;

	cout<<"enter the size of array";
	cin>>n;
	cout<<"enter the element";
	for(i=0;i<n;i++)
	{
		cin>>a[i];
		}
		
		cout<<"enter the no you want to search";
		cin>>number;
		higher=n-1;
		while(lower<=higher)
		{
		middle=lower-higher;
		if (number==middle){
		cout<<"";}
		else
		{(number>=middle);
		(higher=middle-1);}
		
		if(lower=middle+1){
		
		cout<<"number found";}
		else
		{
		cout<<"number not found";
		}
		}
		return 0;
	}
	
	 
		
	 
	
	
	
