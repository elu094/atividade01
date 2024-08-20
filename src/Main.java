public class Main {
    public static void main(String[] args) {

        System.out.println("Rafael");

        //TipoDaVariavel nomeDaVariavel= valorDaVariavel
        //String é um TEXTO
        String nome = "Eluisa";
        char sexo = 'F';

        // [] -> Diz que é um array
        // {} -> Indicar um objeto
        char[] textoChar = {'5'};

        //Guardar valores Reais
        double altura = 1.69;
        Double peso = 65.0;
        float alturaPessoa2 = 1.70f;
        Float pesoPessoa3 = 68.0f;
        int numeroCasa = 10;
        Integer numeroAlunos = 1;
        Long numeroGolsDoBraitWaith = 3l;

        //Operadores Aritimeticos
        // + para soma
        // - para subtração
        // * para multiplicação
        // / para divisão

        Integer soma = 5 + 5;
        Integer subtração = 5 - 2;
        Integer multiplicar = 5 * 5;
        Integer dividir = 5 / 5;

        Integer resultadoSoma = soma + subtração;
        Integer resultadoSubtração = soma - subtração;
        Integer resultadoMultiplicar = soma * subtração;
        Integer resultadoDivisão = soma / subtração;

        System.out.println("Valord da divisão é" + resultadoDivisão);
        System.out.println("Valord da multiplicação é" + resultadoMultiplicar);
        System.out.println("Valord da Soma é" + resultadoSoma);
        System.out.println("Valord da Subtração é" + resultadoSubtração);
    }
}