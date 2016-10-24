import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		Main.main("Main");
	}

	Logica app;

	public void settings() {
		size(400, 400);
	}

	public void setup() {
		app = new Logica(this);
	}

	public void draw() {
		app.ejecutar();
	}

}
