package com.iron.design.principle;

/**
 * @author JarvisChen
 * @desc
 * @date 2020-03-03
 * @time 16:10
 */
public class JavaDiscountCourse extends JavaCourse {

    private Double originPrice;

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
