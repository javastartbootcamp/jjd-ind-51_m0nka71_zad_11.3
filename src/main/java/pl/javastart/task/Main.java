package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        try {
            Processor processor = new Processor("Core i9", "Intel", "Abc123", 30, 3000);
            Memory memory = new Memory("SDRAM", "Smasung", "XYZ123", 35, 4096, 1066);
            HardDrive harddrive = new HardDrive("X8 980", "Samsung", "WRT45", 128);

            Computer computer = new Computer(processor, memory, harddrive);
            processor.setFrequency(300);
            memory.setFrequency(200);
        } catch (OverTemperatureException | NullPointerException e) {
            System.err.println(e.getMessage());
        }
    }
}
