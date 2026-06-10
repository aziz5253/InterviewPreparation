package spring.ai.SpringAIIntro.service;



import org.junit.jupiter.api.Test;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.model.Generation;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class OpenAiServiceImplTest {

    @Autowired
    private OpenAiServiceImpl service;

    @MockitoBean
    private ChatModel chatModel;

    @Test
    void getAnswer() {

        // ✅ Mock response structure (important)

        // ✅ Create assistant message
        var output = new org.springframework.ai.chat.messages.AssistantMessage("42");

        // ✅ Create generation using builder
        Generation generation = new Generation(output);

        ChatResponse chatResponse = new ChatResponse(List.of(generation));

        // ✅ Mock ChatModel behavior
    /*    when(chatModel.call(any(Prompt.class)))
                .thenReturn(chatResponse);*/

        // ✅ Call service
        String answer = service.getAnswer("What is the meaning of life?");

        System.out.println(answer);

        // ✅ Assertion
        assertEquals("42", answer);

        System.out.println(answer);
    }
}
