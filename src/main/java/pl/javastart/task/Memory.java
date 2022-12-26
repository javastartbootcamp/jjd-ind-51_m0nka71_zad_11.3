package pl.javastart.task;

public class Memory extends Component implements Overclockable {
    private static final double MAX_TEMPERATURE = 100;
    private double temperature;
    private static final int TEMPERATURE_INCREASE_PER_100_MHZ = 15;
    private static final int PER_FREQUENCY_AMOUNT = 100;
    private double temperatureIncrease;
    private int ramAmount;
    private double currentFrequency;

    public Memory(String modelName, String producer, String serialNumber, double temperature, int ramAmount, double frequency) {
        super(modelName, producer, serialNumber);
        this.temperature = temperature;
        this.ramAmount = ramAmount;
        this.currentFrequency = frequency;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getRamAmount() {
        return ramAmount;
    }

    public void setRamAmount(int ramAmount) {
        this.ramAmount = ramAmount;
    }

    public double getFrequency() {
        return currentFrequency;
    }

    public void setFrequency(double frequency) {
        temperatureIncrease = (frequency / PER_FREQUENCY_AMOUNT) * TEMPERATURE_INCREASE_PER_100_MHZ;
        temperatureIncrease = temperatureIncrease + temperature;
        overclock();
        currentFrequency = currentFrequency + frequency;
    }

    @Override
    public void overclock() {
        if (temperatureIncrease > MAX_TEMPERATURE) {
            throw new OverTemperatureException("Uwaga, temperatura przekroczona!");
        }
    }
}
