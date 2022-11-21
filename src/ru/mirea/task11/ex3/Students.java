package ru.mirea.task11.ex3;

import java.text.DateFormat;
import java.util.Date;

public class Students {
    private String name;
    private double mark;
    private Date dateOfBirth;

    public Students(String name, double mark, Date dateOfBirth) {
        this.name = name;
        this.mark = mark;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public String toString(DateFormat format) {
        return  name + '(' + format.format(dateOfBirth) + ')' + ": " +  mark;
    }
}
