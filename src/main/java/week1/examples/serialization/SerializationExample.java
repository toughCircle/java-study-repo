package week1.examples.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable {
	private static final long serialVersionUID = 1L;

	private String username;
	private transient String password;

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User{" +
			"username='" + username + '\'' +
			", password='" + password + '\'' +
			"}";
	}
}

public class SerializationExample {
	public static void main(String[] args) {
		User user = new User("Alice", "secret123");

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"));
			 ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"))) {

			oos.writeObject(user);

			User desrializedUser = (User)ois.readObject();
			System.out.println(desrializedUser);

		} catch (IOException | ClassNotFoundException exception) {
			exception.printStackTrace();
		}
	}
}
