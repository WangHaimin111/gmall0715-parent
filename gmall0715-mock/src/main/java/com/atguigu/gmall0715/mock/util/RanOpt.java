package com.atguigu.gmall0715.mock.util;

/**
 * @auther WangHaimin
 * @date 2019/12/13-10:54
 */
public class RanOpt<T>{
    T value ;
    int weight;

    public RanOpt ( T value, int weight ){
        this.value=value ;
        this.weight=weight;
    }

    public T getValue() {
        return value;
    }

    public int getWeight() {
        return weight;
    }
}
