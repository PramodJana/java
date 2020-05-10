package Generics;

public class Coords<T extends TwoD> {
	T[] coords;
	
	Coords(T[] o){
		coords=o;
	}
}
