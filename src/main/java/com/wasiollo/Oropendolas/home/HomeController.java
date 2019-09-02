package com.wasiollo.Oropendolas.home;

import com.wasiollo.Oropendolas.home.dao.HistoryEventDao;
import com.wasiollo.Oropendolas.home.domain.HistoryEvent;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/home")
@AllArgsConstructor
public class HomeController {

    private final HistoryEventDao historyEventDao;

    @GetMapping("/events")
    public Flux<HistoryEvent> listEvents() {
        return historyEventDao.findAll();
    }
}
