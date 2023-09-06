//Lo primero que hacemos es inportar la libreria del Scanner, para poder usar este posteriormente
//Para ello pondremos la siguiente linea de codigo:

import java.util.Scanner;

//Siempre cerrando cada linea de codigo con el punto y coma ";"

//Ahora iniciamos nuestro codigo con una clase, utilizando la siguiente linea:

public class usodejava{

//Es reglamentario siempre poner el nombre del archivo java en el que estamos trabajando como el nombre de la clase.

//Posterior a esto, creamos un "static void", que es donde pondremos todo el codigo.

    public static void main(String [] args){

        //Este "public static void" le pondremos un nombre de referencia, el cual puede ser "main"
        //También es importante colocar parentesis con los siguientes argumentos dentro: "String [] args"
        //Esto se hace para que el static void funcione con las variables.

        //Después de esto, crearemos una entrada de datos, con la libreria de Scanner que importamos anteriormente
        Scanner entrada = new Scanner(System.in);

        //Le damos un nombre al Scanner, en este caso "entrada" y al igual que una variable, le asignamos el valor "new Scanner(System.in)"
        

        //Creamos variables "String" para poder ocupar nuestro Scanner "entrada":
        String datos;

        //Y para usar esta variable, al igual que python, imprimos un texto en donde queramos que el usuario escriba el texto.
        //Para imprimir una variable utilizamos la siguiente linea de codigo:

        System.out.print("Escriba un texto de ejemplo: ");
        datos = entrada.nextLine();  // -----> en esta parte usamos la variable que creamos, poniendo es Scanner "entrada" con un punto y la
        //                                     acción que queremos que realice, ya sea, tomar un numero o String, en este caso es un String 
        //                                     asi que usamos "nextLine" o también podemos usar "next".

        //Hay que aclarar que hay 2 principales tipos de print, el "print" común y el "println". La diferencia de estos es que mientras el "print"
        //normal nos deja escribir al lado del texto que imprimimos en pantalla, el "println" nos deja escribir abajo del texto impreso en pantalla,
        //ya que la función del println es imprimir pero con un salto de linea.

    

        //Los tipos de datos de entrada que podemos utilizar son (claramente habiendo definido las variables con su tipo antes):
        
        //------------------- TEXTO ------------------------------------
        //--->  nextLine = Sirve para escribir texto en una entrada de datos.
        //--->  next = Sirve, al igual que el nextLine, para escribir texto en una entrada de datos.
        

        //--------------------------- NUMERICO -----------------------------
        //--->  nextInt = Sirve para escribir numeros enteros unicamente en una entrada de datos.
        //--->  nexFloat = Admite numeros decimales como enteros en una entrada de datos.
        //--->  nextDouble = Funcionan igual que los float, pero estos pueden almacenar mas decimales que float (float = 7, double = 15)
        //      ademas los double funcionan en una tasa de 64 bits, mientras que los float funcionan en una tasa de 32 bits.

        //Me gustaria especificar que tambien hay un tipo de dato llamado "long double" pero es esclusivamente para decimales muy largos.


        //Ahora con un "System.out.print" retornamos el texto que le pedimos al usuario:
        System.out.println("Su texto es: " + datos);



        //----------------------------------- TIPOS DE DATOS ------------------------------------------
        
        //---------------- TEXTO -----------------
        //--->  Char = Almacena solo un caracter (letra).
        //--->  String = Puede almacenar mucho mas texto que char y se usa para las entradas de texto.


        //--------------- NUMERICO -----------------
        //--->  Int = Almacena datos numericos enteros, no de otro tipo.
        //--->  Float = Almacena datos decimales y enteros, puede almacenar hasta 7 digitos y funciona en 32 bits.
        //--->  Double = Funciona igual que el floar, pero puede almacenar hasta 15 digitos y funciona en 64 bits.
        //--->  Byte = El numero mas grande que puede almacenar es 255, puede ser menor el numero pero no mayor que 255.

        //----------------------------- Uso del "If" ------------------------------------
        
        //El uso del if es muy simple, es bastante parecido a python solo que tiene sutiles diferencias.

        //Primero hablaremos del if. Para usarlo, lo haremos de la siguiente forma:

        int aux;    //Definimos una variable
        aux = 10;   //Le damos un valor a la variable

        if (aux == 10){  //Ya estando aquí, el if se inicia con parentesis y dentro de ellos podemos la condición a cumplir, en este caso, aux == 10.

            System.out.println("Hola Mundo!"); //Y como la condición se cumple, imprime el "Hola Mundo!"    

        } //Los "if" siempre después de los parentesis se ponen estas llaves, y dentro de ellas el codigo que funcionara cuando se cumpla la condición.


        //--------------------------------- Uso del "While" ------------------------------

        //Al igual que el if, el while tiene un uso muy similar que en python

        int aux2; //Definimos una variable
        aux2 = 0; //Le damos un valor de 0

        while (aux2 < 10){  //Y al igual que el "if", iniciamos el "while" con parentesis, poniendo la condición dentro.

            aux2 = aux2 + 1;  //Hacemos una pequeña sumatoria con la variable, que se cortara cuando la condición del while deje de cumplirse.

            System.out.println("Numero: " + aux2); //Imprimimos nuestra sumatoria con un texto.

        } //Y por ultimo, las llaves, que al igual que el if, dentro de ellas se escribe el codigo.

        //--------------------------------- Uso del Switch ----------------------------------

        //El "switch" sirve para poder usar casos, en caso de querer hacer un menú y simplificar el uso del "if", por ejemplo:
        
        int elección; //Definimos una variable


        System.out.println("Elija una opción: \n Opción 1 \n Opción 2"); //Hacemos una entrada de datos para que el usuario pueda
        elección = entrada.nextInt();                                    //elegir entre 2 o más opciones.

        switch(elección){ //Aquí empezamos con el uso del "switch", al igual que el if y while, usamos los parentesis y dentro la entrada de datos

            case 1: System.out.println("Ha elegido la opción 1"); break; 
            
            //Y Aqui entrar los casos, con ellos podemos hacer menus y demás.
            //Dentro de los casos, especificamente después de los 2 puntos, se coloca la linea de codigo que queremos que se cumpla cuando ingresamos los numeros
            //O en este caso, opciones.

            //De esta forma podemos usar de manera facil el switch, ahorrandonos el uso de los if y optimizando el codigo
            //Ademas que es mas facil de usar.

            case 2: System.out.println("Ha elegido la opción 2"); break;

        }   //Y al igual que antes, las llaves

        entrada.close(); //Por ultimo y finalizando el codigo, es muy importante cerrar el Scanner que utilizamos, para evitarnos algún tipo de error.   
    }   
    
}