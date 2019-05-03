package creational.singleton;
//@link https://openhome.cc/Gossip/DesignPattern/SingletonPattern.htm
//标准单例
//public class SingletonDemo {
//    //私有构造器防止被他人创建实例
//    private SingletonDemo() {
//    }
//
//    private static SingletonDemo singletonDemo = new SingletonDemo();
//
//    public static SingletonDemo getSingleInstance(){
//        return singletonDemo;
//    }
//}

//Lazy Initialization 只能在单线程下使用，多线程会产生多个对象的可能，多线程下需添加synchronized关键字，
//同步耗性能不适合在服务器上做此操作，因此引入Double-check Locking模式
//public class SingletonDemo {
//    //私有构造器防止被他人创建实例
//    private SingletonDemo() {
//    }
//
//    private static SingletonDemo singletonDemo;
//
////    public static SingletonDemo getSingleInstance(){
//    synchronized static SingletonDemo getSingleInstance(){
//        if (null == singletonDemo) {
//            singletonDemo = new SingletonDemo();
//        }
//        return singletonDemo;
//    }
//}

//Double-check Locking
public class SingletonDemo {
    private SingletonDemo(){};

    private static SingletonDemo singletonDemo;

    public static SingletonDemo getInstance(){
        if (null == singletonDemo) {
            synchronized (SingletonDemo.class){
                if (null == singletonDemo) {
                    singletonDemo = new SingletonDemo();
                }
            }
        }
        return singletonDemo;
    }

    public void show() {
        System.out.printf("hello");
    }

    public static void main(String[] args) {
        SingletonDemo.getInstance().show();
    }
}

