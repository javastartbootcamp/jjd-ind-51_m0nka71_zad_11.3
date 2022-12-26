package pl.javastart.computer;

public abstract class Component {
    private String modelName;
    private String producer;
    private String serialNumber;

    public Component(String modelName, String producer, String serialNumber) {
        setModelName(modelName);
        setProducer(producer);
        setSerialNumber(serialNumber);
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        if (modelName == null) {
            throw new IllegalArgumentException("Podaj poprawną nazwę modelu");
        }
        this.modelName = modelName;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        if (producer == null) {
            throw new IllegalArgumentException("Podaj poprawną nazwę producenta");
        }
        this.producer = producer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        if (serialNumber == null) {
            throw new IllegalArgumentException("Podaj poprawny numer seryjny");
        }
        this.serialNumber = serialNumber;
    }
}
