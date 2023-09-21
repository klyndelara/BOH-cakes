package KimlynandAnna.BOHCakes.Models;

public class Order {
    private int orderId;
    private int customerId;
    private int saleId;
    private int cupcakeId;
    private int quantity;

    public Order(int orderId, int customerId, int saleId, int cupcakeId, int quantity) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.saleId = saleId;
        this.cupcakeId = cupcakeId;
        this.quantity = quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public int getCupcakeId() {
        return cupcakeId;
    }

    public void setCupcakeId(int cupcakeId) {
        this.cupcakeId = cupcakeId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
