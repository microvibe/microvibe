package io.github.microvibe.util.castor.support;

import io.github.microvibe.util.castor.PrimeCastors;

public class DoubleCastor extends AbstractMarshallableCastor<Double> {
	public DoubleCastor() {
		super(Double.class);
	}

	public DoubleCastor(Class<Double> type) {
		super(type);
	}

	@Override
	public Double castFromBasic(Object orig) {
		return Double.valueOf(PrimeCastors.castToDouble(orig));
	}

	@Override
	public Double fromString(String s) {
		return Double.valueOf(s);
	}

}
