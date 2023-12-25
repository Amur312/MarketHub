package ru.markethub.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    public WebClient ozonWebClient() {
        return WebClient.builder()
                .baseUrl("https://api-seller.ozon.ru") // Основной URL для API OZON
                .defaultHeader("Client-Id", "<1600007>") // Установите ваш Client-Id
                .defaultHeader("Api-Key", "<a1909e84-7876-4f56-8df7-b4d0ddd0cc93>") // Установите ваш Api-Key
                .defaultHeader("Content-Type", "application/json")
                .build();
    }
}