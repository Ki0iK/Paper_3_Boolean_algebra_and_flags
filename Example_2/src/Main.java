public class Main {
    public static void main(String[] args)
    {
        int year = 2004; // year we are testing
        boolean leap = false; // olettaa that not

        if (year % 4 == 0) // testing the conditions one at a time
            leap = true;
        if (year % 100 == 0)
            leap = false;
        if (year % 400 == 0)
            leap = true;
        System.out.println(leap);

        // another way to write the code // best due to the shortness
        boolean leap2; // another boolean variable
        leap2 = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        // boolean expression to evaluate the value and storing it into leap2
        System.out.println(leap2);

        // a third way
        // additional info/explanation
        boolean div4 = year % 4 == 0, div100 = year % 100 == 0, div400 = year % 400 == 0;
        boolean leap3 = (div4 && !div100) || (div4 && div100);

        System.out.println(leap3);
    }
}