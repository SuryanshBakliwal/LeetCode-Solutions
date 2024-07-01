class Solution {
    public int[] sortEvenOdd(int[] A) {
        int even[] = new int[101];
        int odd[] = new int[101];
        for(int i=0; i<A.length; i++){
            if(i % 2 == 0) even[A[i]]++;
            else odd[A[i]]++;
        }
        int inc = 0, dec = 100;
        for(int i=0; i<A.length; i++){
            if(i%2 == 0){
                while(even[inc] == 0) inc++;
                A[i] = inc;
                even[inc]--;
            }else{
                while(odd[dec] == 0) dec--;
                A[i] = dec;
                odd[dec]--;
            }
        }
        return A;
    }
}