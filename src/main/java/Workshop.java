import java.util.List;


public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        // TODO: Implementar el método para retornar la suma de dos números enteros.
        // Ejemplo: Si a = 3 y b = 5, el resultado debería ser 8.
        return a+b;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        // TODO: Implementar el método para retornar el mayor de los tres números enteros.
        // Ejemplo: Si a = 3, b = 7, y c = 5, el resultado debería ser 7.

int mayor=a;
if(b>mayor) {
mayor=b;
}
if (c>mayor) {
mayor=c;
}
return mayor;
        
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        // TODO: Implementar el método para retornar la tabla de multiplicar del número dado.
        // Ejemplo: Si numero = 2 y limite = 5, el resultado debería ser [2, 4, 6, 8, 10].
int[] tab =new int [limite];
for(int i=0; i< limite; i++) {
tab[i] = numero *(i+1);
}
return tab;
}
     
    

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        // TODO: Implementar el método para calcular el factorial de un número entero.
        // Ejemplo: Si n = 5, el resultado debería ser 120.
        // Lanzar IllegalArgumentException si n es negativo.
if (n<0){
throw new IllegalArgumentException("EL nnumero no es positivo");
}
int res=1;

for (int i=1;i<=n; i++) {

res*=i;

}

return res;

}

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        // TODO: Implementar el método para verificar si un número es primo.
        // Ejemplo: Si numero = 7, el resultado debería ser true.
if (numero <=1) {
        return false;
    }
for (int i =2; i<numero; i++) {
if (numero %i ==0) {
return false;
}
}
return true;

}

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        // TODO: Implementar el método para generar la serie de Fibonacci hasta el número n.
        // Ejemplo: Si n = 5, el resultado debería ser [0, 1, 1, 2, 3].
        // Lanzar "IllegalArgumentException" si n es negativo.

if (n<0) { 
throw new IllegalArgumentException("el numero debe ser positivo");}
int[] sfibo =new int[n];

if (n>1) {

sfibo[0] = 0;}

if (n>=2){

sfibo[1]=1;}

for (int i =2; i<n;i++) {

sfibo[i]=sfibo[i-1]+sfibo[i-2];}

return sfibo;

       
    }

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        // TODO: Implementar el método para sumar todos los elementos de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 15.

int suma=0;
for(int num:arreglo) {
suma+=num;}
return suma;
      
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
        // TODO: Implementar el método para calcular el promedio de los elementos de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
       if(arreglo==null || arreglo.length==0){
return 0.0;
}
int suma=0;
for(int num:arreglo){
suma += num;
    }
return(double)suma/arreglo.length;
}

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        // TODO: Implementar el método para encontrar el elemento mayor en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 5.
if (arreglo == null|| arreglo.length == 0){
return 0;
    }
int mayor=arreglo[0];
for(int i=1; i<arreglo.length/2; i++) {
if(arreglo[i]>mayor) {
mayor=arreglo[i];}}
int indice=arreglo.length/2;
while(indice<arreglo.length){
if(arreglo[indice]>mayor){
mayor=arreglo[indice];}
indice++;}
return mayor;
}

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        // TODO: Implementar el método para encontrar el elemento menor en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 1.
if (arreglo == null|| arreglo.length == 0){
return 0;
    }
int menor=arreglo[0];
for(int i=1; i<arreglo.length/2; i++) {
if(arreglo[i]<menor) {
menor=arreglo[i];}}
int indice=arreglo.length/2;
while(indice<arreglo.length){
if(arreglo[indice]<menor){
menor=arreglo[indice];}
indice++;}
return menor;
}


  

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        // TODO: Implementar el método para buscar un elemento en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y elemento = 3, el resultado debería ser true.

if (arreglo==null||arreglo.length == 0){
        return false;
    }

for(int num:arreglo){
if(num==elemento) {
return true;}}
return false;
}
    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        // TODO: Implementar el método para invertir un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser [5, 4, 3, 2, 1].
if (arreglo==null||arreglo.length == 0){
        return new int[0];
    }

int[] arregloinv=new int[arreglo.length];

for(int i=0; i<arreglo.length; i++){
arregloinv[i]=arreglo[arreglo.length-1-i];}
return arregloinv;
}


    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
        // TODO: Implementar el método para ordenar un arreglo en orden ascendente.
        // Ejemplo: Si arreglo = [5, 4, 3, 2, 1], el resultado debería ser [1, 2, 3, 4, 5].
if (arreglo==null||arreglo.length == 0){
        return new int[0];
    }

int[]arregloord=new int[arreglo.length];
for(int i=0; i<arregloord.length; i++) {
arregloord[i]=arreglo[i];
}

