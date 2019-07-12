import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<ResourceInformation> objects = new ArrayList<ResourceInformation>();
		MainClass mainClass = new MainClass();
		ResourceInformation obj1 = mainClass.createInstances();
		ResourceInformation obj2 = mainClass.createInstances();
		ResourceInformation obj3 = mainClass.createInstances();
		ResourceInformation obj4 = mainClass.createInstances();
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		objects.add(obj1);objects.add(obj2);objects.add(obj3);objects.add(obj4);
		System.out.println(objects);
		Collections.sort(objects);
		System.out.println(objects);
		
		
		//zfdaads
		ExpeComparator comparator = new ExpeComparator();
		Collections.sort(objects, comparator);
		System.out.println(objects);
	}

	public ResourceInformation createInstances() {
		ArrayList<String> skills = new ArrayList<String>();
		for (int d = 0; d <  new Random().nextInt(); d++)
			skills.add(String.valueOf(d));

		return new ResourceInformation("test" + new Random().nextInt(), new Random().nextInt(), new Random().nextInt(), new Random().nextInt(), skills);
	}

}
