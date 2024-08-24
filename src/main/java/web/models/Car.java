package web.models;

import java.util.Objects;

public class Car {

    private String model;
    private String series;
    private Integer cost;

    public Car(String model, String series, Integer cost) {
        this.model = model;
        this.series = series;
        this.cost = cost;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(series, car.series) && Objects.equals(cost, car.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, series, cost);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", cost=" + cost +
                '}';
    }
}
