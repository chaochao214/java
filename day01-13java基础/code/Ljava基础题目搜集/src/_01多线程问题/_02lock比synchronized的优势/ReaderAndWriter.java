package _01多线程问题._02lock比synchronized的优势;
//怎么理解这个类？
//看不懂
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReaderAndWriter <K,V>{
    private final ReadWriteLock lock  = new ReentrantReadWriteLock();
    private final Lock readLock  = lock.readLock();
    private final Lock writeLock = lock.writeLock();
    private final Map<K, V> map;

    public  ReaderAndWriter(Map<K,V>  map){
        this.map =map;
    }
    //lock方法写的，泛型看不懂
    public  V put(K key,V value){
        writeLock.lock();
        try {
            return  map.put(key,value);
        } finally {
            writeLock.unlock();

        }
    }
    public  V  get(K key){
        readLock.lock();
        try {
            return   map.get(key);
        } finally {
            readLock.unlock();
        }
    }


}
