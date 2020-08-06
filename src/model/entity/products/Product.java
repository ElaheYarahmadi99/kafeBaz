package model.entity.products;



import model.entity.Billing;
import model.entity.Entities;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;


import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name= "product")
public class Product extends Entities {


    @Column(columnDefinition = "NUMBER")
    private Long price;
    @Column(columnDefinition = "NUMBER")
    private int numberOfProduct;
    @Column(columnDefinition = "VARCHAR2(20)")
    private String productDescription;



    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getNumberOfProduct() {
        return numberOfProduct;
    }

    public void setNumberOfProduct(int numberOfProduct) {
        this.numberOfProduct = numberOfProduct;
    }


}
