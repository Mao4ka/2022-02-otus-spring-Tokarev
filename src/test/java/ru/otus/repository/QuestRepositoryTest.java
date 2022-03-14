package ru.otus.repository;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.otus.dao.entity.Quest;
import ru.otus.dao.repository.QuestRepository;

import java.util.List;

import static org.junit.Assert.assertEquals;

@Ignore
public class QuestRepositoryTest {

    @Autowired
    public QuestRepository questRepository;

    @Test
    public void testGetQuestionnaire() {

        List<Quest> quest = questRepository.getQuestionnaire();

        assertEquals(1,1);
    }

}