https://processing.org/tutorials
CODIGO 1--------------------------------------------------------------

void setup (){
 size (480,120); 
}

void draw() {
 if (mousePressed){
   fill(0);
   } else {
     fill(255);
   }
 ellipse(mouseX, mouseY, 80, 80);
 
}
------------------------------------------------------------------------
size(200,200);
rectMode(CENTER);
rect(100,100,20,200);
ellipse(100,70,60,60);
ellipse(119,70,16,32);
line(90,150, 80, 160);
line(110,150,120,160);
---------------------------------------------------------------------------
//Nombre del programa no_loop
float x = 0.0;

void setup() {
  size(200,200);
}

void draw(){
  background(204);
  x = x+ 0.1;
  if (x> width) {
    x = 0;
  }
  line(x,0,x,height);
}

void mousePressed() {
  noLoop();  
}
/*void mouseReleased() {
  loop();
}*/

void keyPressed() {
  if ((key == 'L') || (key == 'l')) {
    loop();
  }
  if ((key == 'R') || (key == 'r')){
    redraw();
  }
}

--------------------------------------------------------------------
