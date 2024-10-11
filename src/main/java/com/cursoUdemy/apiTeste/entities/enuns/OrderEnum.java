package com.cursoUdemy.apiTeste.entities.enuns;

public enum OrderEnum {
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);

	private int code ;
	private OrderEnum (int code) {
		this.code = code;
		
	}

	public int getCode () {
		return code;
	} 


	public static OrderEnum valueOf(int code) {
		for (OrderEnum value: OrderEnum.values()) {
			if (value.getCode() ==  code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid Order Enum code");
	}

}







