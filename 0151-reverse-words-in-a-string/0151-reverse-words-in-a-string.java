class Solution {
    public String reverseWords(String s) {
        String[] st = s.trim().split("\\s+");
        // for(int i=0; i<st.length; i++) {System.out.print(st[i]); System.out.print("1");}
        int left = 0, right = st.length-1;
        // StringBuilder sb = new stringBuilder();
        while(left <= right){
            String temp = st[left].trim();
            st[left] = st[right].trim();
            st[right] = temp;
            left++;
            right--;
        }
        return String.join(" ", st);
    }
}