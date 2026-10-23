class Solution {
    public boolean isHappy(int n) {
        // int count=0;
        // while(n!=1 && count<1000){
        //     int sum=0;
        //     while(n>0){                //brute
        //         int digit=n%10;
        //         sum+=digit*digit;
        //         n=n/10;
        //     }
        //     n=sum;
        //     count++;
        // }
        // return n==1;

       HashSet<Integer> used=new HashSet<>();
       
       while(true){
        int sum=0;
        while(n !=0){
            sum+=Math.pow(n%10,2.0);
            n=n/10;
        }
        if(sum==1) return true;
        n=sum;
        if(used.contains(n)) return false;
        used.add(n);
       }
    }
}