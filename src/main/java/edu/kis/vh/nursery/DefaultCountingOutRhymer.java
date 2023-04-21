package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_SIZE = 12;
    public static final int EMPTY_RHYMER = -1;
    public static final int DEFAULT_RHYMER_VALUE = -1;
    public static final int FULL_RHYMER_INDICATOR = MAX_SIZE - 1;
    private int[] numbers = new int[MAX_SIZE];

    public int total = EMPTY_RHYMER;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER;
    }

    public boolean isFull() {
        return total == FULL_RHYMER_INDICATOR;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_RHYMER_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_RHYMER_VALUE;
        return numbers[total--];
    }

}
