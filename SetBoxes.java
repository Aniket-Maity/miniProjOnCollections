package miniProj;
import java.util.*;
class Box{
	Box(){
		System.out.println("New box created!");
	}
	double length;
	double width;
	double height;
	Box(double length,double width,double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	double getLength() {
		return this.length;
	}
	double getWidth() {
		return this.width;
	}
	double getHeight() {
		return this.height;
	}
	double getVolume() {
		return this.length*this.width*this.height;
	}
}

public class SetBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Box> boxSet = new HashSet<Box>();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number of box:");
		int N = scn.nextInt();
		int i=0;
		while(N>0) {
			N--;
			i++;
			System.out.println("enter details of box "+i+" :");
			System.out.println("Enter Length:");
			double length = scn.nextDouble();
			System.out.println("Enter Width:");
			double width = scn.nextDouble();
			System.out.println("Enter Height:");
			double height = scn.nextDouble();
			Box b1 = new Box(length,width,height);
			if(i==1) {
				boxSet.add(b1);
			}
			Iterator<Box> itr = boxSet.iterator();
			
			while(itr.hasNext()) {
				Box b = itr.next();
				
				if(b1.getVolume()!=b.getVolume()) {
					boxSet.add(b1);
				}
			}
			
		}
		
		System.out.println("unique boxes in set are: ");
		Iterator<Box> itr = boxSet.iterator();
		while(itr.hasNext()) {
			Box b = itr.next();
			System.out.println("Length ="+b.getHeight()+" Width ="+b.getLength()+" Height ="+b.getWidth()+" Volume ="+b.getVolume());
		}

	}

}
