package week_2.task1;

import java.util.HashSet;
import java.util.Set;

public class HashSetNew<T> {
   // private static final int CAPACITY = 16;
    private Set<T> hashSet;

    public HashSetNew() {
        hashSet = new HashSet<>();
        }

    public boolean add(T element) {
        return hashSet.add(element);
    }

    public boolean remove(T element)    {
        return hashSet.remove(element);
    }

    public String toString(){
        return hashSet.toString();
    }
}

class HashSetMain1 {
    public static void main(String[] args) {
        HashSetNew<String> hashSetNew = new HashSetNew<>();
        hashSetNew.add("Kat");
        hashSetNew.add("Dog");
        hashSetNew.add("Horsе");
        hashSetNew.add("Fox");
        System.out.println(hashSetNew);

        hashSetNew.remove("Fox");
        System.out.println(hashSetNew);
    }
}


