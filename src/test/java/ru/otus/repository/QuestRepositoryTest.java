package ru.otus.repository;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.otus.dao.entity.Quest;
import ru.otus.dao.repository.QuestRepository;

import java.util.List;

import static org.junit.Assert.assertEquals;

@Ignore
/**
 * очень усталю потомю в следующей версии с нормальной конфигурацией через анноташки
 */
public class QuestRepositoryTest {

    @Autowired
    public QuestRepository questRepository;

    @Test
    public void testGetQuestionnaire() {

        List<Quest> quest = questRepository.getQuestionnaire();

        assertEquals(5,quest.size());
    }

}