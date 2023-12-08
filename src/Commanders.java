
class  BuildierGeneric {
	protected Ficha ficha_;
	protected String[][] matriz_;
	protected String direccion_;

	protected int horizontalValue_, verticalValue_, diagonalValue_;
	protected CommandForCommandFicha finishComand_;


	public BuildierGeneric setFicha(Ficha ficha) {
		ficha_ = ficha;
		return this;
	}

	public BuildierGeneric setTabla(String tabla) {
		String[] rows = tabla.split(".");

		int columnLenght = rows[0].split(" ").lenght;

		matriz_ = new String[rows.lenght][columnLenght];
		for (int i = 0; i < rows.lenght; i++) {
			matriz[i] = row[i].split(" ");
		};
		return this;
	}


	public BuildierGeneric setDireccion(String a) {
		direccion_ = a;
		return this;
	}

	public BuildierGeneric setHorizontalValue(int a) {
		horizontalValue_ = a;
		return this;
	}


	public BuildierGeneric setVerticalValue(int a) {
		verticalValue_ = a;
		return this;
	}

	public BuildierGeneric setDiagonalValue(int a) {
		diagonalValue_ = a;
		return this;
	}

	private Comand generate() {

		Comand comand = new Comand();

		comand.ficha = ficha_;
		comand.matriz = matriz_;
		comand.direccion = direccion_;
		comand.verticalValue = verticalValue_;
		comand.horizontalValue = horizontalValue_;
		comand.diagonalValue = diagonalValue_;
		comand.finishComand = finishComand_;


	}

	public  Comand create() {
		return generate();

	};
	public Comand createWithTablet() {
		Comand comand = generate();
		comand.matriz = matriz_;
		return comand;
	};

	public Comand createWithRecord(PuntajeRecord record) {
		Comand comand = generate();
		comand.record = global;
	}


}


public class Commanders {

	

    public static class FichaSorroundings {
	    public class Buildier extends BuildierGeneric {

		public FichaSorroundings createWithTable() {
			FichaSorrundings comand = new FichaSorroundings();
			comand.ficha = ficha_;
			comand.matriz = matriz_;
			comand.player = player_;
			return comand;
		}
	    }
    }

    public static class FichaDirecction {
	    public class Buildier extends BuildierGeneric {
		public FichaDireccion create() {
			FichaDireccion comand = new FichaDirecction();
			comand.ficha = ficha_;
			comand.matriz = matriz_;
			comand.player = player_;
			comand.direccion = direccion_;
			return comand;
		}

		public FIchaDirecctionMultiple createInAllDireccion() {

		}
	    }
    }

    public static class FichaPuntaje {
	    public class Buildier extends BuildierGeneric<FichaPuntaje> {

		    public FichaPuntaje extends BuildierGeneric {

			public FichaPuntaje createWithRecord(Globaldata globalData) {
				FichaPuntaje comand = new FichaPuntaje();

				comand.horizontalValue = horizontalValue_;
				comand.verticalValue = verticalValue;
				comand.diagonalValue = diagonalValue;

				comand.recordForPuntaje = globalData;
				comand.player = player_;
				return comand;
			}
		    }
	    }
    }
    

    public static class FichaConnect {
	    public class Buildier extends BuildierGeneric<FichaConnect> {
		    public FichaConnect createFrom(CommandCalculo commandCalculo) {
		    }

	    }
}
