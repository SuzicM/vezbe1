package zadatak1;

public class Zadatak1 {

    public static void main(String[] args){

        int n = 5;
        int rez1;
        rez1 = n*(n-1)/2;


        double r, a;
        r = 3;
        a = 2;
        double rez2;
        rez2 = Math.sqrt( (r * Math.pow(Math.cos(a),2)) + (r * Math.pow(Math.sin(a),2)) );


        double x1 = 2, x2 = 4, y1 = 3, y2 = 8;
        double rez3;
        rez3 = Math.sqrt( Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2) );

        System.out.println("Prvi rezultat: " + rez1);
        System.out.println("Drugi rezultat: " + rez2);
        System.out.println("Treci rezultat: " + rez3);
    }
}
