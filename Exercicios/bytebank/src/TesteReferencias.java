
public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); // primeiraConta � uma refer�ncia a uma conta(OBJ)
		primeiraConta.saldo = 300;

		System.out.println("Saldo da primeira: " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;// as duas s�o referencia a mesma conta
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

		segundaConta.saldo += 100;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

		if (primeiraConta == segundaConta) {
			System.out.println("S�o a mesma conta.");
		}

		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
