package ch.mathiasaebersold.springbootcameltelegrambot.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class TelegramRoutes extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("telegram:bots")
                .routeId("telegram-bot-consumer")
                .log("Incoming message: ${body}")
                .setBody(simple("Your message is: ${body}"))
                .to("telegram:bots")
                .log("Outgoing message: ${body}");
    }
}