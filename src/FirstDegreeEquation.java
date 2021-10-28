import java.io.File;
import java.util.Scanner;

public class FirstDegreeEquation {
    private float a;
    private float b;

    private static String NO_SOLUTION = "VO_NGHIEM";
    private static String ONE_SOLUTION_NEGATIVE = "MOT_NGHIEM_AM";
    private static String ONE_SOLUTION_POSITIVE = "MOT_NGHIEM_DUONG";
    private static String ONE_SOLUTION_ZERO = "MOT_NGHIEM_BANG_0";
    private static String MANY_SOLUTION = "VO_SO_NGHIEM";

    public FirstDegreeEquation(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public String status() {
        if (a == 0) {
            if (b == 0) return FirstDegreeEquation.MANY_SOLUTION;
            return FirstDegreeEquation.NO_SOLUTION;
        }
        else {
            if (b == 0) return FirstDegreeEquation.ONE_SOLUTION_ZERO;
            if (a * b > 0) return FirstDegreeEquation.ONE_SOLUTION_NEGATIVE; // a va b cung dau
            else return FirstDegreeEquation.ONE_SOLUTION_POSITIVE; // a va b trai dau
        }
    }
//    Ma nguon co loi
//    public String status() {
//        if (a == 0) {
//            return FirstDegreeEquation.NO_SOLUTION;
//        }
//        else {
//            if (b == 0) return FirstDegreeEquation.ONE_SOLUTION_ZERO;
//            if (a * b > 0) return FirstDegreeEquation.ONE_SOLUTION_NEGATIVE; // a va b cung dau
//            else return FirstDegreeEquation.ONE_SOLUTION_POSITIVE; // a va b trai dau
//        }
//    }

    public static void main(String[] args) {
        System.out.println("Nhập hệ số bậc 1 và bậc 0: ");
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        FirstDegreeEquation one = new FirstDegreeEquation(a, b);
        System.out.println(one.status());
    }
}
