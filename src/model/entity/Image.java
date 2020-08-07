package model.entity;

import model.entity.person.Person;
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
