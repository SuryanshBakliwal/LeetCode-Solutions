class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        List<int[]> list = new ArrayList<>();
        for(int num : nums){
            int newNum = 0;
            int i=1, temp = num;
            if(num == 0){
                newNum = mapping[num];    
            }
            else {
                    while(num > 0){
                    int rem = num%10;
                    num /= 10;
                    newNum +=  mapping[rem] * i;
                    i *= 10;
                }
            }
            
            System.out.println(newNum);
            list.add(new int[]{newNum, temp});   
        }
        Collections.sort(list, (a,b)-> a[0] - b[0]);
        int ans[] = new int[nums.length];
        int idx = 0;
        for(int arr[] : list){
            ans[idx++] = arr[1];
        }
        return ans;
    }
}