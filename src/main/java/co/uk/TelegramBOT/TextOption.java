package co.uk.TelegramBOT;

import java.util.Locale;

/**
 * TextOption is a utility class that provides responses to given questions.
 */
public class TextOption {

    /**
     * Generates a response based on the input question.
     * The question is checked for specific keywords, ignoring case sensitivity.
     *
     * @param question the input question from the user
     * @return the appropriate response based on the question
     */
    public String toResponder(String question) {
        // Ensure case insensitivity by converting the question to lower case
        String lowerCaseQuestion = question.toLowerCase(Locale.ROOT);
        String response;

        if (lowerCaseQuestion.contains("hello")) {
            response = "Hi, I'm a bot!";
        } else if (lowerCaseQuestion.contains("how are you?")) {
            response = "I'm great and you?";
        } else if (lowerCaseQuestion.contains("goodbye")) {
            response = "Goodbye, see you soon";
        } else {
            response = "I did not understand your question";
        }

        return response;
    }
}
