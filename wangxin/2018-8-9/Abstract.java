//下面的关键字哪些不能与abstract 共存，并且说明为什么。
//final、private、static、public、protected
//Abstract 的定义 修饰后，必须通过类继承或者接口实现来重写，否则就是摆设

package com.day9;

public class Abstract {
    /* 1. final 不能  因为final定义的是最后的值即不可以被修改，而abstract是抽像类，需要重写实现
     * 2. private 是子类不能被继承，所以方法就不能被调用，所以跟abstract重写冲突
     * 3.static是静态 的也是可以共享的，可以直接实例化共享，abstract是不能够被实例化的，所以冲突
     * 4.public 是公共的可以跟abstract 共存，可以在子类中重写、、但是一旦定义抽象方法，类也要定义抽象类
     * 5.protected是除了在不同包里的不同子类不可以被调用   在同一类里都是可以的  abstract 可以被重写
     *   
     *  */
}
