/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maincra;

/**
 *
 * @author Miguel Angel
 */
public class Materiales<T>{
	private T Esq[];
	private int Indice;
	//contructor
	@SuppressWarnings("unchecked")
	public Materiales(int n){
		// N es la cantidad de elementos
		// que puede guardar mi pila
		Esq = (T[])new Object[n];
		Indice = 0;
	}
	public int cantidad(){
		return Indice ;//-1
	}
	public void apilar(T valor) throws Desb{
		if (this.llena()){
			throw new Desb();
		}
		Esq[Indice] = valor;
		Indice++;
	}
	public T sacar() throws SinElementos{
		if(this.vacia()){
			throw new SinElementos();
		}
		T esacar;
		esacar = Esq[Indice-1];
		Indice--;
		//indice--;
		//esacar = Esquina[indice];
		return esacar;
	}
	public boolean vacia(){
		if (Indice == 0){
			return true;
		}
		return false;
	}
	public boolean llena(){
		if (Indice == Esq.length){
			return true;
		}
		return false;
	}
	public int capacidad(){
		return Esq.length;
	}
	public void vaciarComple() throws SinElementos {
		while(!vacia()) {
		sacar();
	  }
	}
}