package io.github.microvibe.util.castor.support;

import io.github.microvibe.util.castor.ArrayCastors;

@SuppressWarnings({ "unchecked" })
public class AnyArrayCastor<T> extends AbstractCastor<T> {

	public AnyArrayCastor(Class<T> type) {
		super(type);
	}

	@Override
	public final T cast(Object orig) {
		if (orig == null) {
			return null;
		}
		Class<T> type = this.type;
		if (type.getClass() == orig.getClass()) {
			return (T) orig;
		}
		return (T) ArrayCastors.castToArray(type, orig);
	}

}
