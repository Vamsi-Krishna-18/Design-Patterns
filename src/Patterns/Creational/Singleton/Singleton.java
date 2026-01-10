package Patterns.Creational.Singleton;

public class Singleton {
    private static Singleton instance;
    private String data;
    private Singleton(String data) {
        this.data = data;
    }

    /*
    * This approach is not thread safe.
    * Multiple threads calling this method at same time can create different instances
    * */
    public static Singleton getInstance(String data) {
        if (instance == null) {
            instance = new Singleton(data);
        }
        return instance;
    }

    /* Thread-safe approach
    * 1. This approach is thread safe.
    * 2. It ensures only one instance is created.
    * 3. But this lowers the performance since every thread needs to wait for the lock to
    *    be released from the other thread
    * */
    public static Singleton getInstance1(String data) {
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(data);
            }
        }
        return instance;
    }

    /* Double-Checked Locking
    * 1. This is optimized version of the above approach
    * 2. This locks the resource only when the instance is null and during its creation to make it thread safe.
    *    This way it does not lock the resource when it is already available to be used.
    * */
    public static Singleton getInstance2(String data) {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(data);
                }
            }
        }
        return instance;
    }

    /*
    * The above approach can cause problems when thread A is creating an instance and thread B is immediately
    * trying to get the instance and gets the reference of the instance that is just partially created by A
    *
    * To avoid this, make the instance volatile which allows other threads to read the updated value
    *
    * Since the instance is now directly fetched from main memory, we should reduce the number of reads. So,
    * assign it to local variable and access it
    * */
    public static Singleton getInstance3(String data) {
        Singleton result = instance;
        if (result == null) {
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    result = instance = new Singleton(data);
                }
            }
        }
        return result;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }


}
