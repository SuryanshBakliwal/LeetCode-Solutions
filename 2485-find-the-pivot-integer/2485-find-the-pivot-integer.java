class Solution {
    public int pivotInteger(int n) {
        for(int x=1; x<=n; x++){
            int sumOfFirstX = (x*(x+1)/2);
            int sumOfXtoN = ((n*(n+1)/2) + x - sumOfFirstX);
            System.out.println(sumOfFirstX + " " + sumOfXtoN);
            if(sumOfFirstX == sumOfXtoN) return x;
        }
        return -1;
    }
}