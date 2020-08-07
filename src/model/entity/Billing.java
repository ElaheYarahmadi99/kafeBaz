package model.entity;


import model.entity.products.Product;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name= "billing")
public class Billing {

    @Id
    @Column(columnDefinition = "NUMBER")
    @SequenceGenerator(name = "billingSeq",sequenceName ="billing_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO , generator = "billingSeq")
    private Long id;

    @Column(columnDefinition = "Date")
    private Date orderDate;


    @Column(columnDefinition = "NUMBER")
    private float totalPrice;



    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private List<Product> products;



    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
