package spring.ai.SpringAIIntro.service;



import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.converter.BeanOutputConverter;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import spring.ai.SpringAIIntro.model.Answer;
import spring.ai.SpringAIIntro.model.GetCapitalRequest;

import org.springframework.beans.factory.annotation.Value;
import spring.ai.SpringAIIntro.model.GetCapitalResponse;
import spring.ai.SpringAIIntro.model.Question;

import java.util.Map;
import java.util.Objects;

@Service
public class OpenAiServiceImpl implements OpenAiService{

    private final ChatModel chatModel;

    public OpenAiServiceImpl(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @Value("classpath:templates/get-capital-prompt.st")
    private Resource getCapitalPrompt;

    @Value("classpath:templates/get-capital-with-info.st")
    private Resource getCapitalPromptWithInfo;



    @Override
    public Answer getCapitalWithInfo(GetCapitalRequest getCapitalRequest) {
        PromptTemplate promptTemplate = new PromptTemplate(getCapitalPromptWithInfo);
        Prompt prompt = promptTemplate.create(Map.of("stateOrCountry", getCapitalRequest.stateOrCountry()));
        ChatResponse response = chatModel.call(prompt);

        return new Answer(response.getResult().getOutput().getText());
    }
    @Override
    public GetCapitalResponse getCapital(GetCapitalRequest getCapitalRequest) {
        BeanOutputConverter<GetCapitalResponse> converter = new BeanOutputConverter<>(GetCapitalResponse.class);
        String format = converter.getFormat();

        PromptTemplate promptTemplate = new PromptTemplate(getCapitalPrompt);
        Prompt prompt = promptTemplate.create(Map.of("stateOrCountry", getCapitalRequest.stateOrCountry(),
                "format", format));

        ChatResponse response = chatModel.call(prompt);

        return converter.convert(Objects.requireNonNull(response.getResult().getOutput().getText()));
    }

    @Override
    public String getAnswer(String question) {
        try {
            PromptTemplate promptTemplate = new PromptTemplate(question);
            Prompt prompt = promptTemplate.create();

            System.out.println("Calling OpenAI...");
            ChatResponse response = chatModel.call(prompt);

            System.out.println("Response object: " + response);

            if (response == null) {
                return "Response is NULL (API call failed)";
            }

            if (response.getResult() == null) {
                return "Result is NULL in response";
            }

            if (response.getResult().getOutput() == null) {
                return "Output is NULL in response";
            }

            String text = response.getResult().getOutput().getText();
            System.out.println("AI Response: " + text);

            return text;

        } catch (Exception e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
    }



    @Override
    public Answer getAnswer(Question question) {
        PromptTemplate promptTemplate = new PromptTemplate(question.question());
        Prompt prompt = promptTemplate.create();
        ChatResponse response = chatModel.call(prompt);

        return new Answer(response.getResult().getOutput().getText());
    }
}
