package edu.ieu.hilosJava;

public class Main {
	
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Cliente Micheel", new int[] {2,2,1,5,2});
		Cliente cliente2 = new Cliente("Cliente Eduardo", new int[] {1,3,5,1,1});
		Cliente cliente3 = new Cliente("Cliente Micheel", new int[] {5,2,4,7,2});
		
		Cajera cajero1 = new Cajera("Cajero Cesar");
		Cajera cajero2 = new Cajera("Cajero Isidro");
		Cajera cajero3 = new Cajera("Cajero Micheel");
		
		long initialTime = System.currentTimeMillis();
		
		cajero1.procesarCompra(cliente1, initialTime);
		cajero2.procesarCompra(cliente2, initialTime);
		cajero3.procesarCompra(cliente3, initialTime);
	}

}
