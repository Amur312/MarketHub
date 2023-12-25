package ru.markethub.wildberries.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import ru.markethub.wildberries.dto.WildberriesRequest;
import ru.markethub.wildberries.dto.WildberriesResponse;

@Service
public class WildberriesService {
    private final WebClient webClient;

    public WildberriesService(WebClient webClient) {
        this.webClient = webClient;
    }
    public Mono<WildberriesResponse> getAnalyticsData(WildberriesRequest request) {
        return webClient.post()
                .uri("/content/v1/analytics/nm-report/detail")
                .bodyValue(request)
                .retrieve()
                .bodyToMono(WildberriesResponse.class);
    }
}
