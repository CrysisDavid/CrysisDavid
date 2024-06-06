import time
class Nodo:
    def __init__(self, valor):
        self.valor = valor
        self.siguiente = None
        # Clase para la lista simple enlazada
        
class Nodo_doble:
    def __init__(self, valor):
        self.valor = valor
        self.siguiente = None
        self.anterior = None
        # Clase para la lista doblemente enlazada
        
        
class Lista_simple:
    def __init__(self):
        self.inicial = None
    def agregar_final(self, valor):
        nuevo_nodo = Nodo(valor)
        if self.inicial is None:
            self.inicial = nuevo_nodo
            return self.inicial
        
        pointer = self.inicial
        while pointer.siguiente is not None:
            pointer = pointer.siguiente
        pointer.siguiente = nuevo_nodo
        return self.inicial
            
    def imprimir_lista(self):
        pointer = self.inicial
        while pointer is not None:
            print(f"[{pointer.valor}]", end = " ")
            time.sleep(1.7)
            pointer = pointer.siguiente
            
class Lista_doble:
    def __init__(self):
        self.inicial = None
        
        
lista_1 = Lista_simple()
lista_1.agregar_final(5)
lista_1.agregar_final(6)
lista_1.agregar_final(7)
lista_1.agregar_final("David")
lista_1.imprimir_lista()
            
            
            

