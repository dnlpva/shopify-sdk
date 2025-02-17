package com.shopify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopifyUpdateFulfillmentPayloadRoot {

	private ShopifyUpdateFulfillmentPayload fulfillment;

	public ShopifyUpdateFulfillmentPayload getFulfillment() {
		return fulfillment;
	}

	public void setFulfillment(ShopifyUpdateFulfillmentPayload fulfillment) {
		this.fulfillment = fulfillment;
	}
}
