class BusBooking {
     private int totalTime;
     private int bookedCount;
     private int[][] seats;

    public BusBooking(int n) {
        totalTime=0;
        bookedCount=0;
        seats=new int[n][4];
    }
    
    public void toggle(String seat) {
        int row=Integer.parseInt(seat.substring(1))-1;
        int col=seat.charAt(0)-'A';
        if(seats[row][col]>0){
            totalTime-=seats[row][col];
            bookedCount--;
            seats[row][col]=0;
            return;
        }
        int cost=1;
        if(col == 0 && seats[row][1]>0 || (col == 3 && seats[row][2] > 0)) {
        
            cost=3;
        }
        seats[row][col]=cost;
        totalTime+=cost;
        bookedCount++;

    }
    
    public int getTotalTime() {
        return totalTime;
    }
    
    public int getMinTime() {
        return bookedCount;
    }
}

/**
 * Your BusBooking object will be instantiated and called as such:
 * BusBooking obj = new BusBooking(n);
 * obj.toggle(seat);
 * int param_2 = obj.getTotalTime();
 * int param_3 = obj.getMinTime();
 */