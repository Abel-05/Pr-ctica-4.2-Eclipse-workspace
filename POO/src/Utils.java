public class Utils {
	public static String TipoTriangulo(double a, double b, double c){
		if (!esTriangulo(a, b, c)) {
            return "ERROR";
        }
        if (a == b && b == c) {
            return "EQUILATERO";
        }
        if (a == b || b == c || a == c) {
            return "ISOSCELES";
        }
        return "ESCALENO";
	}

	public static boolean esTriangulo(double a, double b, double c){
		return (a + b > c) && ( a + c > b) && ( b + c > a);
	}

	public static int masFrecuenteInt(int[] numeros){
		int masFrecuente = numeros[0];
        int maxFrecuencia = 0;

        for (int i = 0; i < numeros.length; i++) {
            int frecuencia = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    frecuencia++;
                }
            }
            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                masFrecuente = numeros[i];
            }
        }
        return masFrecuente;
		
	}

	public static int buscarInt(int[] numeros, int num){
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] == num) {
				return i;
			}
		}
		return -1;
	}
}