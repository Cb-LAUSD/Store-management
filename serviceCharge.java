public class serviceCharge{
 //instance variables
private String name;
  private double price; 

  // no argument contructor
  public serviceCharge(){
    this.name = "unknown";
    this.price = 0.0;
  }
  //parameterized constructor  
  public serviceCharge(String name,  double price){
    this.name = name; 
 
    this.price =price;
  }
  // Accessor methods
  public String getName(){
    return name;
  }
  public double getPrice(){
    return price;
  }
  //mutator methods 
  public void setName(String name){
    this.name = name;
  }
  public void setPrice(double price){
    this.price = price;
  }
  //to string 
public String toString(){
  return "Product: " + name + " Price:" + price;
}
  
}