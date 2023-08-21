package com.shopify.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopifyFulfillmentOrderMoveRequestRoot {

	@XmlElement(name = "fulfillment_order")
	private ShopifyFulfillmentOrderMoveLocationPayload fulfillmentOrder;

	public ShopifyFulfillmentOrderMoveLocationPayload getFulfillmentOrder() {
		return fulfillmentOrder;
	}

	public void setFulfillmentOrder(ShopifyFulfillmentOrderMoveLocationPayload fulfillmentOrder) {
		this.fulfillmentOrder = fulfillmentOrder;
	}

}