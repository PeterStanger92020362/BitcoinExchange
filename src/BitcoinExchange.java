import java.util.Collections;

import static java.util.Arrays.sort;


public class BitcoinExchange {

    /* Prints the array */
    void printArray(Customer[] arr)
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i].getCustomerName() + " ");
        System.out.println();
        System.out.println();
    }

    // Driver method to test above
    public static void main(String[] args)
    {
        BitcoinExchange ob = new BitcoinExchange();
        Customer[] arr = {
                new Customer("Harry",1119,2564),
                new Customer("Megan",459,500),
                new Customer("William",20,60),
                new Customer("Kate",1000,392),
                new Customer("Liz",20000,120000),
                new Customer("Philip",10000,11000)
        };

        System.out.println("The Unsorted array of customers is");
        ob.printArray(arr);

        // apply sort
        sort(arr);
        System.out.println("The Customer array sorted by current investment value is");
        ob.printArray(arr);



    }
}


