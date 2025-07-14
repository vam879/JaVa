package p187;
//반지름과 이름을 가진 Circle 클래스를 작성하고, Circle 클래스의 객체를 생성, 객체가 생성된 모습을 그려라
public class Circle {
	int radius;
	String name;
	
	public Circle() {}
	
	public double getArea()
	{
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
}
