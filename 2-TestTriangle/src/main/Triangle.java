package main;

public class Triangle implements InterfaceTriangle {

	@Override
	public int Tritype(double i, double j, double k) {
		int trityp= 0;
		if (i< 0.0 || j < 0.0 || k < 0.0)
		return 3;
		if (i + j <= k || j + k <= i || k + i <= j) 
		return 3;
		if (i== j) trityp= trityp+ 1;
		if (i== k) trityp= trityp+ 1;
		if (j == k) trityp= trityp+ 1;
		if (trityp>= 2)
		trityp= 2;
		return trityp;
		}
}

