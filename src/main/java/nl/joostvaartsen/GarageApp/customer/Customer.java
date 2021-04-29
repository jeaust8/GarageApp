package nl.joostvaartsen.GarageApp.customer;

import java.time.LocalDate;

public class Customer {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String licensePlateNumber;
    private LocalDate carAge;

    public Customer() {
    }


    public Customer(Long id, String name, String surname, String email, String licensePlateNumber, LocalDate carAge) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.licensePlateNumber = licensePlateNumber;
        this.carAge = carAge;
    }

    public Customer(String name, String surname, String email, String licensePlateNumber, LocalDate carAge) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.licensePlateNumber = licensePlateNumber;
        this.carAge = carAge;
    }

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public LocalDate getCarAge() {
        return carAge;
    }

    public void setCarAge(LocalDate carAge) {
        this.carAge = carAge;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", licensePlateNumber='" + licensePlateNumber + '\'' +
                ", carAge=" + carAge +
                '}';
    }
}

