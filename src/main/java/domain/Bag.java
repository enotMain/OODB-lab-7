package domain;

import annotation.Column;
import annotation.Entity;
import annotation.Id;
import annotation.ManyToOne;

@Entity
public class Bag extends Product {

    @Id
    private Long id;

    @Column
    @ManyToOne
    private Company company;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
