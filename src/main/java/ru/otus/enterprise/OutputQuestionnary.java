package ru.otus.enterprise;

import ru.otus.dao.entity.Quest;

import java.util.List;

public class OutputQuestionnary {

    private final static String PREFIX = "\n    - ";

    public void printQuestionnaire(List<Quest> questionnaire) {
        questionnaire.forEach(quest -> System.out.println(createOutputMessage(quest)));
    }

    private String createOutputMessage(Quest quest) {
        return quest.getQuestion() +
                addPrefix(quest.getAnswer1()) +
                addPrefix(quest.getAnswer2()) +
                addPrefix(quest.getAnswer3()) +
                addPrefix(quest.getAnswer4()) +
                "\n";
    }

    private String addPrefix(String message) {
        return PREFIX + message;
    }
}
