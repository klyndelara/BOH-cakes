package KimlynandAnna.BOHCakes.Models;

public class Cupcake {
    private int cupcakeId;
    private String name;
    private String description;
    private String cost;

    public Cupcake(int cupcakeId, String name, String description, String cost) {
        this.cupcakeId = cupcakeId;
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public Cupcake() {

    }

    public int getCupcakeId() {
        return cupcakeId;
    }

    public void setCupcakeId(int cupcakeId) {
        this.cupcakeId = cupcakeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
