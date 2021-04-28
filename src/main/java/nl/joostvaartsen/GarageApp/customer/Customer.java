package nl.joostvaartsen.GarageApp.customer;

public class Customer {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String licensePlateNumber;
    private int carAge;

    public Customer() {
    }


    public Customer(Long id, String name, String surname, String email, String licensePlateNumber, int carAge) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.licensePlateNumber = licensePlateNumber;
        this.carAge = carAge;
    }

    public Customer(String name, String surname, String email, String licensePlateNumber, int carAge) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.licensePlateNumber = licensePlateNumber;
        this.carAge = carAge;
    }
}
}
