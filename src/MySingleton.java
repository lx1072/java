public class MySingleton {
    //私有构造方法
    private MySingleton(){};

    //饿汉式   线程安全
    private static MySingleton instance =new MySingleton();

    public static MySingleton getInstance() {
        return instance;
    }



}
