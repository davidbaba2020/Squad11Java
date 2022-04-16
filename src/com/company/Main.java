package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Decadevs Ike = new Decadevs("Ikeoluwa","Female","CN","JAVA");
//        System.out.println(Ike.getName());
//        System.out.println(Ike.getGender());
//        Ike.setGuarantor("Bond");
//        System.out.println(Ike.getGuarantor());
        System.out.println(Ike);
        Ike.payLoan(45.00);
        Decadevs Obina = new Decadevs();
        System.out.println(Ike);
        Ike.payLoan(5000.00);
        System.out.println(Ike);
    }
}
