package co.uk.TelegramBOT;

/**
 * TelegramData is a utility class that holds the bot's name and token.
 * These values are retrieved from environment variables.
 */
public class TelegramData {

    /** The bot's username, retrieved from the environment variable BOT_API_TOKEN_RODRIGO. */
    public static final String BOT_NAME = System.getenv("BOT_API_TOKEN_RODRIGO");

    /** The bot's token, retrieved from the environment variable BOT_API_TOKEN_RODRIGO. */
    public static final String BOT_TOKEN = System.getenv("BOT_API_TOKEN_RODRIGO");

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private TelegramData() {
        // Utility class, no instantiation allowed.
    }
}
