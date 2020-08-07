package model.entity;

import javax.persistence.*;

@Entity
@Table(name= "billing")
public class Login {

    @Id
    @Column(columnDefinition = "NUMBER")
    @SequenceGenerator(name = "loginSeq",sequenceName ="login_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO , generator = "loginSeq")
    private Long id;

    @Column(columnDefinition = "VARCHAR2(20)")
    private String emailId;
    @Column(columnDefinition = "VARCHAR2(20)")
    private String password;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
