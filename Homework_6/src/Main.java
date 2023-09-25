public class Main {
    public static void main(String[] args)
    {
        int p = 9;
        boolean prime = false;
        if (p > 1 && p % 1 == 0 && p % p == 0)
            prime = true;
        System.out.println("prime: " + prime);
    }
}