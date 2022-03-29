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
	  
    // Quadrant Lines
    stroke(0);
    fill(0); // Black
    line(width / 2, 0, width / 2, height); 
    line(0, height / 2, width, height / 2);

    // Quad 1
    // Horizontal Lines
    for(int intLineX = 0; intLineX <= width / 2; intLineX += width / 20)
    {
      fill(0);
      line(intLineX, height / 2, intLineX, 0);
    }
    
    // Vertical Lines 
    for(int intLineY = 0; intLineY <= height / 2; intLineY += height / 20)
    {
      fill(0);
      line(width / 2, intLineY, 0, intLineY);
    }

    // Quad 2 
    int intCircleSize = width / 20; // Circle Size variable 
    for (int intCircleX = width / 2 + intCircleSize; intCircleX <= width - intCircleSize; intCircleX += width / 10)
    {
      for (int intCircleY = intCircleSize; intCircleY <= (height / 2)-intCircleSize; intCircleY += height / 10 ) 
      {
        fill(200, 100, 200); // Purple
          ellipse(intCircleX, intCircleY, intCircleSize, intCircleSize); // Draw Circles
      }
    }

    // Quad 3
    for(int intGradientCol = 0; intGradientCol < (width / 2); intGradientCol ++)
    {
      stroke((intGradientCol * 255) / (width / 2));
      line(intGradientCol, (float)(height / 1.99), intGradientCol, height); // Draw lines to screen
    } 

    // Quad 4 
      fill(200, 90, 0); // Dark Orange 
      stroke(0);
      translate((float)(width * 0.75), (float)(height * 0.75));
      for(int intPetal = 0; intPetal < 8; intPetal ++)
      {
        rotate(PI / 4);
        ellipse((width / 10), 0,(width / 5), (float)(height / 17.6));
      }
      
      // Middle circle
      stroke(0, 105, 51); 
      fill(0, 105, 51); // Camo Green
      ellipse(0, 0, width / 9, height / 9);
    }
  
}