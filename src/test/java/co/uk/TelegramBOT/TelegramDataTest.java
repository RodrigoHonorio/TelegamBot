package co.uk.TelegramBOT;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelegramDataTest {

    @Test
    public void testBotNameAndToken() {
        String botName = TelegramData.BOT_NAME;
        String botToken = TelegramData.BOT_TOKEN;

        assertNotNull(botName, "BOT_NAME is null");
        assertNotNull(botToken, "BOT_TOKEN is null");
    }
}