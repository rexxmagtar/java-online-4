package com.company;

public class Customer_class {

    private int ID;
    private static int id_=0;

    private String first_name;
    private String last_name;
    private String otch;
    private String adress;
    private int card_number;
    private int bank_count;

    public Customer_class( String first_name, String last_name, String otch,
                          String adress, int card_number, int bank_count) {
        this.ID = id_++;
        this.first_name = first_name;
        this.last_name = last_name;
        this.otch = otch;
        this.adress = adress;
        this.card_number = card_number;
        this.bank_count = bank_count;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getOtch() {
        return otch;
    }

    public void setOtch(String otch) {
        this.otch = otch;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getCard_number() {
        return card_number;
    }

    public void setCard_number(int card_number) {
        this.card_number = card_number;
    }

    public int getBank_count() {
        return bank_count;
    }

    public void setBank_count(int bank_count) {
        this.bank_count = bank_count;
    }

    @Override
    public String toString() {
        return
                "ID=" + ID +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", otch='" + otch + '\'' +
                ", adress='" + adress + '\'' +
                ", card_number=" + card_number +
                ", bank_count=" + bank_count;

    }
}
