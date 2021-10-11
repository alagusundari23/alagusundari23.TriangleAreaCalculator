public class Triangle{

 public static void main(String[] args){
   Point A=new Point(10,20);  
   Point B=new Point(10,60); 
   Point C=new Point(80,20);
   System.out.println("Area of trianle using formula:" +Main.area(A,B,C));
}
}
class Point{
 int x;
 int y;
 public Point(int x, int y){
  this.x= x;
  this.y= y;
  }
}
class Main{
   public static float area (Point A,Point B,Point C){
     float area=(A.x*(B.y-C.y) + B.x*(C.y-A.y) + C.x*(A.y-B.y))/2.0f;
     return Math.abs(area);
     }
}

