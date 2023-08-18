package com.shopify.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ShopifyLocationRoot {

	private ShopifyLocation location;

	public ShopifyLocation getLocation() {
		return location;
	}

	public void setLocations(final ShopifyLocation location) {
		this.location = location;
	}

}
