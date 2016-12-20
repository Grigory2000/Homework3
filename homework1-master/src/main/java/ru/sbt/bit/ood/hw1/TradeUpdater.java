package ru.sbt.bit.ood.hw1;

/**
 * Created by Григорий on 21.12.2016.
 */
public class TradeUpdater {
    private final TradesDAO tradesDAO;

    public TradeUpdater(TradesDAO tradesDAO) {
        this.tradesDAO = tradesDAO;
    }

    public void updateTrades(Iterable<Trade> trades) {
        tradesDAO.deleteAll();
        if(trades != null)
            for (Trade tradeRecord : trades) {
                tradesDAO.save(tradeRecord);
            }
    }
}

