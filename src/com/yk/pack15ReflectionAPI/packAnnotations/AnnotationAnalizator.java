package com.yk.pack15ReflectionAPI.packAnnotations;

import java.lang.reflect.Method;

public class AnnotationAnalizator {

    public void analyze(Class<?> clazz){
        Method[] methods = clazz.getMethods();

        for (Method method : methods) {
            if(method.isAnnotationPresent(XmlAttribute.class)){
                XmlAttribute xmlAttribute = method.getAnnotation(XmlAttribute.class);
                System.out.println(xmlAttribute.name());
            }
            if(method.isAnnotationPresent(XmlElement.class)){
                XmlElement xmlElement = method.getAnnotation(XmlElement.class);
                System.out.println(xmlElement.name());

            }
        }
    }

}
