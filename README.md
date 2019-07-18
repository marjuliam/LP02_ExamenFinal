
# LP02 - EXAMEN FINAL

## Propósito

El proyecto del curso consiste en analizar, diseñar e implementar un (pequeño) prototipo de lenguaje de programación imperativo, construyendo, de esta manera, los dos primeros módulos “Preprocessor” (preprocesador) y “Compiler” (compilador) de un sistema de procesamiento del lenguaje  Al implementar estos dos módulos quedaría completo un sistema de procesamiento de lenguaje para una arquitectura computacional basada en Microprocesador Z80.

## Integrantes

|       Integrante      |                 Correo                       |
|-----------------------|-----------------------------------------------|
| Luis Alejandro Higuarán Serrano      |    <lahiguarans@unal.edu.co>    |
| Yesid Alberto Ochoa Luque      |    <yaochoal@unal.edu.co>     |

## Entregables

### a. Diseño de módulos construidos:

### b. Categorías léxicas y sus expresiones regulares asociadas:
|       Categoría léxica     |                 Expresión regular                  |
|-----------------------|-----------------------------------------------|
|  PROGRAMA     |    'programa'   |
|  VAR      |    'var'     |
|  VEC      |    'vec'     |
|  SUMA      |    '+'     |
|  RESTA      |    '-'     |
|  MULT      |    '*'     |
|  DIVI      |    '/'     |
|  IF      |    'if'     |
|  ELSE      |    'else'     |
|  FOR      |    'for'     |
|  MAYORI      |    '>='     |
|  MENORQ     |    '<'     |
|  EQUIVA   |    '=='     |
|  ASIGNAR |    '='     |
|  LLAVE_ABRE|    '{'     |
|  LLAVE_CIERRA|    '}'     |
|  PAR_ABRE|    '('     |
|  PAR_CIERRA|    ')'     |
|  SEMICOLON|    ';'     |
|  ID|    [a-zA-Z_][a-zA-Z0-9_]*     |
|  NUMERO|    [0-9]+     |
|  ESPACIOS|    [ \t\n\r]+     |

