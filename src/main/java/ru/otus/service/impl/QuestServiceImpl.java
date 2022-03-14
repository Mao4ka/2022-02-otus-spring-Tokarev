package ru.otus.service.impl;

import ru.otus.dao.entity.Quest;
import ru.otus.dao.repository.QuestRepository;
import ru.otus.service.QuestService;

import java.util.List;

// ToDo: lombok: @RequiredArgsConstructor
public class QuestServiceImpl implements QuestService {

    private final QuestRepository questRepository;

    public QuestServiceImpl(QuestRepository questRepository) {
        this.questRepository = questRepository;
    }

    public void studentSurvey() {
        System.out.println("Шарик, - ты балбес!");
        List<Quest> questionnaire = questRepository.getQuestionnaire();

        questionnaire.stream().forEachOrdered(quest -> System.out.println(quest.getQuestion().toString()));

        //System.out.println(questionnaire.getQuestion());
    }

}
