package uniandes.dpoo.taller0.modificacion;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {
	/*
	 * La función carga el archivo y busca el pais con mas medallistas.
	 */
	public static void main(String[] args) {
		try {
			CalculadoraEstadisticas calc = LoaderOlimpicos
					.cargarArchivo("C:/Users/arnul/Documents/Taller1_Olimpicos/data/atletas.csv");
			System.out.println(calc.paisConMasMedallistas());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
