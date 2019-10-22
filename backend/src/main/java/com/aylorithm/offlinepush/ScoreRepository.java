package com.aylorithm.offlinepush;

import reactor.core.publisher.Flux;

public interface ScoreRepository {
    public Flux<Score> findAll();
}
