package com.lyt.designpatterns.abstractfactory.example3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.xpath.XPath;

public class ClassPathXmlApplicationContext implements BeanFactory {
    
    private Map<String, Object> container = new HashMap<>();
    
    @SuppressWarnings("unchecked")
    public ClassPathXmlApplicationContext(String fileName) throws Exception {
        SAXBuilder saxBuilder = new SAXBuilder();
        Document doc = saxBuilder.build(this.getClass().getClassLoader().getResourceAsStream(fileName));
        Element root = doc.getRootElement();
        List<Element> list = XPath.selectNodes(root, "/beans/bean");
        
        for (int i = 0; i < list.size(); i++) {
            Element bean = list.get(i);
            String id = bean.getAttributeValue("id");
            String clazz = bean.getAttributeValue("class");
            Object obj = Class.forName(clazz).newInstance();
            container.put(id, obj);
            System.out.println("add bean " + id + " - " + clazz);
        }
        
    }
    
    @Override
    public Object getBean(String id) {
        
        return container.get(id);
    }
    
}
