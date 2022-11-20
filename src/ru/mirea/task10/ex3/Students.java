package ru.mirea.task10.ex3;

public class Students {
    private String name, surname, group, spec;
    private int course;

    public Students(String name, String surname, String group, String spec, int course) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.spec = spec;
        this.course = course;
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return  course + ".  Specialization: " + spec + " Group: " +  group + " Full name: " +  surname + " " + name + '\n';
    }
}
