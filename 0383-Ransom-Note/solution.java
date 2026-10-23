class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean[] used=new boolean[magazine.length()];
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            boolean found =false;
            for(int j=0;j<magazine.length();j++){
                if(magazine.charAt(j)==ch && !used[j]){
                    used[j]=true;
                    found=true;
                    break;

                }
            }
            if(!found){
                return false;
            }
        }
        return true;
    }
}