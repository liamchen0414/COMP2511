package ex3;

import java.time.LocalDate;

public class Boss extends Manager{

    public Boss(String name, int salary, LocalDate hirDate, LocalDate endDate) {
        super(name, salary, hirDate, endDate);
    }
    
    public static void main(String[] args) {
        Boss steve = new Boss("Steve", 0, LocalDate.now(), LocalDate.now());
        steve.sayHello();
    }
}
