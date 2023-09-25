public class Main {
    public static void main(String[] args)
    {
        int A = 43, B = 14;
        boolean last_digit = false;
        if (A % 10 == B % 10)
            last_digit = true;
        System.out.println(last_digit);
    }
}