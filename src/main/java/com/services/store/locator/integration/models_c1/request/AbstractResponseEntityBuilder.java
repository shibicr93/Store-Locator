package com.services.store.locator.integration.models_c1.request;

/**
 * Created by Shibi on 3/26/14.
 */
public abstract class AbstractResponseEntityBuilder<T extends AbstractResponseEntityBuilder> {
    protected ResponseContainer responseContainer;

    protected AbstractResponseEntityBuilder(final ResponseContainer container) {
        responseContainer = container;
    }


    /**
     * Sets the total number of objects returned by a search
     *
     * @param count
     * @return The builder instance
     */
    public T count(final Integer count) {

        responseContainer.setCount(count);
        return (T) this;
    }


    /**
     * The main body of the response
     *
     * @param payload
     * @return The builder instance
     */
    public T payload(final Object payload) {

        responseContainer.setPayload(payload);

        return (T) this;
    }

    /**
     * Build the response container using the parameters specified
     *
     * @return
     */
    public ResponseContainer build() {

        return this.responseContainer;
    }


}
