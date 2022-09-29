package com.ebebek.entity;

public class Main {

    public static void main(String[] args) {
        Empoylee emp1 = new Empoylee("Efe", 2000,45,1998);
        Empoylee emp2 = new Empoylee("Enver", 3500,50,2003);
        Empoylee emp3 = new Empoylee("Gamze", 6000,80,2005);

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
    }

}
