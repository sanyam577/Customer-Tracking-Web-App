package in.ineuron.dto;

public class EListDto {

	private String name;
	private boolean hasaccesstoadmin;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isHasaccesstoadmin() {
		return hasaccesstoadmin;
	}
	public void setHasaccesstoadmin(boolean hasaccesstoadmin) {
		this.hasaccesstoadmin = hasaccesstoadmin;
	}
	@Override
	public String toString() {
		return "EListDto [name=" + name + ", hasaccesstoadmin=" + hasaccesstoadmin + "]";
	}
	
	
}
