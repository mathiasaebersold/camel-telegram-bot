# Spring Boot Camel Telegram Bot
Telegram bot implemented using Apache Camel with Quarkus.


## Function
The bot simply repeats all incoming messages:

Message form user: `hello`

Response from bot: `Your message is: hello`

## Setup
1. Create a new bot by messaging `@BotFather` on Telegram
2. Copy the access token and make it available to this application using the environment variable `TELEGRAM_AUTHORIZATION_TOKEN`