package cdi.util;

import javax.enterprise.inject.Alternative;


public class FirstStringGen implements StringGenerator {

	@Override
	public String getString() {
		return "First impl";
	}

}
