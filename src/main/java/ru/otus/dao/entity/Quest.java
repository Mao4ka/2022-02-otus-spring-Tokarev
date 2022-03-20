package ru.otus.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Quest {

    private final String question;
    private final String answer1;
    private final String answer2;
    private final String answer3;
    private final String answer4;

}
