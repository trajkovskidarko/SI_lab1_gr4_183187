class Point {
	String id;
	double x,y;
	String boja;
	
	public Point(String id, double x, double y, String boja){
		this.id = id;
		this.x = x;
		this.y = y;
		this.boja = boja;
	}
	
	public void setID(String newID){
		this.id = newID;
	}
	
	public void setX(double newX){
		this.x = newX;
	}
	
	public void setY(double newY){
		this.y = newY;
	}
	
	public void setBoja(String newBoja){
		this.boja = newBoja;
	}
	
	public String getID(){
		return this.id;
	}

	public double getX(){
		return this.x;
	}
	
	public double getY(){
		return this.y;
	}
	
	public String getBoja(){
		return this.boja;
	}
	
	public void move (char xDirection, char yDirection) {
		if(xDirection == 'L') x -= 1;
		else if(xDirection == 'R') x += 1;
		if(yDirection == 'U') y += 1;
		else if(yDirection == 'D') y -= 1;
	}

	public void draw () {
		System.out.println("[" + x + "," + y + "]");
	}



}