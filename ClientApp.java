package in.abc.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.abc.bean.A;
import in.abc.bean.B;

public class ClientApp {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("in/abc/cfg/applicationContext.xml");
				
		A a = factory.getBean("a1", A.class);
		B b = factory.getBean("b1", B.class);
		
		System.out.println(a);
		System.out.println(b);
		
		
	}
}
