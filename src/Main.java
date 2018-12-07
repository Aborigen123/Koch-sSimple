import ch.aplu.turtle.Turtle;

public class Main extends Turtle{
 public Main() {
	 hideTurtle();
	 setPos(-90,0);// point begin
	 right(90);//90 rotaite
	 koch(300, 4);//size
 }
 private void koch(double s, int levels) {
	 if(levels == 0) {
		 forward(s);
		 return;
	 }else {
		 s /= 3;// close average   triangular bump
		 koch(s, levels - 1);
		 left(60);// begin average   triangular bump
		 koch(s, levels -1);
		 right(120);
		 koch(s, levels -1);
		 left(60);
		 koch(s, levels -1);
	 }
 }
	public static void main(String[] args) {
		
new Main();
	}

}
