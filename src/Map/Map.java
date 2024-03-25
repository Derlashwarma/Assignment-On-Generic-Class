package Map;

import java.util.ArrayList;

public class Map <K,V>{
    private ArrayList<K> keys;
    private ArrayList<V> values;
    public Map(){
        this.keys = new ArrayList<>();
        this.values = new ArrayList<>();
    }
    public void put(K key, V value){
        int index = keys.indexOf(key);
        if (index != -1) {
            values.set(index, value);
        } else {
            keys.add(key);
            values.add(value);
        }
    }
    public V get(K key){
        int index = keys.indexOf(key);
        if(index != -1){
            try {
                return values.get(index);
            }
            catch (IndexOutOfBoundsException e){
                return null;
            }
        }
        return null;
    }
    public V remove(K key){
        int index = keys.indexOf(key);
        if(index != -1){
            try{
                return values.remove(index);
            }
            catch (IndexOutOfBoundsException e){
                return null;
            }
        }
        return null;
    }
}