for (int i=0;i<arregloord.length -1; i++){
for (int j=0;j<arregloord.length -1-i; j++){
if (arregloord[j]>arregloord[j+1]){
int temp=arregloord[j];
arregloord[j]=arregloord[j+1];
arregloord[j+1]=temp;
}}}
return arregloord;
}

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        // TODO: Implementar el método para eliminar los duplicados de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 2, 3, 4, 4, 5], el resultado debería ser [1, 2, 3, 4, 5].

if (arreglo==null||arreglo.length == 0){
        return new int[0];
    }

int cunico=1;
for(int i=1; i<arreglo.length; i++) {
if(arreglo[i] !=arreglo[cunico-1]){
arreglo[cunico]=arreglo[i];
cunico++;}}

int[] arreglado= new int[cunico];
for (int j=0; j<cunico; j++){
arreglado [j]=arreglo[j];}
return arreglado;}

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        // TODO: Implementar el método para combinar dos arreglos en uno solo.
        // Ejemplo: Si arreglo1 = [1, 2, 3, 4, 5] y arreglo2 = [6, 7, 8], el resultado debería ser [1, 2, 3, 4, 5, 6, 7, 8]

if (arreglo1==null){
arreglo1=new int[0];}
if (arreglo2==null){
arreglo2=new int[0];}

int[] union=new int[arreglo1.length+arreglo2.length];


for (int i=0; i<arreglo1.length; i++) {
union[i]=arreglo1[i];}

for (int j=0; j<arreglo2.length; j++) {
union[arreglo1.length+j]=arreglo2[j];}
return union;
}


    

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        // TODO: Implementar el método para rotar un arreglo n posiciones.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y posiciones = 2, el resultado debería ser [3, 4, 5, 1, 2].


    if (arreglo == null || arreglo.length == 0) {
        return new int[0]; 
    }
    
    int n = arreglo.length;
    posiciones = posiciones % n;
    if (posiciones < 0) {
        posiciones += n;
    }
 
    posiciones = n - posiciones; 
    
    int[] resultado = new int[n];
    System.arraycopy(arreglo, posiciones, resultado, 0, n - posiciones);
    System.arraycopy(arreglo, 0, resultado, n - posiciones, posiciones);
    
    return resultado;
}

// Método que cuenta los caracteres en una cadena
public int contarCaracteres(String cadena) {
    // TODO: Implementar el método para contar el número de caracteres en una cadena.
    // Ejemplo: Si cadena = "Hello", el resultado debería ser 5.
  if (cadena == null) {
        return 0;
    }

    int contador = 0;
    for (int i = 0; i < cadena.length(); i++) {
        contador++; 
    }
    return contador;
}


    public String invertirCadena(String cadena) {
        // TODO: Implementar el método para invertir una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser "olleH".

if (cadena == null) return null;
StringBuilder sb = new StringBuilder(cadena);
return sb.reverse().toString();
}
    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        // TODO: Implementar el método para verificar si una cadena es un palíndromo.
        // Ejemplo: Si cadena = "madam", el resultado debería ser true.
String cadenau = cadena.replaceAll("\\s+", "").toLowerCase();
     

if (cadenau.length() <= 1) {
         return true;}
    
char[] caracteres = cadenau.toCharArray();
     
int inicio = 0;
int fin = caracteres.length - 1;
     
while (inicio < fin) {
if (caracteres[inicio] != caracteres[fin]) {
             
return false;}
     
inicio++;
fin--;
 }
     
     return true;
 }

 

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        // TODO: Implementar el método para contar el número de palabras en una cadena.
        // Ejemplo: Si cadena = "Este es un test", el resultado debería ser 4.
         if (cadena == null || cadena.trim().isEmpty()) {
        return 0;
    }

   
    String[] palabras = cadena.trim().split("\\s+");
    
    return palabras.length;
}
    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a mayúsculas.
        // Ejemplo: Si cadena = "hello", el resultado debería ser "HELLO".
         if (cadena == null) return null;
    return cadena.toUpperCase();
}

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a minúsculas.
        // Ejemplo: Si cadena = "HELLO", el resultado debería ser "hello".
        if (cadena == null) return null;
    return cadena.toLowerCase();
}

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        // TODO: Implementar el método para reemplazar una subcadena en una cadena por otra subcadena.
        // Ejemplo: Si cadena = "Hello Java", antiguaSubcadena = "Java", y nuevaSubcadena = "world", el resultado debería ser "Hello world".
if (cadena == null || antiguaSubcadena == null || nuevaSubcadena == null || antiguaSubcadena.isEmpty()) {
        return cadena;}

int largocadena = cadena.length();
int largosub = antiguaSubcadena.length();
StringBuilder resultado = new StringBuilder();
int i = 0;

