package org.week2;

public class Singleton {

    //Singleton olacak nesne yaratılır.
    private static Singleton instance = new Singleton();

    //private constructor sayesinde başka class'lardan erişilemez, böylece tek nesne yaratılıt.
    private Singleton(){}

    //Tek nesneyi geri döndürür, bu şekilde nesne başka yerlerde kullanılabilir.
    public static Singleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Selam ben Singleton nesneyim!");
    }
}
