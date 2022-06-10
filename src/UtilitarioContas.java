import java.util.List;

public class UtilitarioContas {

	public void somarSaldos (List<Conta> contas) {
		double somaDosSaldos = 0;
		for(int i=0; i < contas.size(); i++) {
			if(contas.get(i) != null) {
				somaDosSaldos += contas.get(i).getSaldo();
			}
		}
		System.out.println("O total da soma dos saldo de todas as contas é de: R$" + somaDosSaldos);
	}
}
