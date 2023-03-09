public class task_2 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            is_simple(i);
            if (is_simple(i)) System.out.println(i);
        }
    }
    public static boolean is_simple(int num) {
        for (int x = 2; x < num; x++) {
            if (num % x == 0) {
                return false;
            }
        }
        return true;
    }
}
