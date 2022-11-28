package Covarianza;

public class Principal {
	public static void main(String []args) {
		xx = yy.foo(xx); //B = A.foo(B)  -- X = Y.foo(X)
		xx = yy.foo(yy); //B = A.foo(A)  -- X = Y.foo(Y)
		yy = yy.foo(zz); //A = A.foo(A)  -- Y = Y.foo(Z)
		//zz = yy.foo(zz); //A = A.foo(A)  -- Z = Y.foo(Z) //error
		//yy = xx.foo(zz); //A = B.foo(A)  -- Y = X.foo(Z) //error
		xx = zz.foo(zz); //A = A.foo(A)  -- Z = Y.foo(Z)
		
		//un Y no puede ser un Z
		//un Z puede ser un X
		//un X no puede ser un Y
		
		//no varía nada asi cambio el "new A"  "new B"
		//aparecen errores si cambio el orden de X, Y, Z
	}

}
