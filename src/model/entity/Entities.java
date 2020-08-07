package model.entity;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name= "billing")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Entities {

    @Id
    @Column(columnDefinition = "NUMBER")
    @SequenceGenerator(name = "entitiesSeq",sequenceName ="entities_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO , generator = "entitiesSeq")
    private Long id;

    @Column(columnDefinition = "VARCHAR2(20)")
    private String name;
    @Column(columnDefinition = "Date")
    private Date start_Date;
    @Column(columnDefinition = "Date")
    private Date end_Date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStart_Date() {
        return start_Date;
    }

    public void setStart_Date(Date start_Date) {
        this.start_Date = start_Date;
    }

    public Date getEnd_Date() {
        return end_Date;
    }

    public void setEnd_Date(Date end_Date) {
        this.end_Date = end_Date;
    }
}
