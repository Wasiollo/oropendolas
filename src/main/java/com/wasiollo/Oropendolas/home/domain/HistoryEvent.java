package com.wasiollo.Oropendolas.home.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class HistoryEvent {
    @Id
    private String id;
    private String name;
    private String description;
    private String imgUrl;

    public HistoryEvent(String name, String description, String imgUrl) {
        this.name = name;
        this.description = description;
        this.imgUrl = imgUrl;
    }
}
