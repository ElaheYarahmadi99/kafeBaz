package model.entity.person;

import javax.persistence.*;

@Entity
@Table(name= "management")
public class Management extends Person {


    @Column(columnDefinition = "VARCHAR2(20)")
    private String password;
    @Column(columnDefinition = "VARCHAR2(20)")
    private String username;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
