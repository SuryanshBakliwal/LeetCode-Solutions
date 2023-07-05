//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std; 

// } Driver Code Ends
class Solution{
public:
    int onesComplement(int N){
        //code here
         int X = 1;
        while (N > X) X = X * 2 + 1;
        return X - N;
    }
};

//{ Driver Code Starts.
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        
        Solution ob;
        cout<<ob.onesComplement(n)<<"\n";
    }
}
// } Driver Code Ends