import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.LinkedList;


public class Test {

	public static void main(String[] args) {
		
		Person gordan= new Person("Gordan", "Sajević", 24);
		Person edib = new Person ("Edib", "Imamović", 30);
		Person jesenko = new Person("Jesenko", "Gavrić", 26);
		Person necko = new Person("Nedžad", "Hamzić", 26);
		Person davor = new Person ("Davor", "Stanković", 29);
		LinkedList<Person> predavaci = new LinkedList<Person>();
		Person omer = new Person("Mali Omer", "vanbračno", 1);
		Person imran = new Person("Imran", "Imamović", 2);
		Person iman = new Person("Iman", "Imamović", 3);
		Person george = new Person("George", "Stanković", 5);
		Person junior = new Person("Nedžad Junior", "Hamzić", 2);
		Person proljecko = new Person("Proljećko", "Gavrić",3);
		gordan.addChild(omer);
		edib.addChild(imran);
		edib.addChild(iman);
		jesenko.addChild(proljecko);
		necko.addChild(junior);
		davor.addChild(george);
		predavaci.add(gordan);
		predavaci.add(edib);
		predavaci.add(jesenko);
		predavaci.add(necko);
		predavaci.add(davor);
		Person.personToXML(predavaci, System.out);
		String path ="/Users/gordansajevic/Documents/workspace/LabWork29-01-2015/xml/people.xml";
		try {
			Person.personToXML(predavaci, new FileOutputStream(path));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
