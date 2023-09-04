public class Toy {
    
    public String name;
    public Integer id;
    public Integer amount;
    public Double weight;

    public Toy(String name, Integer id, Integer amount, Double weight) {
        this.name = name;
        this.id = id;
        this.amount = amount;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Toy " + id + "[name=" + name + ", amount=" + amount + ", weight=" + weight + "]";
    }

}
