import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
//请帮小明同学设计一个程序，输入上次考试成绩（int）和本次考试成绩（int），然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）
        Scanner scanner = new Scanner(System.in);
        System.out.println("请你输入上次的考试成绩");
        float score1 = scanner.nextFloat();
        System.out.println("请输入本次的考试成绩");
        float score2 = scanner.nextFloat();
        System.out.printf("上次的成绩%f,本次的成绩为%f\n", score1, score2);
        float up_score = (score2 - score1) / score1 * 100;
        System.out.printf("成绩提高的百分比为%f", up_score);
        System.out.printf("成绩提高的百分比为%.2f%%", up_score);
        float exp = 5.0f/2;
        System.out.printf("%f",exp);
    }
}
