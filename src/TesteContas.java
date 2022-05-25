
public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(22, 333);
		cc.deposita(150);
		
		ContaPoupanca cp = new ContaPoupanca(33, 444);
		cp.deposita(200);

		try {
		cc.transfere(50, cp);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println("CC: "+cc.getSaldo());
		System.out.println("CP: "+cp.getSaldo());
	}

}
