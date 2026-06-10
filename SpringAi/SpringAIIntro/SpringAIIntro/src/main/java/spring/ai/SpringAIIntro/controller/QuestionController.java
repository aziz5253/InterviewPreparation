package spring.ai.SpringAIIntro.controller;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import spring.ai.SpringAIIntro.model.Answer;
import spring.ai.SpringAIIntro.model.GetCapitalRequest;
import spring.ai.SpringAIIntro.model.Question;
import spring.ai.SpringAIIntro.service.OpenAiService;

/**
 * Created by jt, Spring Framework Guru.
 */
@RestController
public class QuestionController {
    private final OpenAiService openAIService;

    public QuestionController(OpenAiService openAIService) {
        this.openAIService = openAIService;
    }

  /*  @PostMapping("/capital")
    public Answer getCapital(@RequestBody GetCapitalRequest getCapitalRequest) {
        return this.openAIService.getCapital(getCapitalRequest);
    }*/

    @PostMapping("/ask")
    public Answer askQuestion(@RequestBody Question question) {
        return openAIService.getAnswer(question);
    }

    @PostMapping("/capitalWithInfo")
    public Answer getCapitalWithInfo(@RequestBody GetCapitalRequest getCapitalRequest) {
        return this.openAIService.getCapitalWithInfo(getCapitalRequest);
    }


}
