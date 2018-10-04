package tool;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;

/**
 * @author searphimlyx
 *
 */
public class Clone implements Cloneable, Serializable {
	
	private String test = "a";

	// public test2(String test) {
	// // TODO Auto-generated constructor stub
	// this.test = test;
	// }

	@Override
	protected Object clone() throws CloneNotSupportedException {
		/**
		 * Override clone object to deep clone
		 */
		return (Clone) super.clone();
	}

	/**
	 * @return
	 * @throws IOException
	 * @throws OptionalDataException
	 * @throws ClassNotFoundException
	 */
	public Object serializeDeepClone() throws IOException,
	/**
	 * serial deep clone
	 */

	// InputStream
		OptionalDataException, ClassNotFoundException {
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		ObjectOutputStream oo = new ObjectOutputStream(bo);
		// OutputStream
		oo.writeObject(this);
		ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
		ObjectInputStream oi = new ObjectInputStream(bi);
		return (oi.readObject());
	}

	
	public static void main(String[] args) throws CloneNotSupportedException,

	OptionalDataException, ClassNotFoundException, IOException {
		Clone a = new Clone();
		Clone b = (Clone) a.clone();
		a.test = "c";
		System.out.println(b.test);
		System.out.println(a.test);
	}

	

}