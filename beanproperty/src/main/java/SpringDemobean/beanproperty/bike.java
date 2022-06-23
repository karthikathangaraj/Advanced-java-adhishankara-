package SpringDemobean.beanproperty;

public class bike {
	
	private String brand;
	private String cost;
	private String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	@Override
	public String toString() {
		return "bike [brand=" + brand + ", cost=" + cost + ", Name=" + Name + "]";
	}

	public void display()
	{
		System.out.println(cost);
	}
         
}
