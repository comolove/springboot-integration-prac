package com.example.integrationPrac.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PracDTO {
    private String content;

    public PracDTO(String content) {
        this.content = content;
    }
}
