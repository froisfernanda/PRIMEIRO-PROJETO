public class Main {
    public static void main(String[] args) {

        System.out.println("Esse e o Screen Match!");
        System.out.println("Filme: Gente Grande: Gente Grande 2");

        int anoDeLancamento = 2010;
        System.out.println("anoDeLançamento : " + anoDeLancamento);
        boolean incluindoNoPlano = true;
        double notaFilme = 9.0;

        //Média calculada pelas 3 notas da Lucas, Fernanda e Auany
        double media = (9.0 + 9.5 + 9.0 ) /3;
        System.out.println(media);
        String sinopse = "A morte do treinador de basquete de infância de velhos amigos reúne a turma no mesmo lugar que celebraram um campeonato anos atrás. Os amigos, acompanhados de suas esposas e filhos, descobrem que idade não significa o mesmo que maturidade.";
        System.out.println(sinopse);
        int classcificacao = (int)(media / 2);
        System.out.println(classcificacao);
    }
}