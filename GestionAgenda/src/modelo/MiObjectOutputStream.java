package modelo;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MiObjectOutputStream extends ObjectOutputStream{

	public MiObjectOutputStream() throws IOException, SecurityException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MiObjectOutputStream(OutputStream out) throws IOException, SecurityException {
		super(out);
		// TODO Auto-generated constructor stub
	}
	
	protected void writeStreamHeader() throws IOException {}

}
