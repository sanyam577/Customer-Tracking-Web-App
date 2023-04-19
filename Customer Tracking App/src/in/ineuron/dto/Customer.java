package in.ineuron.dto;

public class Customer {
	private String UId;
	private String name;
	private Integer age;
	private String email;
	private String mobile;
	private String address;
	private String accType;
	private String balance;
	private String adhar ;
	private String pan;
	private String transactions;
	
	public String getUId() {
		return UId;
	}
	public void setUId(String uId) {
		UId = uId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getAdhar() {
		return adhar;
	}
	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getTransactions() {
		return transactions;
	}
	public void setTransactions(String transactions) {
		this.transactions = transactions;
	}
	@Override
	public String toString() {
		return "Customer [UId=" + UId + ", name=" + name + ", age=" + age + ", email=" + email + ", mobile=" + mobile
				+ ", address=" + address + ", accType=" + accType + ", balance=" + balance + ", adhar=" + adhar
				+ ", pan=" + pan + ", transactions=" + transactions + "]";
	}
		

}