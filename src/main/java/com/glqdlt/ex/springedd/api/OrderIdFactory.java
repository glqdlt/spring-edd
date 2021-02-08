package com.glqdlt.ex.springedd.api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class OrderIdFactory {
    public static OrderId make() {
        UUID zz = UUID.randomUUID();
        return new OrderId(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss")) + zz.toString());
    }
}
