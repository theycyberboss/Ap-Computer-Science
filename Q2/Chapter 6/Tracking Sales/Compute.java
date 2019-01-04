public class Compute
{
  private int salesSum;

  private int maxSale,maxSaleID,minSale,minSaleID;
  private double salesAverage;

  public Compute()
  {
    salesSum = 0;
    maxSale = 0;
    minSale = 0;
    maxSaleID = 0;
    minSaleID = 0;
    salesAverage = 0.0;
  }

  public void setMaxSale(int sale)
  {
    maxSale = sale;
  }

  //Function used to set the minimum sale
  public void setMinSale(int sale)
  {
    minSale = sale;
  }

  //Function used to add a salesSum to the totalSalesSum
  public void addSalesToSum(int sum)
  {
    salesSum += sum;
  }

  //Function used to determin who the minimal sale is and
  //set the ,minimum sale and mimimum sale id
  public void computeMinSales(int sale,int id)
  {
    if(sale < minSale)
    {
      minSale = sale;
      minSaleID = id;
    }
  }

  public void computeAverage(int[] sales)
  {
    salesAverage = (double) salesSum / (double) sales.length;
  }

  //Function used to return the sales average;
  public double getSalesAverage()
  {
    return salesAverage;
  }

  //Function used to
  public void computeMaxSales(int sale, int id)
  {
    if(sale > maxSale)
    {
      maxSale = sale;
      maxSaleID = id;
    }
  }

  public int getMaxSale()
  {
    return maxSale;
  }

  public int getMaxSaleID()
  {
    return maxSaleID + 1;
  }

  public int getMinSale()
  {
    return minSale;
  }

  public int getMinSaleID()
  {
    return minSaleID + 1;
  }

  public int getSaleSum()
  {
    return salesSum;
  }

  public boolean equals(Compute c)
  {
    return false;
  }

  public String toString()
  {
    //private int maxSale,maxSaleID,minSale,minSaleID;

    return "[salesSum: " + salesSum + "]" +
    " [maxSale: " + maxSale + "]"  +
    " [minSale: " + minSale + "]"  +
    " [maxSaleID: " + maxSaleID + "]"  +
    " [minSaleID: " + minSaleID + "]" ;
  }

}
