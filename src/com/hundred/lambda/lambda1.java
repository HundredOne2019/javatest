package com.hundred.lambda;

/**
 * 练习1：
 * 1.编写一个接口（showHandler）
 * 2.在该接口中存在一个抽象方法（show），该方法是无参无返回值
 * 3.在测试类（lambda1）中存在一个方法（useShowHandler）
 *          方法的参数是（ShowHandler）类型的
 *          在方法内调用了（ShowHandler）的show方法
 */
public class lambda1 {

    public static void useShowHandler(ShowHandler showHandler){
        showHandler.show();
    }

    public static void main(String[] args) {
        //传统的匿名内部类
        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("匿名。。");
            }
        });
        //lambda表达式
        useShowHandler(()->{
            System.out.println("lambda。。");
        });
    }
}
//一个接口和仅有的一个抽象方法
interface ShowHandler{
    public void show();
}