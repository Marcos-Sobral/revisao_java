public class Condicionais {
    public static void main(String[] args) {
        int idade = 16;
        if (idade >= 18) {
            System.out.println("Você é maior de idade: "); 
        } else if(idade >= 16) {
            System.out.println("Você pode votar, mas não pode dirigir.");
        }else {
            System.out.println("Você é menor de idade.");
        }
    }
}
