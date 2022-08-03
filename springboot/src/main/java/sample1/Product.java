package sample1;

public class Product {
	private int id;
	private String pname;
	private String batchno;
	private Double price;
	private int noofproct;
	public Product()
	{
		
	}
	public Product(int id, String pname, String batchno, double price, int noofproduct, int noofproct)   
	{  
	super();  
	this.id = id;  
	this.pname = pname;  
	this.batchno = batchno;  
	this.price = price;  
	this.noofproct = noofproct;  
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getBatchno() {
		return batchno;
	}
	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getNoofproct() {
		return noofproct;
	}
	public void setNoofproct(int noofproct) {
		this.noofproct = noofproct;
	}  
	

}
