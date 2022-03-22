import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    // Dividing lines
    stroke(0);
    line(width / 2, 0, width / 2, height);
    line(0, height / 2, width, height / 2);

    // Quad 1
    // Horizontal Lines
    for(int intLineX = 0; intLineX <= width / 2; intLineX += width / 20){
      fill(0);
      line(intLineX, height / 2, intLineX, 0);
    }
    
    // Vertical Lines 
    for(int intLineY = 0; intLineY <= height / 2; intLineY += height / 20){
      fill(0);
      line(width / 2, intLineY, 0, intLineY);
    }

    /* Quad 2
    int intCircleSize = width/20;
    for(int intCircleX = width / 2 + intCircleSize; intCircleX > width / 2; intCircleX += width / 10){
      for(int intCircleY = height / 20; intCircleY < height / 2; intCircleY += height / 10){
        fill(0);
        ellipse(intCircleX, intCircleY, intCircleSize, intCircleSize);
      }
    }
    */


  }
  
}