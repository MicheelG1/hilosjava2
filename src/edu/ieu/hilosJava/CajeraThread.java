package edu.ieu.hilosJava;

public class CajeraThread extends Thread {
	private String nombre;
	private Cliente cliente;
	private long InitialTime;
	public CajeraThread(String nombre, Cliente cliente, long initialTime) {
		super();
		this.nombre = nombre;
		this.cliente = cliente;
		InitialTime = initialTime;
	}
	
	@Override
	public void run() {
		System.out.print("La cajera " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + cliente.getNombre() + " EN EL TIEMPO " + (System.currentTimeMillis() - InitialTime ) / 1000 + "segs");
		for(int i=0; i < cliente.getCarroCompra().length; i++) {
			this.esperarXsegundos(cliente.getCarroCompra()[1]);
			System.out.println("Procesando el pruducto " + (i + 1) + " ->Tiempo: " + (System.currentTimeMillis() - InitialTime ) / 1000 + "segs" );
		}
		System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR " + cliente.getNombre() + " EN EL TIEMPO: " + (System.currentTimeMillis() - InitialTime ) / 1000 + "segs" );
	}

	private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		}catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public long getInitialTime() {
		return InitialTime;
	}
	public void setInitialTime(long initialTime) {
		InitialTime = initialTime;
	}
	
	

}
