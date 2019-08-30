public class Input {
	
	public static String readString( java.io.InputStream in ) {
		return readString( new java.io.InputStreamReader ( in ) );
	}
	public static String readString( java.io.InputStreamReader in ) {
		String str = null;
		try {
			java.io.BufferedReader bf
				= new java.io.BufferedReader( in );
			str = bf.readLine();
		}
		catch( Exception e ) {
			System.err.println( e );
		}
		return str;
	}
	public static int readInt( java.io.InputStream in ) {
		return readInt( new java.io.InputStreamReader( in ) );
	}
	public static int readInt( java.io.InputStreamReader in ) {
		int i = 0;
		try {
			String str = readString( in );
			i = Integer.parseInt( str );
		}
		catch( Exception e ) {
			System.err.println( e );
		}
		return i;
	}
}