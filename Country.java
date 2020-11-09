package arraylistsorting;

public class Country implements Comparable<Country> {
	int noOfstates;
	String name;
	int code;
	public Country(int noOfstates, String name, int code) {
		super();
		this.noOfstates = noOfstates;
		this.name = name;
		this.code = code;
	}
	public int getNoOfstates() {
		return noOfstates;
	}
	public void setNoOfstates(int noOfstates) {
		this.noOfstates = noOfstates;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Country [noOfstates=" + noOfstates + ", name=" + name + ", code=" + code + "]";
	}
	@Override
	public int compareTo(Country o) {
		int result= this.noOfstates-o.noOfstates;
		return result;
	}
	

}
