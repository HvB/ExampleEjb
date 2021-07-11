package test.eclipsewtp.ejb.facet;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class TestBean {
		
	public TestBean() {
		super();
	}
	
	public String Hello(String name) {
		return "Hello" + name + "!";
	}
}
