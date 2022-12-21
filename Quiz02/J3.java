package quiz2;

interface IArea {  // IArea 介面宣告
	// 介面方法: 計算面積
	void area();
}

class Circle implements IArea { // Circle 類別宣告
	
	private double r;     // 半徑
	// 建構子
	public Circle(double r) {
		this.r = r;
	}
	// 成員方法: 實作介面方法area()
	public void area() {
		System.out.println("圓形面積: " + 3.1416*r*r);
	}
}

class Rectangle implements IArea {  // Rectangle 類別宣告
	
	private double width;     //寬
	private double height;    //高
	
	// 建構子
	public Rectangle(double w, double h) {
		this.width = w;
		this.height =h;
	}
	
	// 成員方法: 實作介面方法area()
	public void area() {
		
		System.out.println("矩形面積: " + width*height);
	}
}

class Triangle implements IArea {   // Triangle 類別宣告
	private double height;    // 高
	private double bottom;    // 三角形底長

	// 建構子
	public Triangle(double h, double b) {
		this.height = h;
		this.bottom = b;
	}
	
	// 成員方法: 實作介面方法area()
	public void area() {
		System.out.println("三角形面積: "+bottom*height/2);
	}
}

public class J3 {

	public static void main(String[] args) {		
		IArea a;
		Circle c = new Circle(6.0);
		Rectangle r=new Rectangle(10.0, 15.0);
		Triangle t=new Triangle(20.0, 15.0);
		
		for ( int i = 1; i <= 3; i++ ) {
			if ( i == 1 )        
				a = c;  // 圓形
			else if ( i == 2 ) 
				a = r;  // 長方形
			else          
				a = t;  // 三角形
			a.area();
		}
	}
}
