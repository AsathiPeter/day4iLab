package day4;

public class Circle {
    public static double CalcRadius(int radius) {
        double diameter = 2 * (radius);
        return diameter;
    }

        public static double CalcCircumference(int radius){
            double Circumference = 2 * (3.14159) * (radius);
            return Circumference;
        }


        public static double CalcArea(int radius){
            double Area = (3.14159 * radius) * 2;
            return Area;
        }
    }

