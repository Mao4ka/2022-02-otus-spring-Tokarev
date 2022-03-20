package ru.otus.application;

import lombok.AllArgsConstructor;
import ru.otus.dao.entity.Quest;
import ru.otus.dao.repository.QuestRepository;
import ru.otus.enterprise.OutputQuestionnary;

import java.util.List;

@AllArgsConstructor
public class Application {

    private final QuestRepository questRepository;
    private final OutputQuestionnary outputQuestionnary;

    public void studentSurvey() {
        List<Quest> questionnaire = questRepository.getQuestionnaire();
        System.out.println("Checking your erudition: \n");
        outputQuestionnary.printQuestionnaire(questionnaire);
    }

}
