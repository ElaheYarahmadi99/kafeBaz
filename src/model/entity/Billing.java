package model.entity;


import model.entity.products.Product;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "billing")
@Table(name= "billing")
public class Billing {

    @Id
    @Column(columnDefinition = "NUMBER")
    @SequenceGenerator(name = "billingSeq",sequenceName ="billing_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO , generator = "billingSeq")
    private Long id;


    @Column(columnDefinition = "Date")
    private Date order_Date;

    @Column(columnDefinition = "NUMBER")
    private Long totalPrice;



    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOrder_Date() {
        return order_Date;
    }

    public void setOrder_Date(Date order_Date) {
        this.order_Date = order_Date;
    }
}
