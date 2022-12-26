package pl.javastart.task;

public class Processor extends Component implements Overclockable  {
    private static final double MAX_TEMPERATURE = 80;
    private static final int TEMPERATURE_INCREASE_PER_100_MHZ = 10;
    private static final int PER_FREQUENCY_AMOUNT = 100;
    private double temperature;
    private double temperatureIncrease;
    private double currentFrequency;

    public Processor(String modelName, String producer, String serialNumber, double temperature, double frequency) {
        super(modelName, producer, serialNumber);
        this.temperature = temperature;
        this.currentFrequency = frequency;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
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
