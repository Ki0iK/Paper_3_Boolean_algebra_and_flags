public class Main {
    public static void main(String[] args)
    {
        int smallest = 1;
        boolean found = false;
        while (!found)
        {
            if (smallest % 387 == 0 && smallest % 6381 == 0)
                found = true;
            else
                smallest = smallest + 1;
        }
        System.out.println(smallest);

    }
}