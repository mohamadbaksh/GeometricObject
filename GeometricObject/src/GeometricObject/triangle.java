package GeometricObject;



public class triangle extends GeometricObject {
	
		private double side1;
		private double side2;
		private double side3;
		private double sides;
		
		
		public triangle(){
			side1= 1;
			side2= 1;
			side3= 3;
			
		}
		
		public triangle (double side1,double side2, double side3){
			this.side1=side1;
			this.side2=side2;
			this.side3=side3;
		}
		
			
		
		public double getSide1() {
			return side1;
		}

		public void setSide1(double side1) {
			this.side1 = side1;
		}

		public double getSide2() {
			return side2;
		}

		public void setSide2(double side2) {
			this.side2 = side2;
		}

		public double getSide3() {
			return side3;
		}

		public void setSide3(double side3) {
			this.side3 = side3;
		}

		public double getArea(){
			 sides = (side1+side2+side3)/2;
			return Math.sqrt(sides*((sides-side1)*(sides-side2)*(sides-side3)));
		}
		public double getPerimeter(){
			return (side1+side2+side3);
		}
		
		public String toString(){
			System.out.printf("The Area of the Triangle is: %.2f", getArea());
			System.out.println("\nThe Parameter of the Triangle is: "+ getPerimeter());
			return (" Side 1 length="+ side1 + "\n Side 2 length=" + side2 + "\n Side 3 length="
					+ side3);
			
		}
		
	}
