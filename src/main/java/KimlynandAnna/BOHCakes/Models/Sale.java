package KimlynandAnna.BOHCakes.Models;

public class Sale {
    private int saleId;
    private int date;
    private int totalCost;

    public Sale(int saleId, int date, int totalCost) {
        this.saleId = saleId;
        this.date = date;
        this.totalCost = totalCost;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }
}
