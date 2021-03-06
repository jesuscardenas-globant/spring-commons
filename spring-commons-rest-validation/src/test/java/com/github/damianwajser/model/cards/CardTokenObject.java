package com.github.damianwajser.model.cards;

import com.github.damianwajser.validator.annotation.cards.CardToken;

public class CardTokenObject {

	@CardToken(provider = CardToken.Tokenizer.TOKEN_EX, message = "some message", businessCode = "c-400")
	private String value;

	public CardTokenObject() {
	}

	public CardTokenObject(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
