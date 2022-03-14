package ru.otus.repository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.otus.dao.Questionnaire;

import static org.junit.Assert.assertEquals;

public class QuestionnaireRepositoryTest {

    @Autowired
    public QuestionnaireRepository questionnaireRepository;

    @Test
    public void testGetQuestionnaire() {

        Questionnaire questionnaire = questionnaireRepository.getQuestionnaire();

        assertEquals(1,1);
    }

}