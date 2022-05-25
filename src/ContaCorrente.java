
public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		super.saca(valor+=0.2);
	}

	@Override
	public void deposita(double valor) {
        super.saldo += super.saldo + valor;
    }

	@Override
	public double getValorImposto() {
		return 0.01*super.saldo;
	}
}
