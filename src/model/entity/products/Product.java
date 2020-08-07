package model.entity.products;

import model.entity.Entities;
import model.entity.Image;


import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name= "product")
public class Product extends Entities {


    @Column(columnDefinition = "NUMBER")
    private float price;
    @Column(columnDefinition = "NUMBER")
    private int numberOfProduct;
    @Column(columnDefinition = "VARCHAR2(20)")
    private String productDescription;

    @Column(columnDefinition = "VARCHAR2(20)")
    private String type;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "imgProduct_id")
    private Image image;


    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setNumberOfProduct(int numberOfProduct) {
        this.numberOfProduct = numberOfProduct;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
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



}
