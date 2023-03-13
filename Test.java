//Publication program
class Publication
{
private String title;
private double price;
private int copies;
public int getcopies()
{
return this.copies;
}
public void setcopies(int copies)
{
this.copies=copies;
}
public double getprice()
{
return this.price;
}
public void setprice(double price)
{
this.price=price;
}
public void sellcopy(int qty)
{
System.out.println("Total Publication sell:$"+(qty*price));
}
}
class Book extends Publication
{
private String author;
public void ordercopies(int pcopies)
{
setcopies(getcopies()+pcopies);
System.out.println("Total Order Copies:- "+(getcopies()+pcopies));
}
public void sellcopy(int qty)
{
System.out.println("Total Book sell:$"+(qty*getprice()));
}
}
class Magzine extends Publication
{
private int orderQty;
private String currIssue;
public void RecvNewIssue(String pNewIssue)
{
setcopies(orderQty);
currIssue=pNewIssue;
}
public void sellcopy(int qty)
{
System.out.println("Total Magzine sell : $"+(qty*getprice()));
}
}
class Test
{
public static void main(String[] args)
{
Book obj1=new Book();
obj1.ordercopies(3);
obj1.getcopies();
obj1.setcopies(3);
Publication obj2=new Publication();
obj2.getcopies();
obj2.setcopies(5);
obj2.getprice();
obj2.setprice(30);
obj2.sellcopy(4);
Magzine obj3=new Magzine();
obj3.sellcopy(3);
obj3.getprice();
obj3.setprice(20);
}}



 
