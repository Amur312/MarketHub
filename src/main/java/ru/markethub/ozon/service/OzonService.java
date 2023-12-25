package ru.markethub.ozon.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import ru.markethub.ozon.dto.ProductListRequestDto;
import ru.markethub.ozon.dto.ProductListResponseDto;

@Service
public class OzonService {
    private final WebClient webClient;
    public OzonService(WebClient webClient) {
        this.webClient = webClient;
    }
    public ProductListResponseDto getProducts(ProductListRequestDto requestDto){
        return webClient.post()
               .uri("/v2/product/list")
               .body(BodyInserters.fromValue(requestDto))
               .retrieve()
               .bodyToMono(ProductListResponseDto.class)
               .block();
    }
}
