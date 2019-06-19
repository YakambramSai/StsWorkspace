public class SingletonDemo {

    private static final SingletonDemo  singletonDemo = new SingletonDemo();

    private SingletonDemo(){};

    public static  SingletonDemo getInstance(){
        return singletonDemo;
    }

    public void display(){
        System.out.println("Hello Singleton Demo");
    }

    public static void main(String[] args) {

        SingletonDemo singleton=SingletonDemo.getInstance();
        singleton.display();

    }
}
