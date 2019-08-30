public class Saikoro2 {
	public static int score = 100;
	public static int bet = 5;
	public static int round = 1;
                                                                                
        public static final int EVEN = 0;
        public static final int ODD = 1;
        public static int choice = EVEN;
                                                                                
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
                int d = 0;
                if( c%2 == choice ) {
                        if( a == b || c == 7 )
                               d = bet*2;
                        else
                                d = bet;
                }
                else {
                        if( a == b || c == 7 )
                                d = -bet*2;
                        else
                                d = -bet;
                }
                score += d;
                String message1 = "あなたは ";
                if( d > 0 )
                        message1 += ( d + "$を手に入れました！" );
                else
                        message1 += ((-d) + "$　負けました。" );
                String message2 = "あなたの持ち金は " + score + "$　です。";
                                                                                
                System.out.println( message1 );
                System.out.println( message2 );
}
        public static void keyInput() {
                try {
                        int c = System.in.read();
                }
                catch( Exception e ) {}
        }
        public static void choice() {
                                                                                
                System.out.println( "" );
                System.out.println( "偶数か奇数かを選んでエンターを押してください。" );
		System.out.println( "偶数ならEVEN　奇数ならODDと入力してください。" );
                System.out.print( "EVEN or ODD-> " );
                String str = Input.readString( System.in );
                if( str.startsWith( "e" ) || str.startsWith( "E" )) {
                        choice = EVEN;
                }
                else {
                        choice = ODD;
                }
        }
	public static void bet() {
		System.out.println( "" );
		System.out.println( "掛け金を入力してください。" );
		System.out.print( "-> " );
		bet = Input.readInt( System.in );
	}




         public static void main( String[] args ) {
               while( score > 0 ) {
                        System.out.println( "" );
                        System.out.println( "ラウンド:" + round );
                        choice();
			bet();
                        throwDices();
                        round++;
	        }
        	System.out.println( "あなたの持ち金は無くなりました。ゲームオーバーです。" );
	}
}