package ex3;

import java.time.LocalDate;

public class Manager extends Employee{

    private LocalDate hirDate;
    private LocalDate endDate;

    public Manager(String name, int salary, LocalDate hirDate, LocalDate endDate) {
        super(name, salary);
        this.hirDate = hirDate;
        this.endDate = endDate;
    }

    public LocalDate getHirDate() {
        return hirDate;
    }

    public void setHirDate(LocalDate hirDate) {
        this.hirDate = hirDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    
}
