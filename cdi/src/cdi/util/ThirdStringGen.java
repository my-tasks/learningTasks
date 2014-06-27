package cdi.util;

import cdi.qualifiers.PrimaryGen;

@PrimaryGen
public class ThirdStringGen implements StringGenerator {

	@Override
	public String getString() {
		return "Third impl";
	}

}
