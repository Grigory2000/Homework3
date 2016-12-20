package ru.sbt.bit.ood.hw1;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Григорий on 20.12.2016.
 */

public class TradeJobMain {
    @Autowired
    private final TradesDAO tradesDAO;
    @Autowired
    private Downloader downloader;
    @Autowired
    public Parser parser;

    public TradeJobMain(){ tradesDAO = null;}
    public TradeJobMain(TradesDAO tradesDAO, String fileName, Parser parser, Downloader downloader) {
        this.tradesDAO = tradesDAO;
        this.downloader = downloader;
        this.parser = parser;
    }

    public void run() {
        String filename = downloader.downloadTradesFile();
        Iterable<Trade> tradeRecords = parser.parse();
        updateTrades(tradeRecords);
    }



    private void updateTrades(Iterable<Trade> trades) {
        tradesDAO.deleteAll();
        if(trades != null)
            for (Trade tradeRecord : trades) {
                tradesDAO.save(tradeRecord);
            }
    }
}
