package com.company;

public class Decadevs {
    private String name;
    private String gender;
    private String Guarantor;
    private String stack;
    private double loanPaid;

    public Decadevs(String name, String gender, String guarantor, String stack) {
        this.name = name;
        this.gender = gender;
        Guarantor = guarantor;
        this.stack = stack;
    }

    public Decadevs (){
    }

    @Override
    public String toString() {
        return "Decadevs{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", Guarantor='" + Guarantor + '\'' +
                ", stack='" + stack + '\'' +
                ", loanPaid=" + loanPaid +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGuarantor() {
        return Guarantor;
    }

    public void setGuarantor(String guarantor) {
        Guarantor = guarantor;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public double getLoanPaid() {
        return loanPaid;
    }

    public double payLoan(double amount){
        return  loanPaid +=amount;
    }

}
