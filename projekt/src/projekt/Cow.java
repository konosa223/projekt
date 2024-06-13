package projekt;

public class Cow {
	double X; // polozenie w m 
	double Y;
	double V_x; // predkosc w m/s 
	double V_y;
	double M = 500; //masa kg //
	double K = 0.354; //stała  
	double V_w; // predkosc wiatru 
	double Dt = 0.01;
	double G; // stała grawitacyjna	
	
	void timeflow() { //powoduje zmiane polozenia i predkosci pod wplywem uplywu czasu dt
		X += V_x * Dt;
		Y += V_y * Dt;
		if(V_w < V_x)
			V_x -= Dt * K * (V_w - V_x) * (V_w - V_x) / M;
		else if(V_w > V_x)
			V_x += Dt * K * (V_w - V_x) * (V_w - V_x) / M;
		V_y -= G * Dt;
	}
	
	Cow(double x,double y, double v_x, double v_y, double gravity, double wind){
		X = x;
		Y = y;
		V_x = v_x;
		V_y = v_y;
		G = gravity;
		V_w = wind;
	}
	double getX() {
		return X;
	}
	double getY() {
		return Y;
	}
	double getV_y() {
		return V_y;
	}
	double getV_x() {
		return V_x;
	}
	double getV_w() {
		return V_w;
	}
}