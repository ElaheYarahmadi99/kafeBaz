package model.entity;

import javax.persistence.*;



@Entity(name = "login")
@Table(name= "login")
public class Login {

    @Id
    @Column(columnDefinition = "NUMBER")
    @SequenceGenerator(name = "loginSeq",sequenceName ="login_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO , generator = "loginSeq")
    private Long login_id;


    @Column(columnDefinition = "VARCHAR2(20)")
    private String emailId;
    @Column(columnDefinition = "VARCHAR2(20)")
    private String password;


    public Long getLogin_id() {
        return login_id;
    }

    public void setLogin_id(Long login_id) {
        this.login_id = login_id;
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
