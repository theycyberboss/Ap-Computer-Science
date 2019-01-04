import java.util.*;

public class UserInterface
{
  private int salesPeople;

  public UserInterface()
  {
    salesPeople = 0;
  }

  //Function to get the the amount of sales people that are being compared
  public void getSalesPersonAmount(Scanner scan)
  {
    System.out.print("# of Sales People: ");
    salesPeople = scan.nextInt();
  }

  //Function used to return the total sales people
  public int getTotalSalesPeople()
  {
    return salesPeople;
  }

  //Function used to enter all the sales persons data based on the number
  //of sales people
  public void getSalesPeopleSales(int[] sales, Compute compute,Scanner scan)
  {
    for(int i = 0; i < sales.length; i++)
    {
      System.out.print("Please enter sales for salesperson " + (i+1) + ": ");
      sales[i] = scan.nextInt();
      compute.addSalesToSum(sales[i]);

      if(i == 0) //Sets the minimum and maximum sales to the first sale entered
      {
        compute.setMinSale(sales[i]);
        compute.setMaxSale(sales[i]);
      }

      compute.computeMaxSales(sales[i],i);
      compute.computeMinSales(sales[i],i);

    }

  }


  //Function used to loop through and print out the sales People
  //and print out the max,min and average sale
  public void printSales(int[] sales,Compute compute)
  {
    System.out.println();
    System.out.println("   Salespersons     Sales");
    System.out.println("-----------------------------");

    for(int i = 0; i < sales.length; i++)
    {
      System.out.println("    ID:" + (i+1) + "            Sales: " + sales[i] + "$" );
    }

    System.out.println("-----------------------------");
    System.out.println("Sum of Sales: " + compute.getSaleSum() + "$");
    System.out.println("Average of Sales: " + compute.getSalesAverage() + "$");
    System.out.println("Maximum Sale - [ " + "ID: "+compute.getMaxSaleID() + " Sale: " + compute.getMaxSale() + "$ ]");
    System.out.println("Mimimum Sale - [ " + "ID: "+compute.getMinSaleID() + " Sale: " + compute.getMinSale() + "$ ]");
  }

  public String toString()
  {
    return "";
  }

  public boolean equals()
  {
    return false;
  }
}