### c y d. Gramáticas:
![Diagrama](/ebnfdiagram/l1.jpg )
![Diagrama](/ebnfdiagram/l2.jpg )
![Diagrama](/ebnfdiagram/l3.jpg )
![Diagrama](/ebnfdiagram/l4.jpg )
![Diagrama](/ebnfdiagram/l5.jpg )
![Diagrama](/ebnfdiagram/l6.jpg )
![Diagrama](/ebnfdiagram/l7.jpg )
![Diagrama](/ebnfdiagram/l8.jpg )
![Diagrama](/ebnfdiagram/l9.jpg )
![Diagrama](/ebnfdiagram/l10.jpg )
![Diagrama](/ebnfdiagram/l11.jpg )
![Diagrama](/ebnfdiagram/l12.jpg )
![Diagrama](/ebnfdiagram/l13.jpg )
![Diagrama](/ebnfdiagram/l14.jpg )
![Diagrama](/ebnfdiagram/l15.jpg )
### e. Fuentes de la aplicación construida:
|       Herramienta     |      Descripción     |   Fuentes                  |
|-----------------------|-----------|--------------------------|
|  Z80 Logica      | Para la implementación de la logica del Z80 se utilizo principalmente el manual de esta misma CPU como tambien varios videos de Youtube para entender su funcionamiento basico. |[Manual Z80](https://www.zilog.com/manage_directlink.php?filepath=docs/z80/um0080&extn=.pdf)[ Ciclo de Ejecución de la CPU](https://www.youtube.com/watch?v=p8DeOFI-CKE&t=757s)   |
|  Z80 Instrucciones | Para las instrucciones se utilizo la tabla fuente como tambien el manual para implementar la logica  |   [Tabla de instrucciones del Z80](http://clrhome.org/table/)  |
|  Z80 Assembler    |   Para aprender el assembler del z80 se utilizaron principalmente los 2 enlaces citados para aprender la sintaxis basica y ver ejemplos de programas que ejecuten operaciones matematicas basicas. |[Assembler for Dummies (Z80)](https://www.msx.org/wiki/Assembler_for_Dummies_(Z80))[ Z80 Heaven Math](http://z80-heaven.wikidot.com/math)      |
|  Analizador Léxico, sintáctico y Semántico    |  Para la implementación del Analizador léxico, sintáctico y semántico se utilizo la herramienta ANTLR y el manual llamado The Definitive ANTLR 4 Reference para utilizar esta misma adecuadamente  |[ ANTLR ](https://www.antlr.org/) [ The Definitive ANTLR 4 Reference](https://pragprog.com/book/tpantlr2/the-definitive-antlr-4-reference)     |

### f. Manual de usuario y técnico:

#### 1. Ventana principal:
La ventana principal de nuestro Z80 esta principalmente compuesta por la interfaz que muestra la arquitectura interna del Z80 mostrando los valores de sus registros los cuales se actualizan a cada momento que se ejecute un programa previamente cargado, adicional mente se agregan opciones para reiniciar la CPU y cambiar los ciclos de ejecución para visualizar paso a paso la ejecución del programa o que este se ejecute completamente de principio a fin.
También contamos con un menú superior el cual nos permite acceder a un editor de código el cual explicaremos a continuación.

![Ventana principal](/imgmanual/m1.jpg )
#### 2. Editor de Código:
El editor de código cuenta con una pequeña interfaz la cual permite abrir un archivo con extensión ".ma" la cual es la que usaremos en el lenguaje diseñado para este proyecto el cual se bautizo como MAFE. Así mismo se permite visualizarlo y editarlo. 
Una vez que este terminado el código de nuestro programa se compila oprimiendo el boton de "Compilar" generando el Assembler correspondiente que recibirá el Z80, este Assembler debe ser guardado con el botón "Guardar Assembler" en un archivo de extensión ".asm" la cual elegimos para identificar nuestros archivos de formato Assembler y posteriormente cargar en nuestro Editor de Assembler.

![Editor de codigo](/imgmanual/m2.jpg )
#### 3. Editor de Assembler:
El editor de Assembler cuenta con una pequeña interfaz la cual permite abrir el archivos con extensión ".asm" que hayamos generado previamente en el editor de código, así mismo se permite visualizarlo y editarlo, una vez hayamos terminado de editar o verificar que nuestro Assembler es correcto procedemos a generar el código re-localizable a nuestro Z80 oprimiendo el botón Assemble y visualizando la dirección de memoria y la instrucción de maquina en la casilla de texto inferior.

![Editor de Assembler](/imgmanual/m3.jpg )
#### 4. Editor de Memoria y DEBUG:

**Nota: Paso previo: Para visualizar el código maquina en el Editor de Memoria se debe haber oprimido previamente el botón "Cargar Assembler" en la ventana principal**

El editor de Memoria cuenta con una pequeña tabla la cual permite visualizar y editar el código re-localizable que hayamos generado previamente en el editor de Assembler,una vez hayamos terminado de editar o verificar que nuestro memoria es correcta procedemos a oprimir el botón de **Ejecutar Programa** en la ventana principal visualizando el DEBUG en el editor de memoria de las instrucciones ejecutadas por el Z80.

![Editor de Memoria y DEBUG](/imgmanual/m4.jpg )

#### 5. Especificaciones técnicas del Z80 y el Lenguaje Implementado:
##### a. Z80 instrucciones soportadas: 
Son soportadas todas las instrucciones principales desde la tabla "ver fuente Tabla de Instrucciones" del z80 00 hasta la FF.
##### b. Tipos de variable soportadas: 
Son soportadas las variable de valor numérico y los vectores también de valor numérico que estén definidos en el dominio de 0 hasta 255.

``` ejemplo: ./variables.ma```
```
programa main{
  var numero;
  numero = 3;
  
  vec vector 2;
  vector_1 = 1;
  vector_2 = 2;
  
}

```
##### c. Operaciones matemáticas soportadas por el lenguaje implementado: 
Son soportadas la suma, resta, multiplicación y división de números enteros o variables asociadas a estos.

``` ejemplo: ./operaciones.ma```
```
programa main{
  var a;
  var b;
  var suma;
  var resta;
  var multi;
  var divic;
  
  a = 10;
  b = 5;
  suma = (a+b);
  resta = (a-b);
  multi = (a*b);
  divic = (a/b);
}

```
##### d. Estructuras de selección soportadas por el lenguaje implementado: 
Es soportado el if-else  con operaciones boleanas de mayor igual ">=" menor que"<" y la equivalencia lógica"==".

``` ejemplo: ./ifelse.ma```
```
programa main{
  var a;
  var b;
  var valor;
 
  a = 10;
  b = 5;
  
  if(a>=0){
      valor = (a+b);
  }else{
      valor = (a-b);
  }
}

```

##### e. Estructuras de control iterativas soportadas por el lenguaje implementado: 
Es soportado el ciclo for el cual solo puede repetirse un x numero de veces con un contador siempre de valor 1.

``` ejemplo: ./ciclofor.ma```
```
programa main{
  var inicio;
  var fin;
  var incremento;
  var a;
  
  a = 1;
  inicio = 0;
  fin = 10;
  incremento = 1;
  
  for(inicio;fin;incremento){
      a = (a+1);
  }
}

```

### g. Informe ejecutivo, ejemplos:

## Requisitos
Java 1.8 o superior.

## Instrucciones de ejecución
1. Abrir el ejecutable Programa/Taller.jar
2. Seleccionar la plantilla_ejemplo.txt
3. Seleccionar la tabla_ejemplo.xlsx
4. Seleccionar una carpeta donde guardar los documentos generados.
5. Oprimir en Iniciar Programa.
