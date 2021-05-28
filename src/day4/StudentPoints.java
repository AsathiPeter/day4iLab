package day4;

public class StudentPoints {
    public static int qualityPoints(int result) {
        if((result >= 90) && (result <= 100)) {
            result = 4;
        }
        else if((result >= 80) && (result <= 89)) {
            result = 3;
        }

        else if ((result >= 70) && (result <= 79)) {
            result = 2;
        }

        else if ((result >= 60) && (result <= 69)) {
            result = 1;
        }
                else
            result = 0;

        return result;
    }
}


