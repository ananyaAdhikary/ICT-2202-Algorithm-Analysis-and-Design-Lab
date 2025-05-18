#include<iostream>
using namespace std;
int main()
{

    int n;
    cout<<"enter the number of element you want to insert in the array:";
    cin>>n;
    cout<<"enter the array elements:";
    int arr[n+1];
    for(int i=0;i<n;i++)
    {

        cin>>arr[i];
    }


    for(int pass=1;pass<n;pass++)
    {

        for(int i=0;i<n-pass;i++)
        {
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

    }

    cout<<"the sorted array:";
     for(int i=0;i<n;i++)
        {
            cout<<arr[i]<<" ";
        }



}
