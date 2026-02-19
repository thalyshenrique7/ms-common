package com.ms.common.infrastructure.messaging.event;

public class StockFailedEvent {

	private Long orderId;

	public Long getOrderId() {

		return orderId;
	}

	public void setOrderId(Long orderId) {

		this.orderId = orderId;
	}
}
