package jour1TP.math.doaImp;

import jour1TP.math.dao.DaoMathematique;

public class DaoMathemematiqueImp implements DaoMathematique {

	@Override
	public int somme(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public double produit(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double division(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public int soustraction(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public double factoriel(int c) {
		// TODO Auto-generated method stub
		double f=1;
		for(int i=2;i<c;i++)
		{
			f*=i;
		}
		
		return f;
	}

}
