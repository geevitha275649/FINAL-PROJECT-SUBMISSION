public class CruiseBook {

	private String refNo;
	private String date;
	private String name;
	private int icPassport;
	private String address;
	private int contactNo;
	private String cruisePackage;
	private String PClass;
	private int PClassPrice;
	private int Pprice;
	private int ExtraPax;
	private int totalPayment;

	public CruiseBook(String refNo, String date, String name, int icPassport, String address, int contactNo,
			String cruisePackage, String pClass, int pClassPrice, int pprice, int extraPax, int totalPayment) {
		super();
		this.refNo = refNo;
		this.date = date;
		this.name = name;
		this.icPassport = icPassport;
		this.address = address;
		this.contactNo = contactNo;
		this.cruisePackage = cruisePackage;
		PClass = pClass;
		PClassPrice = pClassPrice;
		Pprice = pprice;
		ExtraPax = extraPax;
		this.totalPayment = totalPayment;
	}

	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIcPassport() {
		return icPassport;
	}
	public void setIcPassport(int icPassport) {
		this.icPassport = icPassport;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public String getCruisePackage() {
		return cruisePackage;
	}
	public void setCruisePackage(String cruisePackage) {
		this.cruisePackage = cruisePackage;
	}
	public String getPClass() {
		return PClass;
	}
	public void setPClass(String pClass) {
		PClass = pClass;
	}
	public int getPClassPrice() {
		return PClassPrice;
	}
	public void setPClassPrice(int pClassPrice) {
		PClassPrice = pClassPrice;
	}
	public int getPprice() {
		return Pprice;
	}
	public void setPprice(int pprice) {
		Pprice = pprice;
	}
	public int getExtraPax() {
		return ExtraPax;
	}
	public void setExtraPax(int extraPax) {
		ExtraPax = extraPax;
	}
	public int getTotalPayment() {
		return totalPayment;
	}
	public void setTotalPayment(int totalPayment) {
		this.totalPayment = totalPayment;
	}

}
