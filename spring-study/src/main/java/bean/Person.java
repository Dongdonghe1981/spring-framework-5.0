package bean;

import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.util.StringValueResolver;

public class Person implements EmbeddedValueResolverAware {
	@Override
	public void setEmbeddedValueResolver(StringValueResolver resolver) {
		//String s = resolver.resolveStringValue("Hello! ${os.name},I'm #{2*20} years old!")
	}


}
