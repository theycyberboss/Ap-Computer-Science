
import java.util.*;
public class Sales
{
  public static void main(String[] args)
  {
    int[] sales;
    
    //Objects
    Scanner scan = new Scanner(System.in);
    Compute salesCompute = new Compute();
    UserInterface ui = new UserInterface();


    ui.getSalesPersonAmount(scan);            //Needs to call this first to get the
    sales = new int[ui.getTotalSalesPeople()];//Amount of sales people, then create the array

    ui.getSalesPeopleSales(sales,salesCompute,scan);

    salesCompute.computeAverage(sales);
    ui.printSales(sales,salesCompute);

    System.out.println(salesCompute);

  }

}
