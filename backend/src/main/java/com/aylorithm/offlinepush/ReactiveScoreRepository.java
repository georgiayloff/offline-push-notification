package com.aylorithm.offlinepush;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

@Repository
public class ReactiveScoreRepository implements ScoreRepository {
    @Override
    public Flux<Score> findAll() {
        return Flux.interval(Duration.ofSeconds(5))
                .onBackpressureBuffer()
                .map(this::generateScore)
                .flatMapIterable(x -> x);
    }

    private List<Score> generateScore(long interval) {
        Score sc = new Score("FC Barcelona", "Real Madrid", "5:0", "Messi scored");

        return Arrays.asList(sc);
    }
}
