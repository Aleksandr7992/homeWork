package week_5;

interface IMessage{
    void display();
}
class Real implements IMessage{
    private String name;
    public Real(String name){
        this.name = name;
    }
    @Override
    public void display(){
        System.out.println("Исходное сообщение" + name);
    }
}
public class Proxy implements IMessage {
    private Real real;
    private String name;
    public Proxy(String name){
        this.name = name;
    }
    @Override
    public void display(){
        if (real == null){
            real = new Real(name);
        }
        real.display();
    }
}
class MainProxy{
    public static void main(String[] args){
        Proxy proxy = new Proxy("(Прокси)");
        proxy.display();
    }
}

