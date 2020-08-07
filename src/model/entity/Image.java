package model.entity;

import model.entity.products.Product;

import javax.persistence.*;

@Entity
@Table(name= "image")
public class Image {


    @Id
    @Column(columnDefinition = "NUMBER")
    @SequenceGenerator(name = "imageSeq",sequenceName ="image_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO , generator = "imageSeq")
    private Long id;
    @Column(columnDefinition = "VARCHAR2(20)")
    private String address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Product product;


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
