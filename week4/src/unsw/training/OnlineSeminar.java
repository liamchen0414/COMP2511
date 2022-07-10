package unsw.training;

import java.util.List;

/**
 * An online seminar is a video that can be viewed at any time by employees. A
 * record is kept of which employees have watched the seminar.
 * @author Robert Clifton-Everest
 *
 */
public class OnlineSeminar extends Seminar {
    // Liskov Substitution Principle
    // we want to use run time polymophism
    // classic example is we have rectangle and square

    
    // S - Single-responsiblity Principle.
    // O - Open-closed Principle.
    // L - Liskov Substitution Principle: 
    // whereever you are using the base type, you should be able to swap it with subtype
    // I - Interface Segregation Principle.
    // D - Dependency Inversion Principle.
    private String videoURL;

    private List<String> watched;
}
