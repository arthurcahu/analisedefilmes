public class Main {
    public static void main(String[] args) {
        
        System.out.printf("Esse é o Screen Match!!!!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("o ano de lançamento é:" + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        //media calculada pelas soma das notas fornecidas pelos analistas e dividida por 3
        double media = (9.8 + 6.3 + 5.9) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun: Maverick
                Muito bom!!!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media/2);
        System.out.println(classificacao);


    }
}
