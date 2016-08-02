package session5.assignment2;

public class BuildingTypes extends Buildings {

	BuildingTypes(double l, double b, double h, int noOfStorey, String color) {
		super.l = l;
		super.b = b;
		super.h = h;
		super.noOfStorey = noOfStorey;
		super.color = color;

	}

	public static void main(String[] args) {

		BuildingTypes bt1 = new BuildingTypes(6.7, 7.6, 8, 5, "white");

		System.out.println("First Building has following specifications ");
		System.out.println("Length=" + bt1.l + "m Breadth= " + bt1.b + "m Height= " + bt1.h + "m No of Storey= "
				+ bt1.noOfStorey + " Color= " + bt1.color);

		BuildingTypes bt2 = new BuildingTypes(7.0, 8.69, 9.6, 7, "Gray");

		System.out.println("Second Building has following specifications ");
		System.out.println("Length=" + bt2.l + "m Breadth= " + bt2.b + "m Height= " + bt2.h + "m No of Storey= "
				+ bt2.noOfStorey + " Color= " + bt2.color);

	}

}
