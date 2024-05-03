import java.util.Scanner;

class TheScanner {
    public static int[] getArr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значения списка через пробел: ");
        String list = sc.nextLine();
        String[] num = list.split(" ");
        int[] res = new int[num.length];
        for (int i = 0; i < num.length; i++)
        {
            res[i] = Integer.parseInt(num[i]);
        }
        return res;
    }
}
