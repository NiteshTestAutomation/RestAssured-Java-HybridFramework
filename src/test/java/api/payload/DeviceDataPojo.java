package api.payload;

public class DeviceDataPojo {
	
	
	int year ;
	double price ;
	String cpu_model ;
	String hard_disk_size ;
	

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCpu_model() {
		return cpu_model;
	}
	public void setCpu_model(String cpu_model) {
		this.cpu_model = cpu_model;
	}
	public String getHard_disk_size() {
		return hard_disk_size;
	}
	public void setHard_disk_size(String hard_disk_size) {
		this.hard_disk_size = hard_disk_size;
	}

}
