import student.Grifendor;
import student.Kognetavr;
import student.Pufunduy;
import student.Slizerin;

import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Grifendor harryPotter = new Grifendor(
                70,50,100,85,100
        );
        Grifendor ronIzzy = new Grifendor(
                50, 50,50,50,80
        );
        Grifendor germi = new Grifendor(
                90,30,65,100,20
        );
        Kognetavr joy = new Kognetavr (
                 30, 40, 50 ,60,70,80
        );
        Kognetavr padma = new Kognetavr(
                20,30,40,50,20,60
        );
        Kognetavr marcus = new Kognetavr(
                40,10,40,1,48,32
        );
        Slizerin drako = new Slizerin(
                20,40,20,28,37,56,23
        );
        Slizerin montegy = new Slizerin(
                17,39,94,56,42,34,51
        );
        Slizerin Goil = new Slizerin(
                32,51,68,21,57,51,10
        );
        Pufunduy smit = new Pufunduy(
                26,53,43,72,10
        );
        Pufunduy sedrik = new Pufunduy(
                39,57,84,49,67
        );
        Pufunduy finch = new Pufunduy(
                34,5,35,95,20
        );

        harryPotter.compare(ronIzzy);
        harryPotter.basicCompare(sedrik);
    }
}