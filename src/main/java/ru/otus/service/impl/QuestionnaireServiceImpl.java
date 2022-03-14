package ru.otus.service.impl;

import ru.otus.repository.QuestionnaireRepository;
import ru.otus.service.QuestionnaireService;

// ToDo: lombok: @RequiredArgsConstructor
public class QuestionnaireServiceImpl implements QuestionnaireService {

    private final QuestionnaireRepository questionnaireRepository;

    public QuestionnaireServiceImpl(QuestionnaireRepository questionnaireRepository) {
        this.questionnaireRepository = questionnaireRepository;
    }

    public void studentSurvey() {
        System.out.println("Шарик, - ты балбес!");
    }

}
