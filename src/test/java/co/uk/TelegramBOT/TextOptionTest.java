package co.uk.TelegramBOT;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextOptionTest {

    @Test
    public void testToResponder() {
        TextOption textOption = new TextOption();

        String responseHello = textOption.toResponder("Hello");
        assertEquals("Hi, I'm a bot!", responseHello, "Unexpected response for 'Hello'");

        String responseHowAreYou = textOption.toResponder("How are you?");
        assertEquals("I'm great and you?", responseHowAreYou, "Unexpected response for 'How are you?'");

        String responseGoodbye = textOption.toResponder("Goodbye");
        assertEquals("Goodbye, see you soon", responseGoodbye, "Unexpected response for 'Goodbye'");

        String responseUnknown = textOption.toResponder("What's up?");
        assertEquals("I did not understand your question", responseUnknown, "Unexpected response for unknown question");
    }
}