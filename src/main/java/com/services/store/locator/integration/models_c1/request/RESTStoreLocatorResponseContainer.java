package com.services.store.locator.integration.models_c1.request;

import com.services.store.locator.integration.models_c1.RESTStoreLocatorResponse;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * Created by Shibi on 3/26/14.
 */
@XmlRootElement(name = "storeLocatorResponse")
@XmlSeeAlso({RESTStoreLocatorResponse.class})
public class RESTStoreLocatorResponseContainer<T> extends ResponseContainer<T> {
}
