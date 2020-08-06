package model.entity.person;

import javax.persistence.*;
import java.util.Date;


@Entity(name = "admin")
@Table(name= "admin")
public class Admin extends Person {


    @Column(columnDefinition = "VARCHAR2(20)")
    private String password;
    @Column(columnDefinition = "VARCHAR2(20)")
    private String username;
    @Column(columnDefinition = "NUMBER")
    private Long salary;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
