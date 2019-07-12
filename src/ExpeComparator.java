import java.util.Comparator;

public class ExpeComparator implements Comparator<ResourceInformation>{

	@Override
	public int compare(ResourceInformation o1, ResourceInformation o2) {
		// TODO Auto-generated method stub
		 if (o1.getTotalExp() < o2.getTotalExp()) return -1; 
	        if (o1.getTotalExp() > o2.getTotalExp()) return 1; 
	        else return 0;
	}

}
