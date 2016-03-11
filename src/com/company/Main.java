package com.company;

public class Main {

    public static void main(String[] args) {
	// Создать класс вычисляющий расстояние между двумя точками,
        // представленными координатами в двумерном пространстве (x1, y1), (x2, y2).write your code here
int x1 = 3;
        int x2 = 5;
        int y1 = 2;
        int y2 = 6;
        int k;
        k = x2 - x1;
        int p;
        p = y2 - y1;


        double s;
        int b = k;
        int c = 2;
        s = (Math.pow(b, c));
        double u;
        int e = p;
        int f = 2;
        u = (Math.pow(e, f));

        double n = (s + u);
        double a;
        a = (Math.sqrt(n));
        System.out.println(a);
    }
}
