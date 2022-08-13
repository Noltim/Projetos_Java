
public class aual {

		public static void main(String[] args) {
			
			

			Double[] carrinhoDeCompras = new Double[]{ 50.0, 51.0, 52.0 };
			Double total = 0.0;
			for(int i = 0; i < carrinhoDeCompras.length; i++) {
				System.out.println("Iteração: " + i + ", Total: " + total);
				total = total + carrinhoDeCompras[i];
			}
			
			System.out.println("Total: " + total);
		}
}
