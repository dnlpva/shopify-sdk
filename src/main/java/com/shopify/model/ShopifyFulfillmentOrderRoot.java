package com.shopify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopifyFulfillmentOrderRoot {

	@XmlElement(name = "fulfillment_order")
	private ShopifyFulfillmentOrder fulfillmentOrder;

	public ShopifyFulfillmentOrder getFulfillmentOrder() {
		return fulfillmentOrder;
	}

	public void setFulfillmentOrder(ShopifyFulfillmentOrder fulfillmentOrder) {
		this.fulfillmentOrder = fulfillmentOrder;
	}
}
