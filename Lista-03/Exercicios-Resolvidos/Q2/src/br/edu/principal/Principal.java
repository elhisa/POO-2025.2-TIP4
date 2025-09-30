package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 2;
        int num2 = 6;
        int s = somar(num1, num2);
        System.out.println("soma = " + s);
    }

    public static int somar(int num1, int num2) {
        int s = 0;
        for (int i = num1 + 1; i < num2; i++) {
            s += i;
        }
        return s;
    }
}
