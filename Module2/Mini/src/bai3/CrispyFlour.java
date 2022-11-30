package bai3;

import java.io.Serializable;
import java.time.LocalDate;

public  class CrispyFlour extends Material implements Discount, Serializable {
    int quantity;

    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(long id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public double getAmount(){
        return quantity * getCost();
    }
    @Override
    public LocalDate getExpiryDate(){
        return getManufacturingDate().plusYears(1);
    }
    @Override
    public String toString(){
        return "CrispyFlour{" + super.toString() + "; quantity=" + quantity + "}";
    }

    public boolean checkExpiryDate(){
        return getExpiryDate().isBefore(LocalDate.now());
    }
    @Override
    public double getRealMoney(){
        if (checkExpiryDate()){
            return 0;
        }else {
            if (LocalDate.now().plusDays(61).isAfter(getExpiryDate())){
                return getAmount() * 0.6;
            }else if(LocalDate.now().plusDays(121).isAfter(getExpiryDate())){
                return getAmount() * 0.8;
            }else {
                return getAmount() * 0.95;
            }
        }
    }

}
