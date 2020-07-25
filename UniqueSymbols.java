package miniProj;
import java.util.*;

//import list.Employee;
class cardsDb{
	ArrayList<cards> List = new ArrayList<cards>();
	void addCard(cards c) {
		List.add(c);
	}
	void showDetails(String symbols) {
		Iterator<cards> i = List.iterator();
		while(i.hasNext()) {
			cards c = (cards)i.next();
			if(c.getSymbol().equals(symbols)) {
				System.out.print(c.getSymbol()+" ");
				System.out.println(c.getNumber());
				return;
			}
		}
	}
}
class cards{
	
	cards(){
		System.out.println("object created!");
	}
	String symbols;
	int number;
	void setCardDetails(String symbols,int number) {
		this.symbols = symbols;
		this.number = number;
	}
	String getSymbol() {
		return this.symbols;
	}
	int getNumber() {
		return this.number;
	}
	
}
public class UniqueSymbols {
	static Set<String> hs = new HashSet<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cards c1 = new cards();
		cardsDb cDb1 = new cardsDb();
		c1.setCardDetails("a", 1);
		hs.add("a");
		cDb1.addCard(c1);
		
		cards c2 = new cards();
		c2.setCardDetails("a", 2);
		hs.add("a");
		cDb1.addCard(c2);
		
		cards c3 = new cards();
		c3.setCardDetails("b", 7);
		hs.add("b");
		cDb1.addCard(c3);
		
		cards c4 = new cards();
		c4.setCardDetails("d", 6);
		hs.add("d");
		cDb1.addCard(c4);
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			String retStr = (String) itr.next();
//			System.out.println(retStr);
			cDb1.showDetails(retStr);
		}
	}

}
