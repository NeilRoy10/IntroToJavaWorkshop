int x = 454;
int y = 100;
PImage maze;
void setup(){
  size(1000 , 700);
  maze = loadImage("maze.png");
maze.resize (1000, 700);
  background(maze);
 
  
  
}
void draw(){
  fill(0, 200, 0);
   ellipse(x, y, 25, 25);
  
  
  
}
void keyPressed(){
  if (key == 'w'){
  y = y - 3;
  }
  if (key == 's'){
y = y + 3;
  }  
  if (key == 'd'){
    x = x + 3;
  }
  
  if (key == 'a'){
  x = x - 3;
  
  }
 background(maze);
}
