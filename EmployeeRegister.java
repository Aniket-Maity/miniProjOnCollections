package miniProj;
import java.util.*;

class RegisterEmployee{
	String firstName;
	String secondName;
	String mobileNo;
	String emailId;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}

public class EmployeeRegister {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm=new HashMap<String, String>();  
		hm.put("aniket", "uluberia");
		hm.put("pulak", "kolkata");
		hm.put("anindya", "barasat");
		hm.put("dibyendu", "kolkata");
		Iterator <String> it = hm.keySet().iterator();   
		while(it.hasNext())  
		{  
		String key=it.next();  
		System.out.println("Roll no:  "+key+"     name:   "+hm.get(key));  
		} 
		
		

	}

}
