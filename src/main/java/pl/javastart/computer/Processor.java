package pl.javastart.computer;

public class Processor extends Component implements Overclockable  {
    private static final double MAX_TEMPERATURE = 80;
    private static final int TEMPERATURE_INCREASE_PER_100_MHZ = 10;
    private static final int PER_FREQUENCY_AMOUNT = 100;
    private double temperature;
    private double currentFrequency;

    public Processor(String modelName, String producer, String serialNumber, double temperature, double frequency) {
        super(modelName, producer, serialNumber);
        this.temperature = temperature;
        this.currentFrequency = frequency;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getFrequency() {
        return currentFrequency;
    }

    @Override
    public void overclock(double frequency) {
        double temperatureIncrease = (frequency / PER_FREQUENCY_AMOUNT) * TEMPERATURE_INCREASE_PER_100_MHZ;
        double newTemperature = temperature + temperatureIncrease;
        if (newTemperature > MAX_TEMPERATURE) {
            throw new OverTemperatureException("Uwaga, temperatura przekroczona!");
        }
        currentFrequency = currentFrequency + frequency;
        temperature = newTemperature;
    }
}
