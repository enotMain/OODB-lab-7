package domain;

import annotation.Entity;
import annotation.Id;

@Entity
public class Company extends CompanyAbstract {

    @Id
    private Long Id;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
