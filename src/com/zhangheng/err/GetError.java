package com.zhangheng.err;

public class GetError {
    public static void err1(){
        try {
            throw new MyErr1("加密模式异常：ASCII.getresuilt(int mode)中的参数'mode'错误");
        } catch (MyErr1 myErr1) {
            myErr1.printStackTrace();
        }
    }
    public static void err2(){
        try {
            throw new MyErr1("解密模式错误：构造函数Resuilt(String pwd, int mode)中的参数'mode'错误");
        } catch (MyErr1 myErr1) {
            myErr1.printStackTrace();
        }
    }
}
