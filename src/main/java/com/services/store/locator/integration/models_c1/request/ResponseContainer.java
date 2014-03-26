package com.services.store.locator.integration.models_c1.request;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Shibi on 3/26/14.
 */

public abstract class ResponseContainer<T> {

    private Integer count;
    private T payload;

    @XmlElement(name = "count")
    public Integer getCount() {

        return count;
    }

    public void setCount(final Integer count) {

        this.count = count;
    }

    @XmlElement(name = "payload")
    public T getPayload() {
        return this.payload;
    }

    public void setPayload(final T payload) {
        this.payload = payload;
    }
}

