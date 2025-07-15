package day12;

public class EncapsulationEx {
	
	private int id;
	private String name;
	private long phoneNo;
    private int age;
    
    
    public int getId() {
    	return id;
    }
    
    public void setId(int id) {
    	this.id=id;
    }
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public long getPhoneNo() {
    	return phoneNo;
    }
    
    public void setPhoneNo(long phoneNo) {
    	this.phoneNo = phoneNo;
    }
    public int getAge() {
    	return age;
    }
    
    public void setAge(int age) {
    	this.age = age;
    }


    
	

public static void main(String[] args) {
	
	EncapsulationEx emp = new EncapsulationEx();
	emp.setId(22);
	System.out.println("employee ID 1 : "+emp.getId());
	emp.setName("Arun");
	System.out.println("Employee Name : "+emp.getName());
	emp.setPhoneNo(9233359588l);
	System.out.println("employee PhoneNo : "+emp.getPhoneNo());
	emp.setAge(45);
	System.out.println("employee Age : "+emp.getAge());
	
	emp.setId(24);
	System.out.println("employee ID : "+emp.getId());
	
}

}
