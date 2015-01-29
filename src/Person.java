
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.w3c.dom.Node;


public class Person {
	
	private String name;
	private String surname;
	private int age;
	private LinkedList<Person> children;
	
	public Person(String name, String surname, int age) 
	{
		this.children = new LinkedList<Person>();
		this.age = age;
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) 
	{
		if (name.length() < 1)
		{
			throw new IllegalArgumentException("Name cannot be empty field!");
		}
		else
		{
			this.name = name;
		}
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) 
	{
		if (surname.length() <1 )
		{
			throw new IllegalArgumentException("Surame cannot be empty field!");
		}
		else
		{
			this.surname = surname;
		}
	}

	public void addChild(Person p)
	{
		children.add(p);
	}
	
	
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		String str = ""; 
		str += name + " " + surname + " " + age +"\nChildren: ";
		for (int i=0; i<children.size(); i++)
		{
			str += "\n" + children.get(i).name + " " + children.get(i).surname + " " + children.get(i).age;
		}
		return str + "\n";
	}
	
	public Person getFirstChild()
	{
		return children.getFirst();
	}
	
	public LinkedList<Person> getChildren()
	{
		return children;
	}
	
	public static void personToXML(List insans, OutputStream out)
	{
		PrintWriter pw = new PrintWriter(out);
		pw.println("<?xml version = \"1.0\"?>\n");
		pw.println("<People>");
		Iterator<Person> it = insans.iterator();
		Person temp = null;
		while(it.hasNext())
		{
			temp = it.next();
			pw.println("<Person name = '" + temp.name + "' surname = '" + temp.surname + "' age: '" + temp.age + "'>");
			Iterator<Person> iter = temp.children.iterator();
			Person child = null;
			while(iter.hasNext())
			{
				child = iter.next();
				pw.println("\t\t<Child name = '" + child.name + "' surname = '" + child.surname + "' age: '" + child.age + "'/>");
			}
			pw.println("</Person>");
		}
		pw.println("</People>\n");
		pw.flush();
		pw.close();
	}


	

}
