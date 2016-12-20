package ru.sbt.bit.ood.hw1;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Григорий on 20.12.2016.
 */

public class TradeJobMain {
    private final TradeUpdater updater;

    private final Downloader downloader;
    private final Parser parser;

    public TradeJobMain(TradeUpdater updater, Parser parser, Downloader downloader) {
        this.downloader = downloader;
        this.parser = parser;
        this.updater = updater;
    }

    public void run() {
        String filename = downloader.downloadTradesFile();
        Iterable<Trade> tradeRecords = parser.parse();
        updater.updateTrades(tradeRecords);
    }

}
