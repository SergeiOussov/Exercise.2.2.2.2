package web.model;

public class Car {
    private String model;

    private int series;

    private int yearOfManufacture;

    public Car(String model, int series, int yearOfManufacture) {
        this.model = model;
        this.series = series;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public long getYearOfManufacture() {
        return yearOfManufacture;
    }
}
