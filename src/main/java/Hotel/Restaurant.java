package Hotel;

import java.time.LocalDate;

public class Restaurant {
    private String location;
    private LocalDate workingHours;

    public Restaurant(String location, LocalDate workingHours) {
        this.location = location;
        this.workingHours = workingHours;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(LocalDate workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "location='" + location + '\'' +
                ", workingHours=" + workingHours +
                '}';
    }
}
