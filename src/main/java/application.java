import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.service.QuestService;

public class application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");

        QuestService questService = context.getBean(QuestService.class);
        questService.studentSurvey();
    }
}
