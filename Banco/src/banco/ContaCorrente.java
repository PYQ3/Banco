package banco;

public class ContaCorrente extends Conta {
	public double numeroDaAgencia;
	
	public double getNumeroDaAgencia() {
		return numeroDaAgencia;
	}

	public void setNumeroDaAgencia(double numeroDaAgencia) {
		this.numeroDaAgencia = numeroDaAgencia;
	}

	public double numeroContaCorrente;

	public double getNumeroContaCorrente() {
		return numeroContaCorrente;
	}

	public void setNumeroContaCorrente(double numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}

	public double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(Double valor) {
		saldo += valor;
	}

	public void verificaSaldo() {
		System.out.println("Valor do Saldo: " + getSaldo());
	}

	public void AssociaCliente(String nomeCliente, String cpfCliente) {
		String nome = nomeCliente;
		String cpf = cpfCliente;
	}

	public void sacar(double saque) {

		if (saque <= saldo) {
			saque = saque - saldo;
		} else if (saque > saldo) {
			System.out.println("saldo negativo!");
		}

	}

	public void verificaNumerodaConta(double numero) {
		System.out.println(getNumeroContaCorrente());
	}

	public void verificaNumerodaAgencia(int numero) {
		System.out.println(getNumeroDaAgencia());
	}

	@Override
	public double getSaldoDisponivel() {
		// TODO Auto-generated method stub
		return 0;
	}
}
