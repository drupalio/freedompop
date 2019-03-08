package com.freedompop.persons.commons;

public interface Mapper <I,O>{

	public I mapToInner(O outter);
	public O mapToOutter(I inner);
}
