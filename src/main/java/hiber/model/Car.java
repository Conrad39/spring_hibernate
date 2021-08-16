package hiber.model;

import javax.persistence.*;

@Entity
public class Car {

    @Column
    private String model;

    @Id
    @Column
    private int series;

    public Car(){

    }

    @Override
    public String toString() {
        return "(Car model: " + model +
                ", Car series: " + series +
                ")";
    }

    public Car (String model, int series){
        this.model = model;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
