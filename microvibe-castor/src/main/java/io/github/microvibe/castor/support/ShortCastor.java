package io.github.microvibe.castor.support;

import io.github.microvibe.castor.PrimeCastors;

public class ShortCastor extends AbstractMarshallableCastor<Short> {
	public ShortCastor() {
		super(Short.class);
	}

	public ShortCastor(Class<Short> type) {
		super(type);
	}

	@Override
	public Short castFromBasic(Object orig) {
		return Short.valueOf(PrimeCastors.castToShort(orig));
	}

	@Override
	public Short fromString(String s) {
		return Short.valueOf(s);
	}

}
