
class ElectricityBill {
private String 	customerName;
private double	unitsConsumed;
private double	pricePerUnit;
private double  Totalbill;


// setters 
public void SetcustomerName(String customerName ) {
	this.customerName = customerName;
}
public void SetunitsConsumed(double unitsConsumed) {
	this.unitsConsumed = unitsConsumed;
}
public void SetpricePerUnit(double pricePerUnit) {
	this.pricePerUnit = pricePerUnit;
}

//getters
public String getcustomerName() {
	return customerName;
}
public double getunitsConsumed() {
	return unitsConsumed;
}
public double getpricePerUnit() {
	return pricePerUnit;
}
public double getTotalbill() {
	 double Totalbill =  unitsConsumed*pricePerUnit ;
	if(unitsConsumed>500) {
		Totalbill = Totalbill +(Totalbill*10/100);
	}
	return Totalbill;
}
}
public class BILLsystem{
	public static void main(String[] args) {
		ElectricityBill a = new ElectricityBill();
		a.SetcustomerName("Sanjay");
		a.SetunitsConsumed(502);
		a.SetpricePerUnit(50);
		System.out.println("customer's name:" + a.getcustomerName());
		System.out.println("units consumed:" + a.getunitsConsumed());
		System.out.println("price per unit :" + a.getpricePerUnit());
		System.out.println("Total bill :" + a.getTotalbill());
	}
}






