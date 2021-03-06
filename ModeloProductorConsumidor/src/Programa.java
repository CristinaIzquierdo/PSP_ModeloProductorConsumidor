public class Programa {
    public static void main(String[] args) {
		final int numMaxPila = 3;
		final int numMaxProductos = 2;
		final int numMaxConsumidores = 15;
		
		
		//Creo la pila, un consumidor y un productor.
		PilaNumeros pila = new PilaNumeros(numMaxPila);	//Los productos maximos que salgan tendrían que ser 3.
		Productor productor = new Productor(1, pila, numMaxProductos);
		Consumidor consumidor = new Consumidor(1, pila, numMaxConsumidores);
		
		//Creo los hilos
		Thread thread_Productor = new Thread(productor);		
		Thread thread_Consumidor = new Thread(consumidor);
		
		//Enciendo los hilos
		thread_Productor.start();
		thread_Consumidor.start();
	}

	//Si hay más productores que consumidores no termina el programa
	//Si hay más consumidores que productores sí termina el programa

    
}
