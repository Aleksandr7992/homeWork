package week_5;

interface HeadphoneJack {
    void plugIn();
}

class Headphones implements HeadphoneJack {
    @Override
    public void plugIn() {
        System.out.println("Наушники с разъёмом Jack подключены!");
    }
}

interface TypeCDevice {
    void connect();
}

class HeadphoneAdapter implements TypeCDevice {
    private HeadphoneJack headphoneJack;

    public HeadphoneAdapter(HeadphoneJack headphoneJack) {
        this.headphoneJack = headphoneJack;
    }

    @Override
    public void connect() {
        headphoneJack.plugIn();
    }
}

public class Adapter {
    public static void main(String[] args) {
        HeadphoneJack headphones = new Headphones();
        TypeCDevice adapter = new HeadphoneAdapter(headphones);
        adapter.connect();
    }
}

