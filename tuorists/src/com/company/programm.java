package com.company;






public class programm{
    enum type{relax,sport,shopping,cruise,recovery};
    enum transport{air,ground,water};
    enum meals{light,two_times,whole_pack};

   private int durationDays;
   private type type;
   private transport transport;
   private meals meals;

    public programm(int durationDays, programm.type type,
                    programm.transport transport,
                    programm.meals meals) {

        this.durationDays = durationDays;
        this.type = type;
        this.transport = transport;
        this.meals = meals;
    }

    public int getDurationDays() {
        return durationDays;
    }

    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }

    public programm.type getType() {
        return type;
    }

    public void setType(programm.type type) {
        this.type = type;
    }

    public programm.transport getTransport() {
        return transport;
    }

    public void setTransport(programm.transport transport) {
        this.transport = transport;
    }

    public programm.meals getMeals() {
        return meals;
    }

    public void setMeals(programm.meals meals) {
        this.meals = meals;
    }

    @Override
    public String toString() {
        return
                "durationDays=" + durationDays +
                ", type=" + type +
                ", transport=" + transport +
                ", meals=" + meals ;

    }
}
