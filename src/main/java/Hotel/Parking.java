package Hotel;

public class Parking {
    private String address;
    private int availablePlaces;
    private double price;

    public Parking(String address, int availablePlaces, double price) {
        this.address = address;
        this.availablePlaces = availablePlaces;
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAvailablePlaces() {
        return availablePlaces;
    }

    public void setAvailablePlaces(int availablePlaces) {
        this.availablePlaces = availablePlaces;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "address='" + address + '\'' +
                ", availablePlaces=" + availablePlaces +
                ", price=" + price +
                '}';
    }
}
