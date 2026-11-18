class Solution {
    public void reverseString(char[] s) {
       int left=0;
       int right=s.length-1;
       while(left<right){
        char temp=s[left];
        s[left]=s[right];
        s[right]=temp;
        left++;
        right--;
       }

        }
    }


















//  char[] res=new char[s.length];
//         for(int i=0;i<s.length;i++){  brute
//             res[i]=s[s.length-1-i];
//         }
//        for(int i=0;i<res.length;i++){
//         s[i]=res[i];
//        }