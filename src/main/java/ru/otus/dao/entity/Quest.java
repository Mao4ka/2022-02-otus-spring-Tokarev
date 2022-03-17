package ru.otus.dao.entity;

import lombok.Getter;

@Getter
public class Quest {

    private final String question;
    private final String answer1;
    private final String answer2;
    private final String answer3;
    private final String answer4;

    public Quest(String question, String answer1, String answer2, String answer3, String answer4) {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
    }

}
