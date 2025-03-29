package br.edu.ufra.validarnumeroserie;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class NumeroSerie {
    // Função para validar o número de série
    public static boolean validarNumeroSerie(String numeroSerie) {
        // A expressão regular para validar o formato do número de série (XXXX-XXXX-XXXX-XXXX)

        String Serie = "^[A-Z0-9]{4}-[A-Z0-9]{4}-[A-Z0-9]{4}-[A-Z0-9]{4}$";

        // Compilando a expressão regular
        Pattern pattern = Pattern.compile(Serie);

        //A função match valida se a entrada de dados do usuário está correta, tenta encontrar o padrão no início da string (XXXX-XXXX-XXXX-XXXX)
        Matcher matcher = pattern.matcher(numeroSerie);

        // Verifica se o número de série corresponde ao padrão da expressão regular
        return matcher.matches();
    }

    public static void main(String[] args) {
        // Criando o scanner para receber a entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o número de série
        System.out.print("Digite o número de série (formato XXXX-XXXX-XXXX-XXXX): ");
        String numeroSerie = scanner.nextLine();

        // Verifica se o número de série fornecido é válido
        if (validarNumeroSerie(numeroSerie)) {
            System.out.println("Número de série válido!");  // Será executado se o número de série for válido
        } else {
            System.out.println("Número de série inválido.");  // Será executado se o número de série não for válido
        }
        scanner.close();
    }
}