package com.wasiollo.Oropendolas.home.dao;

import com.wasiollo.Oropendolas.home.domain.HistoryEvent;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface HistoryEventDao extends ReactiveCrudRepository<HistoryEvent, String> {
}
