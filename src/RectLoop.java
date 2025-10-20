//R4_1

//R3_6
//２重ループバージョン
//n=7,m=10
/*
public class RectLoop extends MyFrame2 {
	public void run() {
		setColor(0,128,0);
		int x;
		int y;
		for(int j=0; j<10; j++) {
			y=80+20*(j%10);
			for (int i=0 ; i<7 ; i++) {
				x=30+20*(i%7);
				System.out.println(i);
				System.out.println("x");
				System.out.println(x);
				System.out.println("y");
				System.out.println(y);
				System.out.println("_________");
				fillRect(x,y,10,10);
				}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("プログラムを実行します");
		MyFrame2 frame1=new RectLoop();
		frame1.setLocation(200,100);
		frame1.setSize(300,400);

	}
}
*/

//準備
/*
public class RectLoop extends MyFrame2 {
	public void run() {
		setColor(0,128,0);
		
		int y = 50;
		for (int i=0 ; i<10 ; i++) {
			
			int x=30;
			for(int j=0 ; j<10 ; j++) {
				fillRect(x,y,10,10);
				x+=20;
			}
			y+=20;
		}	
	}
	
	public static void main(String[] args) {
		System.out.println("プログラムを実行します");
		MyFrame2 frame1=new RectLoop();
		frame1.setLocation(200,100);
		frame1.setSize(300,400);

	}
}
*/


/*
public class RectLoop extends MyFrame2 {
	public void run() {
		
		int y = 50;
		for (int i=0 ; i<10 ; i++) {
			int j2 = i/10;
			int x=30;
			for(int j=0 ; j<10 ; j++) {
				int i2 = j%10;
				setColor(0,50+10*(j2+i2),0);
				fillRect(x,y,10,10);
				x+=20;
			}
			y+=20;
		}	
	}
	
	public static void main(String[] args) {
		System.out.println("プログラムを実行します");
		MyFrame2 frame1=new RectLoop();
		frame1.setLocation(200,100);
		frame1.setSize(300,400);

	}
}
*/

/*public class RectLoop extends MyFrame2 {
	public void run() {
		
		int y = 50;
		for (int i=0 ; i<10 ; i++) {
			int j2 = i%10;
			int x=30;
			for(int j=0 ; j<10 ; j++) {
				int i2 = j/10;
				setColor(0,50+10*(j2+i2),0);
				fillRect(x,y,10,10);
				x+=20;
			}
			y+=20;
		}	
	}
	
	public static void main(String[] args) {
		System.out.println("プログラムを実行します");
		MyFrame2 frame1=new RectLoop();
		frame1.setLocation(200,100);
		frame1.setSize(300,400);

	}
}
*/

public class RectLoop extends MyFrame2 {
	public void run() {
		
		int y = 50;
		for (int i=0 ; i<10 ; i++) {
			
			int x=30;
			for(int j=0 ; j<10 ; j++) {
				setColor(0,40+5*(i+j),0);
				fillRect(x,y,10,10);
				//int a=90+10*(i+j);
				x+=20;
				//System.out.println(a);
			}
			y+=20;
		}	
	}
	
	public static void main(String[] args) {
		System.out.println("プログラムを実行します");
		MyFrame2 frame1=new RectLoop();
		frame1.setLocation(200,100);
		frame1.setSize(300,400);

	}
}