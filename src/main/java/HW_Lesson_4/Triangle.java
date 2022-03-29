package HW_Lesson_4;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Triangle {

    private int a;
    private int b;
    private int c;

    private void checkSidesArePositive(){
        if (a <= 0 || b <=0 || c <= 0) {
            throw new IllegalArgumentException("Sides must be positive");
        }
    }

    private void checkSOneSideIsSmallerThanOthers(){
        if (a + b <= c || b + c <= a || a + c <= b) {
            throw new IllegalArgumentException("One side can't be larger than sum of others");
        }
    }


    public double triangleArea() {
        checkSidesArePositive();
        checkSOneSideIsSmallerThanOthers();
        double s=(((a+b+c)/2.0)*((a+b+c)/2.0-a)*((a+b+c)/2.0-b)*((a+b+c)/2.0-c));
        return Math.sqrt(s);
    }

}

