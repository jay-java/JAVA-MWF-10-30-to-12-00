import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Data implements Serializable{
	int id;
	String name;
	float per;
	String address;

	Data(int id, String name, float per, String address) {
		this.id = id;
		this.name = name;
		this.per = per;
		this.address = address;
	}

	@Override
	public String toString() {
		return "id = " + id + " name = " + name + " per = " + per + " address = " + address;
	}
}

public class SertializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Data d = new Data(1, "java", 90.8f, "ahmedabad");
		FileOutputStream fos  =new FileOutputStream("data.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		oos.flush();
		oos.close();
		System.out.println("data stored");
		
		
		FileInputStream fis = new FileInputStream("data.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Data d1 = (Data)ois.readObject();	
		System.out.println(d1);
		
	}
}
