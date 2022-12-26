package pl.javastart.computer;

public class HardDrive extends Component {
    private int capacity;

    public HardDrive(String modelName, String producer, String serialNumber, int capacity) {
        super(modelName, producer, serialNumber);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
