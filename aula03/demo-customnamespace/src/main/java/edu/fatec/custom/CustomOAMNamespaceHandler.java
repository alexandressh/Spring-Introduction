package edu.fatec.custom;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class CustomOAMNamespaceHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("oam", new OAMBeanDefinitionParser());
	}
	
}
