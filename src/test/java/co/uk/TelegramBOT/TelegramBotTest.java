package co.uk.TelegramBOT;

import org.junit.jupiter.api.Test;
import org.telegram.telegrambots.meta.api.objects.Update;


import static org.junit.jupiter.api.Assertions.*;

public class TelegramBotTest {

    @Test
    public void testTelegramBotOnUpdateReceived() {
        Update update = new Update();

        TelegramBot bot = new TelegramBot();
        assertDoesNotThrow(() -> bot.onUpdateReceived(update), "Exception thrown in onUpdateReceived");
    }
}
