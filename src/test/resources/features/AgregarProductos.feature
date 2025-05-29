# language: es
Característica: Agregar productos al carrito de compras
  @AgregarCarrito
  Escenario: Agregar 2 productos al carrito de compras
    Dado que me encuentro en la página de 'https://sanangel.com.co/'
    Cuando agrego al carrito el primer producto con una cantidad de 2
    Y agrego al carrito el segundo producto con una cantidad de 5
    Entonces debería ver que el carrito contiene 7 productos