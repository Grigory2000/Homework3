package ru.sbt.bit.ood.hw1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.sbt.bit.ood.hw1.Downloader;
import ru.sbt.bit.ood.hw1.DownloadFinished;
import ru.sbt.bit.ood.hw1.Parser;
import ru.sbt.bit.ood.hw1.ParseFinished;

/**
 * Created by Григорий on 20.12.2016.
 */

@Configuration
public class AppConfiguration {
    @Qualifier("parser")
    @Bean
    public Parser parser(){
        return new ParseFinished();
    }

    @Qualifier("downloader")
    @Bean
    public Downloader downloader(){
        return new DownloadFinished();
    }

    @Qualifier("job")
    @Bean
    public TradeJobMain tradeJobMain(){
        return new TradeJobMain();
    }

    @Qualifier("dao")
    @Bean TradesDAO tradesDAO(){
        return  new TradesDAO();
    }
}
