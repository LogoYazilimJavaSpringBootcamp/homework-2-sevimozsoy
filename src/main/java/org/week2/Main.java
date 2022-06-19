package org.week2;

public class Main {
    public static void main(String[] args){
        //Singleton Pattern
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        //YANLIŞ!
        //Singleton singleton = new Singleton();

        //Abstract Factory Pattern
        AbstractFactory abstractFactory = new PersonFactory();

        AbstractPerson customer = abstractFactory.getPersonAbstract("CUSTOMER");
        customer.login();

        AbstractPerson user = abstractFactory.getPersonAbstract("USER");
        user.login();

    }
}
