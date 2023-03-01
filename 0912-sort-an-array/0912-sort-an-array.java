class Solution {
    public static int[] mergeSort(int[] arr, int lo, int hi) {
    if(lo==hi){
      int ba[] = new int[1];
      ba[0] = arr[lo];
      return ba;
    }
    int mid = (lo + hi)/2;
    int[] res1 = mergeSort(arr, lo, mid);
    int[] res2 = mergeSort(arr, mid+1, hi);
    int[] res = mergeTwoSortedArrays(res1, res2);
        return res;
    }

  //used for merging two sorted arrays
  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    int i = 0, j =0, k = 0;
    int[] ans = new int[a.length + b.length];
    while(i < a.length && j < b.length){
        if(a[i] <= b[j]){
          ans[k] = a[i];
          i++;
          k++;
        }else{
          ans[k] = b[j];
          j++;
          k++;
        }
    }
    while(i < a.length){
      ans[k] = a[i];
      k++;
      i++;
    }
    while(j < b.length){
      ans[k] = b[j];
      k++;
      j++;
    } 
    return ans;
  }
    public int[] sortArray(int[] nums) {
        nums = mergeSort(nums, 0, nums.length-1);
        return nums;
  }

}