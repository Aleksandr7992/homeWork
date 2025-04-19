package week_2.task1;
import java.util.ArrayList;

public class ArrayListNew{

    private ArrayList<String> arrayList;

    public ArrayListNew() {
        arrayList = new ArrayList<>();
    }

    public boolean add(String element) {
        return arrayList.add(element);
    }

    public String get(int index){
        if (index < 0 || index >= arrayList.size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + arrayList.size());
        }
        return arrayList.get(index);
    }

    public boolean addAll (ArrayList aL) {
        return arrayList.addAll(aL);
    }

    public boolean remove(String element)    {
        return arrayList.remove(element);
    }

    public String toString(){
        return arrayList.toString();
    }
}
class Main{
    public static void main(String[] args) {
        ArrayList <String> arrayListNew = new ArrayList<>();
        arrayListNew.add("Moscow");
        arrayListNew.add("Belgorod");
        arrayListNew.add("Krasnodar");
        arrayListNew.add("Vologda");
        System.out.println(arrayListNew);

        arrayListNew.remove("Vologda");
        System.out.println(arrayListNew);

        System.out.println(arrayListNew.get(1));

        ArrayList <String> arrayList2 = new ArrayList<>();
        arrayListNew.add("Omsk");
        arrayListNew.add("Tomsk");

        arrayListNew.addAll(arrayList2);
        System.out.println(arrayListNew);

    }
}


