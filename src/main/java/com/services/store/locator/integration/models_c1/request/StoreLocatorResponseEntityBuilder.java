package com.services.store.locator.integration.models_c1.request;

import com.services.store.locator.integration.models_c1.RESTStoreLocator;
import com.services.store.locator.integration.models_c1.RESTStoreLocatorResponse;

import java.util.List;

/**
 * Created by Shibi on 3/26/14.
 */
public class StoreLocatorResponseEntityBuilder extends AbstractResponseEntityBuilder {

    public StoreLocatorResponseEntityBuilder(final ResponseContainer container) {

        super(container);
    }

    public static StoreLocatorResponseEntityBuilder create() {

        return new StoreLocatorResponseEntityBuilder(new RESTStoreLocatorResponseContainer());
    }


    public StoreLocatorResponseEntityBuilder payload(final List<RESTStoreLocator> stores, final int count) {

        final int offset = (stores == null || stores.isEmpty()) ? 0 : 1;

        super.count(count);

        final RESTStoreLocatorResponse storeLocatorResponsePayload = new RESTStoreLocatorResponse.RESTStoreLocatorResponseBuilder().stores(stores).build();

        super.payload(storeLocatorResponsePayload);

        return this;
    }

}
