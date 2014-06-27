package cdi.util;
import javax.enterprise.inject.Alternative;
@Alternative
public class SecondStringGen implements StringGenerator {

	@Override
	public String getString() {
		return "Second impl";
	}

}
