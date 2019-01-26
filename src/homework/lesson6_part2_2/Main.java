package homework.lesson6_part2_2;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {

        Surgeon Vasya = new Surgeon();
        Vasya.treat();
        Neurosurgeon Kolya = new Neurosurgeon();
        Kolya.treat();
        Surgeon Petya = new Neurosurgeon();
        Petya.treat();


        ArrayList<Doctor> operates = new ArrayList<>();
    }}