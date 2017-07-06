package com.itcast.myspring;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
* @author 叶林生 
* @date：2017年7月4日 下午10:01:02
* @version 1.0
* 
*/
public class ClassPathXmlApplicationContext2 implements BeanFactory {
	
	private Map<String, Object> beans = new HashMap<>();
	
	@SuppressWarnings("unchecked")
	public ClassPathXmlApplicationContext2(String source) {
		 SAXReader reader = new SAXReader();
	        try {
				Document document = reader.read(this.getClass().getClassLoader().getResourceAsStream(source));
				Element root = document.getRootElement();//获取到根节点
				
				//利用list集合的方式遍历子节点
				List<?> listBean = root.elements("bean");//获取所有的bean
				for (int i = 0; i < listBean.size(); i++) {
					Element bean = (Element) listBean.get(i);//取得单个bean
					String id = bean.attributeValue("id");
					String clazz = bean.attributeValue("class");
					System.out.println(id + ":" +clazz);
					Object o = Class.forName(clazz).newInstance();
					beans.put(id, o);
					
					for(Element property : (List<Element>)bean.elements("property")) {
						String name = property.attributeValue("name");
						String ref = property.attributeValue("ref");
						Object objRef = beans.get(ref);
						
						String methodName = "set" + name.substring(0, 1).toUpperCase() + name.substring(1);//构造出set方法
						System.out.println(methodName);
						Method method = o.getClass().getMethod(methodName, objRef.getClass().getInterfaces()[0]);
						method.invoke(o, objRef);
					}
					
				}
				
				 //利用迭代器的方式遍历子节点的子节点
		        /*for (Iterator i_child = root.elementIterator(); i_child.hasNext(); ) {
					Element child = (Element) i_child.next();
					for(Iterator i_grandson = child.elementIterator(); i_grandson.hasNext(); ) {
						Element grandson = (Element) i_grandson.next();
						System.out.println(grandson.getName());
					}
				}*/
			} catch (DocumentException | InstantiationException | IllegalAccessException | ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
	}

	@Override
	public Object getBean(String name) {
		return beans.get(name);
	}

}
