package domain;

import java.time.LocalDate;

public class Insured {
    //Exei apla auto-generated constructors,getters,setters,toString sumfwna me ta attributes ths ekfwnhshs
    //-------------------------------------------------------------------------------------------------------------------
    //Attributes
    //-------------------------------------------------------------------------------------------------------------------
    private int afm;
    private int amka;
    private String name;
    private String surname;
    private LocalDate birthdate;
    private String email;
    private boolean isBooked;
    //-------------------------------------------------------------------------------------------------------------------
    //Constructors
    //-------------------------------------------------------------------------------------------------------------------
    public Insured(int afm, int amka, String name, String surname, LocalDate birthdate, String email, boolean isBooked) {
        this.afm = afm;
        this.amka = amka;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.email = email;
        this.isBooked = isBooked;
    }

    public Insured() {
    }
    public Insured(int afm, int amka, String name, String surname, LocalDate birthdate, String email) {
        this.afm = afm;
        this.amka = amka;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.email = email;
    }
    //-------------------------------------------------------------------------------------------------------------------
    //Getters and Setters
    //-------------------------------------------------------------------------------------------------------------------

    public int getAfm() {
        return afm;
    }

    public void setAfm(int afm) {
        this.afm = afm;
    }

    public int getAmka() {
        return amka;
    }

    public void setAmka(int amka) {
        this.amka = amka;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    //-------------------------------------------------------------------------------------------------------------------
    //To String for all attributes
    //-------------------------------------------------------------------------------------------------------------------
    @Override public String toString() {
        return "domain.Insured{" +
                "afm=" + afm +
                ", amka=" + amka +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate=" + birthdate.toString() +
                ", email='" + email + '\'' +
                ", isBooked=" + isBooked +
                '}';
    }
}
