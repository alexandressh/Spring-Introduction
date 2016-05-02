package edu.fatec.custom;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

public class OAMBeanDefinitionParser implements BeanDefinitionParser{

	@Override
	public BeanDefinition parse(Element element, ParserContext parserCtx) {
		
		String clazz = extractValue(element, "oamClass");
		String id = extractValue(element, "id");
		
		AbstractBeanDefinition definition = BeanDefinitionBuilder
												.rootBeanDefinition(CustomOAM.class)
												.getRawBeanDefinition();
		definition.setBeanClassName(clazz);
		
		parserCtx.getRegistry()
				.registerBeanDefinition(id, definition);
		
		return definition;
	}
	
	private static String extractValue(Element element, String attribute){
		return element.getAttribute(attribute);
	}

}
