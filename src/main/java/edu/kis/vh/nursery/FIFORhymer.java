package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountOutRhymer {

    public DefaultCountOutRhymer temp = new DefaultCountOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck()) {
            temp.countIn(super.countOut());
        }

        int ret = temp.countOut();

        while (!temp.callCheck())

            countIn(temp.countOut());

        return ret;
    }
}
