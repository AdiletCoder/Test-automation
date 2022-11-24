package Hotel;

import java.time.LocalDate;

public class Reception {
    private Employee emp;
    private LocalDate workingHours;

    public Reception(Employee emp, LocalDate now) {
        this.emp = emp;
        this.workingHours = workingHours;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public LocalDate getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(LocalDate workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return "Reception{" +
                "emp=" + emp +
                ", workingHours=" + workingHours +
                '}';
    }
}
