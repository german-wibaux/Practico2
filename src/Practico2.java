
public class Practico2 {

	public static void main(String[] args) {
		// Armamos el arbol binario de busqueda
		// Metodo insert
		ArbolBinario tree = new ArbolBinario();
		tree.insert(25);
		tree.insert(20);
		tree.insert(30);
		tree.insert(10);
		tree.insert(40);
		tree.insert(28);
		tree.insert(24);
		tree.insert(45);
		tree.insert(43);
		// Imprimimos el arbol con el metodo inOrder
		tree.inOrder();
		
		//Preguuntamos si existen algunos elementos
		//Metodo hasElement
		System.out.println(tree.hasElement(300));
		System.out.println(tree.hasElement(20));
		System.out.println(tree.hasElement(350));
		System.out.println(tree.hasElement(45));
		System.out.println(tree.hasElement(370));
		
		
		//Ambos poseen una complejidad de log2 n
		
	}

}
