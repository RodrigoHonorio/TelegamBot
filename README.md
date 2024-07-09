
# Telegram Bot Project

**Welcome to the Telegram Bot Project!** This repository provides a comprehensive guide on creating a Telegram bot using the `TelegramBot` class and `TelegramBotApplication` class in Java. Follow the steps below to create your own Telegram bot and understand the functionality of each class in the project.

## Getting Started

### Step 1: Create a Bot with BotFather

1. **Open Telegram and search for BotFather.**
2. **Start a conversation with BotFather by clicking the "Start" button.**
3. **Create a new bot by sending the command** `/newbot`.
4. **Follow the instructions to set the bot's name and username.**
5. **You will receive a token for your bot. Save this token as it will be used later.

### Step 2: Set Up the Project

1. **Clone the repository:**
   ```sh
   git clone https://github.com/yourusername/telegram-bot-project.git
Navigate to the project directory:
sh
Copiar código
cd telegram-bot-project
Set up environment variables for the bot:
BOT_NAME: The username of your bot.
BOT_TOKEN: The token provided by BotFather.
Step 3: Understand the Project Structure
TelegramBot.java
Handles incoming updates from Telegram and processes messages.
Extends TelegramLongPollingBot to receive and process messages.
Key Methods:

getBotUsername(): Retrieves the bot's username from TelegramData.
getBotToken(): Retrieves the bot's token from TelegramData.
onUpdateReceived(Update update): Processes incoming messages and sends appropriate responses.
Processes text messages to provide responses based on keywords.
Handles voice messages by sending a response indicating no support for voice messages.
createSendMessage(String chatId, String text): Creates a SendMessage object with the specified chat ID and text.
sendMessage(SendMessage message): Sends a message using the execute method from the parent class.
TelegramBotApplication.java
The entry point for the Spring Boot application.
Initialises TelegramBotsApi and registers the Telegram bot.
Key Methods:

main(String[] args): Starts the Spring Boot application and registers the Telegram bot.
registerTelegramBot(): Registers the bot with TelegramBotsApi.
TelegramData.java
Utility class that holds the bot's name and token.
Retrieves values from environment variables.
Key Variables:

BOT_NAME: The bot's username.
BOT_TOKEN: The bot's token.
TextOption.java
Utility class that provides responses to given questions.
Key Methods:

toResponder(String question): Generates a response based on the input question.
Checks for specific keywords such as "hello", "how are you?", and "goodbye".
Provides appropriate responses based on the question.
Step 4: Build and Run the Project
Ensure you have Maven installed.
Build the project:
sh
Copiar código
mvn clean install
Run the Spring Boot application:
sh
Copiar código
mvn spring-boot:run
Conclusion
You have successfully created a Telegram bot using Java and Spring Boot. This bot can receive and respond to text messages based on predefined keywords. Feel free to expand the functionality and improve the bot as per your requirements.

Happy coding!
