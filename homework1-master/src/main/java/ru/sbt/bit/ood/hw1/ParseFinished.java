package ru.sbt.bit.ood.hw1;

import java.util.ArrayList;

/**
 * Created by Григорий on 20.12.2016.
 */

public class ParseFinished implements Parser<Trade> {

    public Iterable<Trade> parse() {
        System.out.println("Parsing finished");
        return new ArrayList<Trade>();
    }
}
