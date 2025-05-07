package week_5;

class Computer {
    private String CPU;    // Процессор
    private String GPU;    // Видеокарта
    private int memory;    // Объём оперативной памяти (ГБ)

    public Computer(String CPU, String GPU, int memory) {
        this.CPU = CPU;
        this.GPU = GPU;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Компьютер: " + CPU + ", " + GPU + ", " + memory + " ГБ";
    }
}

interface ComputerBuilder {
    void setCPU(String CPU);
    void setGPU(String GPU);
    void setMemory(int memory);
    Computer getPC();
}

class GamingPCBuilder implements ComputerBuilder {
    private String CPU = null;
    private String GPU = null;
    private int memory = 0;

    @Override
    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    @Override
    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    @Override
    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public Computer getPC() {
        return new Computer(CPU, GPU, memory);
    }
}

class PCDirector {
    private ComputerBuilder builder;

    public PCDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public void constructGamingPC() {
        builder.setCPU("Intel Core i12");
        builder.setGPU("NVIDIA GeForce");
        builder.setMemory(64);
    }
}

public class Builder {
    public static void main(String[] args) {
        GamingPCBuilder builder = new GamingPCBuilder();
        PCDirector director = new PCDirector(builder);
        director.constructGamingPC();
        Computer gamingPC = builder.getPC();
        System.out.println(gamingPC);
    }
}