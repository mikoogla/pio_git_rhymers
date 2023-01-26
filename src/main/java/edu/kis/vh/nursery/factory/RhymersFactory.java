package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountOutRhymer;

public interface RhymersFactory {

    DefaultCountOutRhymer getStandardRhymer();

    DefaultCountOutRhymer getFalseRhymer();

    DefaultCountOutRhymer getFIFORhymer();

    DefaultCountOutRhymer getHanoiRhymer();

}
