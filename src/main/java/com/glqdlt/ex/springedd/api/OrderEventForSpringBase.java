package com.glqdlt.ex.springedd.api;

import org.springframework.context.ApplicationEvent;

import java.time.LocalDateTime;

public abstract class OrderEventForSpringBase<P> extends ApplicationEvent implements MyCompOrderEvent<P> {
    private final P payload;
    private final OrderId id;
    private String[] receiveAlias = {};
    private final LocalDateTime eventCreateTime = LocalDateTime.now();

    @Override
    public final LocalDateTime getEventCreateTime() {
        return eventCreateTime;
    }

    public OrderEventForSpringBase(OrderId id, P payload) {
        super(payload);
        this.payload = payload;
        this.id = id;
    }

    public OrderEventForSpringBase(OrderId id, P payload, String[] receiveAlias) {
        this(id, payload);
        this.receiveAlias = receiveAlias;
    }

    @Override
    public final OrderId getEventId() {
        return id;
    }

    @Override
    public final String[] getReceiveAlias() {
        return receiveAlias;
    }

    @Override
    public final P getPayload() {
        return payload;
    }
}
