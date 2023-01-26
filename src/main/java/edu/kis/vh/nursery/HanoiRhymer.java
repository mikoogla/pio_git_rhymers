package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
//alt  +  <-->  -  przełączenie się pomiędzy otwartymi plikami