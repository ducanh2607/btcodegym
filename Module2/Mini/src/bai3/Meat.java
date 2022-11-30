package bai3;

import java.io.Serializable;
import java.time.LocalDate;

public class Meat extends Material implements Discount, Serializable {
  private double weight;
  public Meat(double weight){
      this.weight = weight;
  }

    public Meat(long id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return weight * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public String toString() {
        return "Meat{" +
                super.toString()+
                "weight=" + weight +
                '}';
    }
    public boolean checkExpiryDate(){
      return getExpiryDate().isBefore(LocalDate.now());
    }
    @Override
    public double getRealMoney(){
      if (checkExpiryDate()){
          return 0;
      }else {
          if (LocalDate.now().plusDays(6).isAfter(getExpiryDate())){
              return getAmount() * 0.7;

          }else {
              return getAmount() * 0.9;
          }
      }
    }
}
