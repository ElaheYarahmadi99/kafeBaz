package model.entity.person;

import model.entity.products.Product;

import javax.persistence.*;
import java.util.List;


@Entity(name = "customer")
@Table(name= "customer")
public class Customer extends Person {



    @Column(columnDefinition = "NUMBER")
    private float payMoney;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerId")
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public float getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(float payMoney) {
        this.payMoney = payMoney;
    }
}
