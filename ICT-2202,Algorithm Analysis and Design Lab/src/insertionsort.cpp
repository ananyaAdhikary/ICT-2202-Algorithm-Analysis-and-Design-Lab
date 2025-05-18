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
    for(int i=1;i<n;i++)
    {
        int temp1=arr[i];
        for(int j=i-1;j>=0;j--)
        {
            if(arr[j]>temp1)
            {
                int temp2=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp2;
            }
        }
    }
     cout<<"the sorted array:";
     for(int i=0;i<n;i++)
        {
            cout<<arr[i]<<" ";
        }
}
