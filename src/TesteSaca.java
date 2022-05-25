
public class TesteSaca {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 2222);
		cc.deposita(200);
		
		try {
		cc.saca(300);
		} catch (SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
			
		}

	}

}
