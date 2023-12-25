package ru.markethub.wildberries.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import ru.markethub.wildberries.dto.WildberriesRequest;
import ru.markethub.wildberries.dto.WildberriesResponse;
import ru.markethub.wildberries.service.WildberriesService;

@RestController
@RequestMapping("wildberries")
public class WildberriesController {
    private final WildberriesService wildberriesService;

    public WildberriesController(WildberriesService wildberriesService) {
        this.wildberriesService = wildberriesService;
    }

    @PostMapping("/analytics")
    public Mono<ResponseEntity<WildberriesResponse>> getAnalyticsData(@RequestBody WildberriesRequest request){
        return wildberriesService.getAnalyticsData(request)
                .map(response -> ResponseEntity.ok().body(response))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }
}
