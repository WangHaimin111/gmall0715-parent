package com.atguigu.gmall0715.mock.util;

import java.util.Random;

/**
 * @auther WangHaimin
 * @date 2019/12/13-10:55
 */
public class RandomNum {
    public static final  int getRandInt(int fromNum,int toNum){
        return   fromNum+ new Random().nextInt(toNum-fromNum+1);
    }

}
