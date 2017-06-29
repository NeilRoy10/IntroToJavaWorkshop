import ddf.minim.*;        
AudioSample sound;

  int x = 220;
  int y = 275;
  int acceleration = 1;
  PImage catPic;
void setup(){
  size (700, 500);
   catPic = loadImage("catpic.jpg");
  catPic.resize(700, 500);
  background(catPic);
  
}
void draw(){
  noStroke();
  fill(#E85050);
ellipse (x, y, 55, 55);
ellipse(x+110, y, 60, 50);
  if(x > 700){
  background(catPic);
  x = 220;
  y = 275;
  noStroke();
  fill(#E85050);
  ellipse (x, y, 55, 55);
ellipse(x+110, y, 60, 50);
acceleration = 1;
  
  
}
  
}
void keyPressed(){
  
  acceleration = acceleration + 1;
  x = x + acceleration;
  y = y + acceleration;
  if (key == ' '){
    acceleration = 1;
    
    
  }
  
 }
