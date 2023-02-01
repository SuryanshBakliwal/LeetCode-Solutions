class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1+str2).equals(str2+str1)) {
            return "";
        }
        int len = str1.length();
        int len2 = str2.length();
        int gcd = GCD(len, len2);
        if (len < len2) {
            return str1.substring(0, gcd);
        }
        return str2.substring(0, gcd);
    }   

    public int GCD(int a, int b) {
        while(a%b != 0){
            int rem = a%b ;
            a = b;
            b = rem;
        }
        return b;
    }
}