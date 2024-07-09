package co.uk.TelegramBOT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

/**
 * TelegramBotApplication is the entry point for the Spring Boot application.
 * It initialises the TelegramBotsApi and registers the Telegram bot.
 */
@SpringBootApplication
public class TelegramBotApplication {

	/**
	 * The main method to start the Spring Boot application and register the Telegram bot.
	 *
	 * @param args command line arguments
	 * @throws TelegramApiException if there is an error initialising the Telegram bot API
	 */
	public static void main(String[] args) throws TelegramApiException {
		SpringApplication.run(TelegramBotApplication.class, args);
		registerTelegramBot();
	}

	/**
	 * Registers the Telegram bot with the TelegramBotsApi.
	 *
	 * @throws TelegramApiException if there is an error registering the bot
	 */
	private static void registerTelegramBot() throws TelegramApiException {
		TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
		telegramBotsApi.registerBot(new TelegramBot());
	}
}
