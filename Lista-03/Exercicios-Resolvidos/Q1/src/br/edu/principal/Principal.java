package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 5;
        int x = verifica(num);

        if (x == 1) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
    }

    public static int verifica(double num) {
        int res;
        if (num >= 0) {
            res = 1;
        } else {
            res = 0;
        }
        return res;
    }
}
