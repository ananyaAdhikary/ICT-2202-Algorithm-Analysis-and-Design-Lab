#include<iostream>
using namespace std;

int partition1(int q[],int l,int u)
{
    int pivot=q[u];
    int i=l-1;

    for(int j=l;j<u;j++)
    {
        if(q[j]<pivot)
        {
            i++;
            swap(q[i],q[j]);

        }

    }
    swap(q[i+1],q[u]);
    return i+1;

}

void quicksort(int q[],int l,int u)
{
    if(l<u){
        int pi=partition1(q,l,u);
        quicksort(q,l,pi-1);
        quicksort(q,pi+1,u);
    }
}

int main()
{
    int n;
    cout<<"enter the number of element:";
    cin>>n;

    int arr[n+1];
    cout<<"enter the array element:";
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }

    quicksort(arr,0,n-1);

    cout<<"the sorted elements are:";

    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }

    cout<<endl;
}
