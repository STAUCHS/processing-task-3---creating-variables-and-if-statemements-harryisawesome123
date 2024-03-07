import processing.core.PApplet;
import java.util.Random;

/**
 * A program Sketch.java is a house on a beauitful day drawing that has a random location each time and makes it pink when it reaches a certain depth.
 * @Author: H.Rahukulan 
 *
 */

public class Sketch extends PApplet {

  // Declare Variables
  float HouseY;
  float HouseX;
  String CurrentTime;
  float HouseSize = 150;
	
  public void settings() {
    // Size of my background
    size(800, 800);
  }

  public void setup() {

    // Colour of the sky
    background(52, 151, 227);

    // Randomizer
    HouseX = random(200, width - 250);
    HouseY = random(200, height - 200);

    // Set Time
    CurrentTime = hour() + ":" + minute() + ":" + second();
  }

  public void draw() {

    // House
    if (HouseY < width / 2 || HouseY == width / 2){
      fill(82, 51, 8);
    }
      else if (HouseY > width / 2){
      fill(168, 50, 164);
    }
    rect(HouseX, HouseY, HouseSize, HouseSize);

    // ROOF
    fill(13, 1, 23);
    triangle(HouseX - 25, HouseY, HouseX + 75, HouseY - 100, HouseX + 175, HouseY);
    
    // Sun
    fill(233, 237, 2);
    ellipse(HouseX - 120, HouseY - 120, 75, 75);

    // Door
    fill(237, 61, 2);
    rect(HouseX + 60, HouseY + 90, 30, 60);
    
    // Time
    fill(255);
    textSize(32);
    text("Current Time: " + CurrentTime, 50, 50);

  }
}