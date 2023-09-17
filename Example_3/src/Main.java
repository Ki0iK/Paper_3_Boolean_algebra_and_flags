public class Main {
    public static void main(String[] args)
    {
        boolean found = false;
        int n = 1, val = 0; // declared outside so that it can be increased
        while (!found)
        {
            val = n*n*n - 1000*n*n; // calc the value and store it
            if (val > 1000000) // check against 1million, if greater -> raise the flag -> true
                found = true; // found the value
            else
                n = n + 1; // if not found, increase n until found -> and go back to the start of the loop
        }
        System.out.println("n = " + n + ", val = " + val);
    }
}