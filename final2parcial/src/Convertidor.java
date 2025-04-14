public class Convertidor {
    private int numero;

    public static String arabigoaRomano(int numero) {
        //validar que sea un numero entre 1 y 50
        if (numero < 1 || numero > 50) {
            throw new IllegalArgumentException("El numero debe estar entre 1 y 50.");
        }

        StringBuilder romano = new StringBuilder();
        while (numero >= 50) { romano.append("L"); numero -= 50; }
        while (numero >= 40) { romano.append("XL"); numero -= 40; }
        while (numero >= 10) { romano.append("X"); numero -= 10; }
        while (numero >= 9)  { romano.append("IX"); numero -= 9; }
        while (numero >= 5)  { romano.append("V"); numero -= 5; }
        while (numero >= 4)  { romano.append("IV"); numero -= 4; }
        while (numero >= 1)  { romano.append("I"); numero -= 1; }

        return romano.toString();
    }

    public static int romanoaArabigo(String numeroRomano) {
        if (!RomanoValido(numeroRomano)) {
            throw new IllegalArgumentException("Numero romano invalido.");
        }

        int total = 0;
        int previo = 0;

        for (char  variable: numeroRomano.toCharArray()) {
            int valor = obtenerValor(variable);
            if (valor > previo) {
                total += valor - 2 * previo;
            } else {
                total += valor;
            }
            previo = valor;
        }

        return total;
    }

    public static boolean RomanoValido(String entrada) {
        // El rango permitido se valida con lo siguiente, y que esté en mayusculas
        return entrada.matches("^(L|XL|X{0,3}(IX|IV|V?I{0,3}))$");
    }

    private static int obtenerValor(char variable) {
        switch (variable) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            default: throw new IllegalArgumentException("Variable romana desconocida: " + variable);
        }
    }
}