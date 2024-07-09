package co.uk.TelegramBOT;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

/**
 * TelegramBot is a class that handles incoming updates from a Telegram bot.
 * It extends the TelegramLongPollingBot to receive and process messages.
 */
public class TelegramBot extends TelegramLongPollingBot {

    /**
     * Gets the bot username from the TelegramData class.
     *
     * @return the bot username.
     */
    @Override
    public String getBotUsername() {
        return TelegramData.BOT_NAME;
    }

    /**
     * Gets the bot token from the TelegramData class.
     *
     * @return the bot token.
     */
    @Override
    public String getBotToken() {
        return TelegramData.BOT_TOKEN;
    }

    /**
     * This method is called when an update is received from Telegram.
     * It processes text and voice messages and sends appropriate responses.
     *
     * @param update the update received from Telegram.
     */
    @Override
    public void onUpdateReceived(Update update) {
        SendMessage message = null;

        if (update.hasMessage()) {
            String chatId = update.getMessage().getChatId().toString();

            if (update.getMessage().hasText()) {
                String question = update.getMessage().getText();
                String response = new TextOption().toResponder(question);
                message = createSendMessage(chatId, response);
            } else if (update.getMessage().hasVoice()) {
                message = createSendMessage(chatId, "No voice message support");
            }
        }

        if (message != null) {
            sendMessage(message);
        }
    }

    /**
     * Creates a SendMessage object with the specified chat ID and text.
     *
     * @param chatId the chat ID to send the message to.
     * @param text the text to send.
     * @return the SendMessage object.
     */
    private SendMessage createSendMessage(String chatId, String text) {
        return SendMessage.builder()
                .chatId(chatId)
                .text(text)
                .build();
    }

    /**
     * Sends a message using the execute method of the parent class.
     *
     * @param message the SendMessage object to send.
     */
    private void sendMessage(SendMessage message) {
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
