import java.util.ArrayList;
import java.util.List;

public class TesteSoma {

	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente(22, 333);
		cc1.deposita(200);

		ContaCorrente cc2 = new ContaCorrente(33, 444);
		cc2.deposita(150);
		
		ContaCorrente cc3 = new ContaCorrente(44, 555);
		cc3.deposita(10);
		
		ContaPoupanca cp1 = new ContaPoupanca(55, 666);
		cp1.deposita(50);
		
		UtilitarioContas uc = new UtilitarioContas();
		
		List <Conta> contas = new ArrayList<Conta>();
		
		contas.add(cc1);
		contas.add(cc2);
		contas.add(cc3);
		contas.add(cp1);
		
		uc.somarSaldos(contas);

	}

}
