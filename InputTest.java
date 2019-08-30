public class InputTest {
	public static void main( String[] args ) {

		System.out.print( "名前を入力してください:-> " );
		String name = Input.readString( System.in );
		System.out.println( name );

		System.out.print( "数字を入力してください:-> " );
		int i = Input.readInt( System.in );
		System.out.println( i );
	}
}