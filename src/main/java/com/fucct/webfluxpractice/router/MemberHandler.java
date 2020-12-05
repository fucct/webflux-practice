package com.fucct.webfluxpractice.router;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class MemberHandler{

    public Mono<ServerResponse> retrieve(ServerRequest serverRequest) {
        return ServerResponse.ok()
            .contentType(MediaType.TEXT_PLAIN)
            .body(BodyInserters.fromValue(new Member(serverRequest.pathVariable("name")).toString()));
    }
}
