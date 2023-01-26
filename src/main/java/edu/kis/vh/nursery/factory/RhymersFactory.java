package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountOutRhymer;

public interface RhymersFactory {

    DefaultCountOutRhymer GetStandardRhymer();

    DefaultCountOutRhymer GetFalseRhymer();

    DefaultCountOutRhymer GetFIFORhymer();

    DefaultCountOutRhymer GetHanoiRhymer();

}
