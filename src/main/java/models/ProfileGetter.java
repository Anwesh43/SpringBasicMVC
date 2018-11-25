package models;

import org.springframework.beans.factory.annotation.Autowired;

public class ProfileGetter {


    @Autowired
    private Person person;

    @Autowired
    private Shape shape;

    private ProfileGetter() {

    }
    public void displayPersonDetails() {
        if (person != null) {
            System.out.println(person);
        }
        else {
            System.out.println("no details about the person");
        }
    }
    public void displayShapeDetails() {
        if (shape != null) {
            System.out.println(shape);
        }
        else {
            System.out.println("shape details not available");
        }
    }
    public static ProfileGetter getInstance() {
        return new ProfileGetter();
    }
}
