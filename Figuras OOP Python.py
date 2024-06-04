import time
class Menu:
    def menu(self):
        print(
"""
Bienvenido
Escoge la figura :
1. para el cuadrado
2. para el circulo
3. para el rectangulo
4. para el triangulo
5. para el rombo
6. para el paralelogramo
7. para el trapecio
8. para el poligono regular
9. para salir del programa""")
        
class Areas:
    def areaCuadrado(self, lado):
        area = lado ** 2
        print(f"El area del cuadrado es: {area}")
        return area
    def areaCirculo(self, radio):
        area = 3.1416 * (radio ** 2)
        print(f"El area del circulo es: {area}")
        return area
    def areaRectangulo(self, base, altura):
        area = base * altura
        print(f"El area del rectangulo es: {area}")
        return area
    def areaTriangulo(self, lado, altura):
        area = (lado * altura) / 2
        print(f"El area del triangulo es: {area}")
        return area
    def areaRombo(self, diagonal1, diagonal2):
        area = (diagonal1 * diagonal2) / 2
        print(f"El area del rombo es: {area}")
        return area
    def areaParalelogramo(self, base, altura):
        area = base * altura
        print(f"El area del paralelogramo es: {area}")
        return area
    def areaTrapecio(self, baseMenor, basePrincipal, altura):
        area = ((baseMenor + basePrincipal) * altura) / 2
        print(f"El area del trapecio es: {area}")
        return area
    def areaPoligono(self, numLados, lado, apotema):
        area = ((numLados * lado )* apotema) / 2
        print(f"El area del poligono es: {area}")
        return area
    
    
class Perimetros:
        def perimetroCuadrado(self, lado):
            perimetro = lado * 4
            print(f"El perimetro del cuadrado es: {perimetro}")
            return perimetro
        
        def perimetroCirculo(self,radio):
            perimetro = 2 * 3.1416 * radio
            print(f"El perimetro del circulo es: {perimetro}")
            return perimetro
        def perimetroRectangulo(self, base, altura):
            perimetro = 2 * (base + altura)
            print(f"El perimetro del rectangulo es: {perimetro}")
            return perimetro
        def perimetroTriangulo(self, lado):
            perimetro = lado * 3
            print(f"El perimetro del triangulo es: {perimetro}")
            return perimetro
        def perimetroRombo(self, lado):
            perimetro = lado * 4
            print(f"El perimetro del rombo es: {perimetro}")
            return perimetro
        def perimetroParalelogramo(self, base, altura):
            perimetro = 2 * (base + altura)
            print(f"El perimetro del paralelogramo es: {perimetro}")
            return perimetro
        def perimetroTrapecio(self, baseMenor, basePrincipal, lado_Izq, lado_Der):
            perimetro = baseMenor + basePrincipal + lado_Izq + lado_Der
            print(f"El perimetro del trapecio es: {perimetro}")
            return perimetro
        def perimetroPoligono(self, numLados, lado):
            Perimetro = numLados * lado
            print(f"El perimetro del poligono es: {Perimetro}")
            return Perimetro
            
class Impresiones():
    def __init__(self): #Se crean los objetos y se inicializan como atributos de la clase para asi poder usarlos en todos los metodos
        self.area = Areas()
        self.peri = Perimetros()
    def impresionCuadrado(self):
        lado = int(input("Ingresar el lado del cuadrado: "))
        self.area.areaCuadrado(lado)
        self.peri.perimetroCuadrado(lado)
        
    def impresionCirculo(self):
        radio = int(input("Ingresar el radio del circulo: "))
        self.area.areaCirculo(radio)
        self.peri.perimetroCirculo(radio)
    def impresionRectangulo(self):
        base = int(input("Ingresar la base del rectangulo: "))
        altura = int(input("ingresar la altura del rectangulo: "))
        self.area.areaRectangulo(altura = altura , base = base)
        self.peri.perimetroRectangulo(altura = altura , base = base)
    def impresionTriangulo(self):
        lado = int(input("Ingresar la base del triangulo: "))
        altura = int(input("Ingresar la altura del triangulo: "))
        self.area.areaTriangulo(lado, altura)
        self.peri.perimetroTriangulo(lado)
    def impresionRombo(self):
        diagonal1 = int(input("Ingresar la diagonal mayor: ")) 
        diagonal2 = int(input("Ingresar la diagonal menor: "))
        lado = int(input("Ingresar el lado del rombo: "))
        self.area.areaRombo(diagonal1 = diagonal1, diagonal2= diagonal2) 
        self.peri.perimetroRombo(lado)
    def impresionParalelogramo(self):
        base = int(input("Ingresar la base del paralelogramo: "))
        altura = int(input("Ingresar la altura del paralelogramo: "))
        self.area.areaParalelogramo(base = base, altura = altura)
        self.peri.perimetroParalelogramo(altura = altura, base = base)
    def impresionTrapecio(self):
        baseMenor = int(input("Ingresar la base menor del trapecio: "))
        basePrincipal = int(input("Ingresar la base principal del trapecio: "))
        lado_Izq = int(input("Ingresar el lado izquierdo del trapecio: "))
        lado_Der = int(input("Ingresar el lado derecho del trapecio: "))
        altura = int(input("ingresar la altura del trapecio: "))
        self.area.areaTrapecio(baseMenor, altura = altura, basePrincipal = basePrincipal)
        self.peri.perimetroTrapecio(baseMenor, basePrincipal, lado_Izq, lado_Der)
    def impresionPoligono(self):
        numLados = int(input("Ingresar el numero de lados del poligono: "))
        lado = int(input("Ingresar el lado del poligono: "))
        apotema = int(input("Ingresar la apotema: "))
        self.area.areaPoligono(apotema = apotema, numLados = numLados, lado = lado)
        self.peri.perimetroPoligono(numLados, lado)
        
newMenu = Menu()    
impr = Impresiones()   
while True:        
    newMenu.menu()
    opcion = int(input())
    
    if opcion == 9:
        print()
        for i in ["Este programa fue hecho como ejercicio de la implementacion de la OOP....", "El programa ha finalizado", "Adios"]:
            print(i)
            time.sleep(1.7)
        break 
    if opcion == 1:
        impr.impresionCuadrado()
    elif opcion == 2:
        impr.impresionCirculo()
    elif opcion == 3:
        impr.impresionRectangulo()
    elif opcion == 4:
        impr.impresionTriangulo()
        
    elif opcion == 5:
        impr.impresionRombo()
        
    elif opcion == 6:
        impr.impresionParalelogramo()
    
    elif opcion == 7:
        impr.impresionTrapecio()
    
    elif opcion == 8:
        impr.impresionPoligono()
        
        
    else:
        print(
"""
+===============+
|Opcion invalida|
+===============+ 
""")

    
    