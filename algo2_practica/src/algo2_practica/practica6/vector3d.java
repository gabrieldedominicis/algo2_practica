package algo2_practica.practica6;

public class vector3d extends punto {
		private float z;




	public vector3d(float x, float y, float z) {
			super(x,y);
			this.z = z;
	}
	
	public vector3d suma(vector3d a, vector3d b) {
			vector3d suma = a;
			suma.x += b.x;
			suma.y += b.y;
			suma.z += b.z;
		return suma;
	}
	
	
	
	public boolean igual(vector3d a, vector3d b) {
		return false;
		
}
	
	

	
}
