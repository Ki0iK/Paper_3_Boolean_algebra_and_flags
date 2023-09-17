public class Main {
    public static void main(String[] args)
    {
        boolean late = true;
        boolean weekday = true, vacation = false;

        if (!weekday || vacation)
            late = true;
        else
            late = false;
        System.out.println(late);
    }
}