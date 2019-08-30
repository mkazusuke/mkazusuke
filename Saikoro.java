public class Saikoro {

        public static int score = 100;
                                                                                
        public static int bet = 5;

	public static int round = 1;

        public static String[] diceStrings = {
                "| * |", "| : |", "|...|", "|: :|"," |:.:|"," |:::|" };
                                                                                
        public static void throwDices() {
                                                                                
                int me1 = (int)(Math.random()*6.0);
                int me2 = (int)(Math.random()*6.0);
                showDices( me1, me2 );
                checkPoints( me1, me2 );
        }
        public static void showDices( int a, int b ) {
                                                                                
                System.out.println("");
                System.out.println( diceStrings[a] + " " + diceStrings[b] );
                System.out.println( "" );
        }
        public static void checkPoints( int a, int b ) {
                                                                                
                int c = a + b + 2;
                if( c%2 == 0 ) {
			if( a == b ) {
                        	score += bet*2;
             	           System.out.println( "あなたは　" + bet*2 + "$　勝ちました。" );
               		 }
			else { 
				score += bet;
				System.out.println( "あなたは " + bet + "$　勝ちました。" );
			}
		}
                                                                                
                else {
			if( c == 7 ) {
				score -= bet*2;
				System.out.println( "あなたは　" + bet*2 + "$　負けました。");
	                }
			else {
				score -= bet;
				System.out.println("あなたは " + bet + "$　負けました。" );
			}
		}
	        System.out.println( "あなたの持ち金は" + score + "$　です。" );
        }
	public static void keyInput() {
                try {
                        int c = System.in.read();
                }
                catch( Exception e ) { }
        }
	public static void main( String[] args ) {
                                                                                
		while( score > 0 ) {
			System.out.println( "" );
			System.out.println( "エンターキーを押してください。" );
			keyInput();
			System.out.println( "" );
			System.out.println( "ラウンド:" + round );
			throwDices();
			round++;
		}
		System.out.println( "あなたのお金はなくなりました。ゲームオーバーです。" );
                                                                                
        }
}