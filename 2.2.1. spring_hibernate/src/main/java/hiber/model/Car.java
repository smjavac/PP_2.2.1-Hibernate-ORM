package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "Cars")

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private String series;

    public Car() {}

    @Override
    public String toString() {
        return "model = " + model + ", series = " + series;
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

    public Car(String model, String series) {
        this.series = series;
        this.model = model;
    }





}
