package com.demo.design.bAbstractFactory.factory;

import com.demo.design.bAbstractFactory.factory.impl.AbstractFactory;
import com.demo.design.bAbstractFactory.factory.impl.ColorFactory;

/**
 * 工厂生产者
 *
 * @author shenghua.song
 * @date 2022/08/17
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
