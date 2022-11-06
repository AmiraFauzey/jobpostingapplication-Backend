package com.jobposting.jobpostingapplication.util;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;

import reactor.core.publisher.Mono;

@Component
public class AddResponseHeaderFilter implements WebFilter {

    @EventListener(ApplicationReadyEvent.class)
    public void test() {
        System.out.println("HELLO BEAUTIFUL");
    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
        System.out.println("HELLO");
        exchange.getResponse()
                .getHeaders()
                .add("Access-Control-Allow-Origin", "*");
        return chain.filter(exchange);
    }
}