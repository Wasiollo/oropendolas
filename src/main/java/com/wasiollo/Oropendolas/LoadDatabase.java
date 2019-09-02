package com.wasiollo.Oropendolas;

import com.wasiollo.Oropendolas.home.dao.HistoryEventDao;
import com.wasiollo.Oropendolas.home.domain.HistoryEvent;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner init(HistoryEventDao historyEventDao) {
        return args -> {
            Flux.just(
                    new HistoryEvent("Witam", "Witam w aplikacji", null),
                    new HistoryEvent("Nowy Tournament", "Powstał nowy tournament", null),
                    new HistoryEvent("Wyniki Tournamentu", "Wygrał abcd", null))
                    .flatMap(historyEventDao::save)
                    .subscribe(System.out::println);
        };
    }
}
