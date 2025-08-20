public class AtividadeSala02 {

    public static void main(String[] args){
        String nome = "Lorena";
        String sobrenome = "Rodrigues";
        int idade = 26;
        double peso = 66.7;
        double altura = 1.60;
        double imc = 0;
        System.out.println("Nome:" + nome + " " + sobrenome);
        int anoNasc = 2025 - idade;
        System.out.println("Ano de nascimento: " + anoNasc);
        String txtPesoAltura = "Peso: " + peso + "; Altura: " + altura;
        System.out.println(txtPesoAltura);
        imc = peso/(altura*altura);
        System.out.println("Base de Calculo IMC:" + imc);

    }
}
