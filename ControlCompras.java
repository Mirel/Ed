package JUnit;

public class ControlCompras {

	public static void main(String[] args) {
		
		Producto producto = new Producto(null);
		// TODO Auto-generated method stub
        producto.setNombreProducto("tomates");
        producto.setNombreProducto("tomates");
        
        Compra compras = new Compra(null);
        
        compras.eliminarProducto("tomates", 0);
        
        
	}

}
