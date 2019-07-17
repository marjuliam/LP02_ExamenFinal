# LP02 - EXAMEN FINAL

## Propósito

Análisis, diseño e implementación de una herramienta (prototipo) de software que permita realizar combinación de correspondencia a partir de un archivo fuente de información y una plantilla o modelo de documento a generar. El archivo fuente es una tabla (por ejemplo, Excel) cuyas columnas son los campos.

## Integrantes

|       Integrante      |                 Correo                       |
|-----------------------|-----------------------------------------------|
| Luis Alejandro Higuarán Serrano      |    <lahiguarans@unal.edu.co>    |
| Yesid Alberto Ochoa Luque      |    <yaochoal@unal.edu.co>     |

## Requisitos
Java 1.8 o superior.

## Instrucciones de ejecución
1. Abrir el ejecutable Programa/Taller.jar
2. Seleccionar la plantilla_ejemplo.txt
3. Seleccionar la tabla_ejemplo.xlsx
4. Seleccionar una carpeta donde guardar los documentos generados.
5. Oprimir en Iniciar Programa.

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
|  AND      |    '&&'     |
|  OR      |    '||'     |
|  NOT      |    '!'     |
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

### g. Informe ejecutivo, ejemplos:
