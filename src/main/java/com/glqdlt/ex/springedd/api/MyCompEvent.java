package com.glqdlt.ex.springedd.api;

import java.time.LocalDateTime;

public interface MyCompEvent<ID, P> {
    String getEventMessage();

    ID getEventId();

    P getPayload();

    String[] getReceiveAlias();

    default Boolean isCallMe(String myAlias) {
        if (getReceiveAlias().length == 0) {
            return true;
        }

        for (String r : getReceiveAlias()) {
            if (r.equals(myAlias)) {
                return true;
            }
        }
        return false;
    }

    LocalDateTime getEventCreateTime();
}
