package org.week2;

public class PersonFactory extends AbstractFactory{
    @Override
    public AbstractPerson getPersonAbstract(String person){
        if (person.equalsIgnoreCase("CUSTOMER")){
            return new Customer();
        } else if (person.equalsIgnoreCase("USER")) {
            return new User();
        }
        return null;
    }
}
