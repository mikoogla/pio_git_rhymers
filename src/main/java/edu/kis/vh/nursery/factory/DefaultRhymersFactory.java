package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class DefaultRhymersFactory implements RhymersFactory {

    @Override
    public DefaultCountOutRhymer GetStandardRhymer() {
        return new DefaultCountOutRhymer();
    }

    @Override
    public DefaultCountOutRhymer GetFalseRhymer() {
        return new DefaultCountOutRhymer();
    }

    @Override
    public DefaultCountOutRhymer GetFIFORhymer() {
        return new FIFORhymer();
    }

    @Override
    public DefaultCountOutRhymer GetHanoiRhymer() {
        return new HanoiRhymer();
    }

}
