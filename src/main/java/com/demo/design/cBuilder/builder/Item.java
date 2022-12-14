package com.demo.design.cBuilder.builder;

import com.demo.design.cBuilder.product.Packing;

/**
 * 食物条目
 *
 * @author Administrator
 * @date 2022/08/17
 */
public interface Item {

    /**
     * 名称
     *
     * @return {@link String}
     */
    public String name();

    /**
     * 包装
     *
     * @return {@link Packing}
     */
    public Packing packing();

    /**
     * 价格
     *
     * @return float
     */
    public float price();

}
