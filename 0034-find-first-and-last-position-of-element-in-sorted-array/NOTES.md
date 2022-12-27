# Naive Approach = O(n);
​
# By Binary Search = O(logn);
​
**for finding first index**
​
target > arr[mid]
i += 1;
​
target < arr[mid]
j -= 1;
target == arr[mid]
j -= 1;
firstIdx = mid;
​
**for finding last index**
​
target > arr[mid]
i += 1;
​
target < arr[mid]
j -= 1;
target == arr[mid]
i += 1;
lastIdx = mid;
**Code**
`
int l=0;
int h=n-1;
int first = -1;
int last = -1;
int mid= -1;
while(l<=h){
mid = (h+l)/2;
if(arr[mid] > d){
h = mid-1;
}else if(arr[mid] < d){
l = mid+1;
}else{
last = mid;