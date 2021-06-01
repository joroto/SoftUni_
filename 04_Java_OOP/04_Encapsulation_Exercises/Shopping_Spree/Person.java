package Shopping_Spree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        products = new ArrayList<>();
    }

    private void setName(String name) {
        if(name == null ||name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if(money < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void buyProduct(Product product) {
        if (this.money < product.getCost()) {
            throw new IllegalArgumentException(this.name + " can't afford " + product.getName());
        }
        this.products.add(product);
        this.money -= product.getCost();
        System.out.printf("%s bought %s\n", this.name, product.getName());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        this.getProducts().forEach(product -> {
            sb.append(product.getName()).append(", ");
        });
        if(this.getProducts().size() == 0){
            System.out.println(this.name + " - Nothing bought");
        }else {
            System.out.println(this.name + " - " + sb.substring(0, sb.length() - 2));
        }
        return sb.toString();
    }
}
