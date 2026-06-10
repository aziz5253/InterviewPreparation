package spring.ai.SpringAIIntro.service;

import spring.ai.SpringAIIntro.model.Answer;
import spring.ai.SpringAIIntro.model.GetCapitalRequest;
import spring.ai.SpringAIIntro.model.GetCapitalResponse;
import spring.ai.SpringAIIntro.model.Question;

public interface OpenAiService {
    String getAnswer(String question);

    Answer getAnswer(Question question);

    GetCapitalResponse getCapital(GetCapitalRequest getCapitalRequest);

    Answer getCapitalWithInfo(GetCapitalRequest getCapitalRequest);

}
