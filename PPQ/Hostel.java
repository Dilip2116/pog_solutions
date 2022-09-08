
public class Hostel {
	private int hostelId;
	private String hostelName;
	private int vacancies;
	private double fee;
	
	
	public Hostel(int hostelId, String hostelName, int vacancies, double fee) {
		super();
		this.hostelId = hostelId;
		this.hostelName = hostelName;
		this.vacancies = vacancies;
		this.fee = fee;
	}


	public int getHostelId() {
		return hostelId;
	}


	public void setHostelId(int hostelId) {
		this.hostelId = hostelId;
	}


	public String getHostelName() {
		return hostelName;
	}


	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}


	public int getVacancies() {
		return vacancies;
	}


	public void setVacancies(int vacancies) {
		this.vacancies = vacancies;
	}


	public double getFee() {
		return fee;
	}


	public void setFee(double fee) {
		this.fee = fee;
	}


	@Override
	public String toString() {
		return "Hostel [hostelId=" + hostelId + ", hostelName=" + hostelName + ", vacancies=" + vacancies + ", fee="
				+ fee + "]";
	}
	
	
	

}
