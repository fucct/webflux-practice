package com.fucct.webfluxpractice.router;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class Router {

    @Bean
    public RouterFunction<ServerResponse> route(MemberHandler memberHandler) {
        return RouterFunctions
            .route(
                GET("/members/{name}").and(accept(MediaType.APPLICATION_JSON)),
                memberHandler::retrieve);

    }
}
