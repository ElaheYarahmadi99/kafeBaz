package model.entity.person;

import model.entity.Entities;
import model.entity.Image;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

import javax.persistence.*;
import java.util.Date;

/*(name = "person_ID")*/
/*
@PrimaryKeyJoinColumn(name = "person_ID", referencedColumnName ="entities_ID")
*/

@Entity(name = "person")
@Table(name= "person")
public class Person extends Entities {


    @Column(columnDefinition = "VARCHAR2(20)")
    private String lastName;
    @Column(columnDefinition = "VARCHAR2(20)")
    private String phone;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "imgPerson_id")
    private Image image;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
