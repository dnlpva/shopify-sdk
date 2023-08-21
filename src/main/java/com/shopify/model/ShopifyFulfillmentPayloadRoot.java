package com.shopify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopifyFulfillmentPayloadRoot {

	private ShopifyFulfillmentPayload fulfillment;

	public ShopifyFulfillmentPayload getFulfillment() {
		return fulfillment;
	}

	public void setFulfillment(ShopifyFulfillmentPayload fulfillment) {
		this.fulfillment = fulfillment;
	}
}
