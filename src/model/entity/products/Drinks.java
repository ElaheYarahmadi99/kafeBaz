package model.entity.products;/*package model.entity.products;

import javax.persistence.*;

@Entity
*//*@Table(name= "drinks")*//*
@PrimaryKeyJoinColumn(name = "product_ID"*//*, referencedColumnName = "product_ID"*//*)
public class Drinks extends Product {

    private Long price;
    private String productDescription;

    @Column(columnDefinition = "NUMBER")
    private int numberOfDrinks;

    public int getNumberOfDrinks() {
        return numberOfDrinks;
    }

    public void setNumberOfDrinks(int numberOfDrinks) {
        this.numberOfDrinks = numberOfDrinks;
    }

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
}*/