while (i < largocadena) {
boolean coincide = false;

if (i + largosub <= largocadena) {
coincide = true;
for (int j = 0; j < largosub; j++) {
if (cadena.charAt(i + j) != antiguaSubcadena.charAt(j)) {
coincide = false;
break;
}}}
if (coincide) {
resultado.append(nuevaSubcadena);
i += largosub;
} else {
resultado.append(cadena.charAt(i));
i++;
}}
return resultado.toString();
}

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        // TODO: Implementar el método para buscar una subcadena en una cadena y retornar su índice.
        // Ejemplo: Si cadena = "Hello world" y subcadena = "world", el resultado debería ser 6.
        return -1;
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        // TODO: Implementar el método para validar un correo electrónico.
        // Ejemplo: Si correo = "test@example.com", el resultado debería ser true.
        return false;
    }

    // Método que calcula el promedio de una lista de números

    public double promedioLista(List<Integer> lista) {
        // TODO: Implementar el método para calcular el promedio de una lista de números.
        // Ejemplo: Si lista = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
        return 0.0;
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        // TODO: Implementar el método para convertir un número en su representación binaria.
        // Ejemplo: Si numero = 10, el resultado debería ser "1010".
        return "";
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        // TODO: Implementar el método para convertir un número en su representación hexadecimal.
        // Ejemplo: Si numero = 255, el resultado debería ser "FF".
        return "";
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        // TODO: Implementar el método para el juego de Piedra, Papel, Tijera, Lagarto, Spock.
        // Las reglas del juego son:
        // - Piedra vence a Tijera y Lagarto
        // - Papel vence a Piedra y Spock
        // - Tijera vence a Papel y Lagarto
        // - Lagarto vence a Spock y Papel
        // - Spock vence a Tijera y Piedra
String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};
     int indicealeatorio = (int) (Math.random() * 5);
     String eleccionpepe = opciones[indicealeatorio];
     
     if (eleccionUsuario.equals(eleccionpepe)) {
         return "Empate";
     }
     
boolean usuariogana = false;
     
if (eleccionUsuario.equals("Piedra")) {
if (eleccionpepe.equals("Tijera") || eleccionpepe.equals("Lagarto")) {
usuariogana = true;
}
} else if (eleccionUsuario.equals("Papel")) {
if (eleccionpepe.equals("Piedra") || eleccionpepe.equals("Spock")) {
usuariogana = true;
}
} else if (eleccionUsuario.equals("Tijera")) {
if (eleccionpepe.equals("Papel") || eleccionpepe.equals("Lagarto")) {
usuariogana = true;
}
} else if (eleccionUsuario.equals("Lagarto")) {
if (eleccionpepe.equals("Spock") || eleccionpepe.equals("Papel")) {
usuariogana = true;
}
} else if (eleccionUsuario.equals("Spock")) {
if (eleccionpepe.equals("Tijera") || eleccionpepe.equals("Piedra")) {
usuariogana = true;
}}
if (usuariogana) {
return "Ganaste";
} else {
return "Perdiste";
}}

        // El método debe retornar un mensaje indicando el resultado del juego.
        // Ejemplo: Si la eleccionUsuario es "Piedra", el resultado podría ser "Ganaste" o "Perdiste" dependiendo de la elección de la computadora.
       //return "";

    

    public String pptls2(String game[]) {
        //Retornar player ganador o empate
            /*
            Rock = R
            Paper = P
            Scissors = S
            Lizard = L
            Spock = V
        Scissors cuts Paper
Paper covers Rock
Rock crushes Lizard
Lizard poisons Spock
Spock smashes Scissors
Scissors decapitates Lizard
Lizard eats Paper
Paper disproves Spock
Spock vaporizes Rock
Rock crushes Scissors
         */
String p1 = game[0];
String p2 = game[1];

if (p1.equals(p2)) {
return "Empate";
}

if (p1.equals("S")) {
if (p2.equals("P") || p2.equals("L")) {
return "Player 1";
}}
if (p1.equals("P")) {
if (p2.equals("R") || p2.equals("V")) {
return "Player 1";}}
if (p1.equals("R")) {
if (p2.equals("L") || p2.equals("S")) {
return "Player 1";
}}
if (p1.equals("L")) {
if (p2.equals("V") || p2.equals("P")) {
return "Player 1";
}}
if (p1.equals("V")) {
if (p2.equals("S") || p2.equals("R")) {
return "Player 1";
}}
 return "Player 2";
}
    

    public double areaCirculo(double radio) {
return Math.PI * Math.pow(radio, 2);
}

    public String zoodiac(int day, int month) {

if(month<1 || month>12) {
return "Invalid Date";
}
int maxdays;
switch(month){
case 2: maxdays=28; break;
case 4: case 6: case 9: case 11: maxdays=30;
break;
default: maxdays=31; break;
}
if (day<1 || day> maxdays){
return "Invalid Date";
}
    if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) return "Aries";
    if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) return "Tauro";
    if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) return "Gemini";
    if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) return "Cancer";
    if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) return "Leo";
    if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) return "Virgo";
    if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) return "Libra";
    if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) return "Escorpio";
    if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) return "Sagitario";
    if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) return "Capricornio";
    if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) return "Acuario";
    return "Invalid Date";
}

 }




