package miniProj;
import java.util.*;
public class CollectAndGroupCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Set<Integer>> cardsMap = new HashMap<String, Set<Integer>>();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number of cards:");
		int N = scn.nextInt();
		int i = 0;
		String symbol;
		int number;
		int sum;

		while(N>0) {
			N--;
			i++;
			System.out.println("enter card "+i+" :");
			symbol = scn.next();
			System.out.println("enter card value");
			number = scn.nextInt();
			if(cardsMap.get(symbol)==null) {
				cardsMap.put(symbol, new TreeSet<Integer>());
			}
			cardsMap.get(symbol).add(number);
		}
		System.out.println("distinct symbols are: ");
		for(String s : cardsMap.keySet()) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		for(String s : cardsMap.keySet()) {
			System.out.println("cards in symbol "+s+" :");
			cardsMap.get(s).size();
			sum = 0;
			for(int element : cardsMap.get(s)) {
				System.out.println(s+" "+element);
				sum+=element;
			}
			System.out.println("number of cards: "+cardsMap.get(s).size());
			System.out.println("sum of numbers: "+sum);
		}

	}

}
