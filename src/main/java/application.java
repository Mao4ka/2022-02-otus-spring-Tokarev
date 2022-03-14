import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.service.QuestionnaireService;

public class application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");

        QuestionnaireService questionnaireService = context.getBean(QuestionnaireService.class);
        questionnaireService.studentSurvey();
    }
}
