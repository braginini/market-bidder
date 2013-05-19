package ru.mbragin.marketbidder.model;

/**
 * @author: mbragin
 */
public class Account {

    private long id;

    private String email;

    private long ownerId;

    public Account() {
    }

    public Account(long id, String email, long ownerId) {
        this.id = id;
        this.email = email;
        this.ownerId = ownerId;
    }

    public Account(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (id != account.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", ownerId=" + ownerId +
                '}';
    }
}
