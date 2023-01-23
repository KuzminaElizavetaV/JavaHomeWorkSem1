import java.util.Scanner;

//Написать программу вычисления n-ого треугольного числа

public class Task1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число n: ");
        //boolean flag = input.hasNextInt();
        int n = input.nextInt();
        getTriangularNumber(n);
    }

    static void getTriangularNumber(int a){
        if (a > 0){
            int Tn = (a * (a + 1)) / 2;
            System.out.println(Tn);
        }else {
            System.out.println("Неккоректное число. Введите натуральное число n");
        }
    }
}
