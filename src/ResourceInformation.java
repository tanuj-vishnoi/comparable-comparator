import java.util.ArrayList;
import java.util.List;

public class ResourceInformation implements Comparable<ResourceInformation> {

	
	private String name;
	private int age, totalExp, qaExp;
	private ArrayList<String> skills;
	
	public ResourceInformation(String name,int d,int e,int f,ArrayList<String> skills) {
		this.setName(name);
		this.setAge(d);
		this.setTotalExp(e);
		this.setSkills(skills);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int d) {
		this.age = d;
	}

	public int getTotalExp() {
		return totalExp;
	}

	public void setTotalExp(int e) {
		this.totalExp = e;
	}

	public int getQaExp() {
		return qaExp;
	}

	public void setQaExp(int qaExp) {
		this.qaExp = qaExp;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}
	
	public String toString() {
		return "Name:: "+name+" Age :"+age+" totalExp "+totalExp+" qaExp "+qaExp+" skills "+skills.toString();
	}

	@Override
	public int compareTo(ResourceInformation o) {
		
		 if (this.getAge() <  o.getAge()) return -1; 
	        if (this.getAge() >o.getAge()) return 1; 
	        else return 0;
	}
}
