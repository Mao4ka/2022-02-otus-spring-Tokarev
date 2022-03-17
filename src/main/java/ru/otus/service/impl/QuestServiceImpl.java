package ru.otus.service.impl;

import ru.otus.dao.entity.Quest;
import ru.otus.dao.repository.QuestRepository;
import ru.otus.service.QuestService;

import java.util.List;

// ToDo: lombok: @RequiredArgsConstructor
public class QuestServiceImpl implements QuestService {

    private final static String PREFIX = "\n    - ";

    private final QuestRepository questRepository;

    public QuestServiceImpl(QuestRepository questRepository) {
        this.questRepository = questRepository;
    }

    public void studentSurvey() {
        List<Quest> questionnaire = questRepository.getQuestionnaire();

        System.out.println("Checking your erudition: \n");

        questionnaire.forEach(quest -> System.out.println(createOutputMessage(quest)));
    }

    private String createOutputMessage(Quest quest) {
        StringBuilder outputMessage = new StringBuilder(quest.getQuestion());
        outputMessage.append(addPrefix(quest.getAnswer1()));
        outputMessage.append(addPrefix(quest.getAnswer2()));
        outputMessage.append(addPrefix(quest.getAnswer3()));
        outputMessage.append(addPrefix(quest.getAnswer4()));
        outputMessage.append("\n");

        return outputMessage.toString();
    }

    private String addPrefix(String message) {
        return PREFIX + message;
    }
}
