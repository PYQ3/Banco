package banco;

public class Clientes extends ContaCorrente {

	public static void main(String[] args) {
		String nome;
		int idade;
		String sexo;
		String endereco;
		String cpf;

	}

	public void VincularcontaCorrente(String nomeConta, String cpfConta) {
		String nome = nomeConta;
		String cpf = cpfConta;
	}

	public void verificaSaldo() {
		System.out.println("Valor do Saldo: " + getSaldo());
	}

	public void depositar(Double valor) {
		saldo += valor;
	}

	public void sacar(double saque) {

		if (saque <= saldo) {
			saque = saque - saldo;
		} else if (saque > saldo) {
			System.out.println("saldo negativo!");
		}
	}

}