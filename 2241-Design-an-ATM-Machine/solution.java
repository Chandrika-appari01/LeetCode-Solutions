class ATM {

    int[] notes = {20, 50, 100, 200, 500};
    long[] count = new long[5];

    public ATM() {

    }

    public void deposit(int[] banknotesCount) {
        for (int i = 0; i < 5; i++) {
            count[i] += banknotesCount[i];
        }
    }

    public int[] withdraw(int amount) {
        int[] result = new int[5];
        long remaining = amount;

        for (int i = 4; i >= 0; i--) {
            result[i] = (int) Math.min(count[i], remaining / notes[i]);
            remaining -= (long) result[i] * notes[i];
        }

        if (remaining != 0) {
            return new int[]{-1};
        }

        for (int i = 0; i < 5; i++) {
            count[i] -= result[i];
        }

        return result;
    }
}