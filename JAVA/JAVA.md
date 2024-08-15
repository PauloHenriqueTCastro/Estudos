Como funciona o java ?

JVM: Java Virtual Machine. O java, por ser uma linguagem que consegue ser utilizada em varios sistemas operacionais diferentes, utiliza uma maquina virtual para abstrair o código escrito pelo desenvolvedor

JDK: Java Development Kit. É o kit de desenvolvimento do dev. É através dele que o desenvolvedor vai conseguir manipular o arquivo java, seja para compilar ou debugar. Contem o JRE e o JVM.

JRE: Java Runtime environment. É o ambiente de apenas execução do java. Responsavel por armazenar informações como classes e metodos do java.

Tipos primitivos:
int idade = 10;\
long numeroGrande = 10000000000;\
double salarioDouble = 2000;\
float salarioFloat = 2500;\
char  caractere = "M";\
byte idadeByte = 10;\
short idadeShorte = 10;\
boolean isTrue = true;\
boolean isFalse = false;\
String frase = "Isso é uma string";

Operadores lógicos:\
(+) =  soma\
(-) = subtracao\
(/) = divisão\
(*) = multiplicacão\
(%) = resto. Server para verifcar o resto de uma funcao. Pode ser utilizado para verificar se um numero é par ou impar.\
Vão retornar numeros

(<) = menor que\
(>) = maior que\
(<=)  menor igual\
(>=)  maior igual\
(==)  comparacão\
(!=)  diferente\
(+=)  somar valor em uma variavel\
(-=)  subtrai valor em uma variavel\
(*=)  multiplica o valor de uma variavel\
(/=)  divide o valor de uma variavel\
(%=)  retorna o resto de uma variavel\
(++)  incrementa o valor da variavel em mais 1\
(--)  subitrai o valor da variavel em menos 1\ 
Vão rentonar booleanos

&& (AND) = adiciona mais uma variavel/funcao na comparacao e obriga que o valor de entrada seja comparado com elas. Ex: Paulo é legal && divertido = true.\
|| (OR) = adiciona mais uma variavel/funcao na comparacao e permite que os valores de entrada sejam compaiveis com pelo menos uma das comaparacões Ex: Paulo é legal e feio = true. (Obviamente passou por causa do legal skdjskdjs)\

Switch = Uma forma mais facil para verificar se um valor é compativel com uma base pre definida de opcoes.

casting: Permite a conversão de tipos primitivos para outros tipo. Ele meio que forca a entrada da informacao e deixa o retorno dessa variavel meio bugado.

Atalhos:

psvm: public static void main. Cria uma função genérica:

public static void main(String[] args) {\
System.out.println("Hello World!");\
}

sout: system out printlt. Cria um "console.log":\
System.out.println("O que voce deseja imprimir no terminal");

