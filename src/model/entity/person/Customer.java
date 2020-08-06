package model.entity.person;

import model.entity.Billing;

import javax.persistence.*;
import java.util.List;


@Entity(name = "customer_ID")
@Table(name= "customer")
public class Customer extends Person {



    @Column(columnDefinition = "NUMBER")
    private Long payMoney;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "billingId")
    private Billing billing;



    public Billing getBilling() {
        return billing;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    public Long getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Long payMoney) {
        this.payMoney = payMoney;
    }


}
