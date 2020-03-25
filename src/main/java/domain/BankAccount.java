package domain;

import annotation.Column;
import annotation.Entity;
import annotation.Id;

@Entity
public class BankAccount {

    @Id
    private Long id;

    @Column
    private int accountNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
