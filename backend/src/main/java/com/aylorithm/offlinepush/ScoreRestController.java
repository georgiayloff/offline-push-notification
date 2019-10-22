package com.aylorithm.offlinepush;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ScoreRestController {

    @Autowired
    private ScoreRepository scoreRepository;

    @GetMapping(path = "/scores", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Score> feed() {
        return this.scoreRepository.findAll();
    }

}
