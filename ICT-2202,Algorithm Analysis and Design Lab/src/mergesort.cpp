#include<iostream>
using namespace std;
void merged(int arr[],int l,int m,int u)
{
    int s1=m-l+1;
    int s2=u-m;
    int larr[s1+1],rarr[s2+1];
    for(int i=0;i<s1;i++)
    {
        larr[i]=arr[l+i];
    }
    for(int j=0;j<s2;j++)
    {
        rarr[j]=arr[m+1+j];
    }
    int i=0,j=0,k=l;
    while(i<s1 && j<s2)
    {
        if(larr[i]>rarr[j])
           {
               arr[k]=rarr[j];
               j++;
           }
        else
        {
            arr[k]=larr[i];
            i++;
        }
        k++;
    }
    while(i<s1)
    {
        arr[k]=larr[i];
        i++;
        k++;
    }
    while(j<s2)
    {
        arr[k]=rarr[j];
        j++;
        k++;
    }
}
void mergeSort(int arr[],int lower,int upper)
{
    int mid;
    if(lower<upper)
    {
       mid=(lower+upper)/2;

       mergeSort(arr,lower,mid);
       mergeSort(arr,mid+1,upper);

       merged(arr,lower,mid,upper);
    }
}
int main(){
int n;
cout<<"enter the number of element:";
cin>>n;
int arr[n+1];
cout<<"enter the array element:";
for(int i=0;i<n;i++)
{
    cin>>arr[i];
}
mergeSort(arr,0,n-1);
cout<<"the sorted elements are:";
for(int i=0;i<n;i++)
{
    cout<<arr[i]<<" ";
}
cout<<endl;
}
