package Hotel;

import java.util.Objects;

public class Customer extends Person{
    private PhoneNumber phone;
    private String email;

    public Customer(String name, int age, String address, PhoneNumber phone, String email) {
        super(name, age, address);
        this.phone = phone;
        this.email = email;
    }

    public Customer(String name, int age, String address, PhoneNumber phone) {
        super(name, age, address);
        this.phone = phone;
    }

    public Customer(String name, int age, String address, String email) {
        super(name, age, address);
        this.email = email;
    }

    public PhoneNumber getPhone() {
        return phone;
    }

    public void setPhone(PhoneNumber phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(phone, customer.phone) && Objects.equals(email, customer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone, email);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
