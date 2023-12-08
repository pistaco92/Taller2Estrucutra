import org.junit.jupiter.api.Test;

public class TestCommanders {

    @Test
    public void testSorroundings() {



        String values = "0 0 0 0. " +
                "0 0 0 0. " +
                "0 0 A 0. " +
                "0 0 A 0. ";


        Ficha ficha = Ficha.getBuildier().setPlayer("A").setRow(1).setColumn(2).create();
        Commanders.FichaSorroundings comand = Commanders.FichaSorroundings.createWithTablet(values);
	command.execute();

	// error 
	if (if command.direccion == "horizontal" && command.itsSorrounded == true) {
		assert true;
	} else {
		assert false;
	}
    }

    @Test
    public void testDirecction() {

        String values = "0 0 0 0. " +
                "0 0 0 0. " +
                "0 0 A 0. " +
                "0 0 A 0. ";

        Ficha ficha = Ficha.getBuildier().setPlayer("A").setRow(1).setColumn(2).create();
	Commander.FichaDireccion comand  = Commanders.FichaDireccion.getBuildier().setTablet(values).setDireccion("horizontal").create();
	command.execute();

	if (comand.connect == true && comand.lenght == 3) {
		assert true;
	} else {
		assert false;
	}

    }
    
    @Test
    public void testAllDirecciotion() {
        String values = "0 0 0 0. " +
                "A A 0 A. " +
                "0 B A 0. " +
                "0 B A 0. ";

        Ficha ficha = Ficha.getBuildier().setPlayer("A").setRow(1).setColumn(2).create();
	Commander.FichaDireccionMultiple comands  = Commanders.FichaDireccion.getBuildier().setTablet(values).createInAllDirecction();

	commands.executeAll();
	
	assert (comands.horizontal.lenght == 4 && comands.vertical.lenght == 3 && comands.diagonal.lenght == 0); 
    }



    @Test
    public void testPuntaje() {

	    PuntajeRecord = new PuntajeRecord();
	    

	    Commander.FichaCalculo.setValuePerFicha(20);
	    Commander.FichaCalculo.setValuePerMovimiento(-10);
	    Commander.fichaCalculo.setvaluePerWin(10000);

	    Commander.FichaCalculo comand = Commander.FichaCalculo.getBuildier().setHorizontalValue(1).setVerticalValue(3).setPlayer("A").createWithRecord(PuntajeRecord);
	    command.executeMovement();
	    command.executeForDireccion();

	    if (command.totalWithoutRecord = 10060 && comand.total == PuntajeRecord.jugador1) {
		    assert true;
	    }
	    else {
		    assert false;
	    }

    }


    public void testConect() {
	    boolean check = false;
	    class CommanderFIchaCalculoDummy implements ComandFicha {
		    public final horizontal = 4;
		    public final vertial = 3;
		    public final diagonal = 0;
	    }

	    class CommanderFinishDummy implements ComandForComandFicha {

		    public void execute() {
			    check = true;
		    }
	    }

	    ComandForComandFicha comandCalculo = new CommandFichaCalculo(); 
	    Commander comand = Commander.FichaConectar.Buildier.setComandFinishGame(CommanderDummy).createfrom(ComandCalculo);

	    comand.execute(); 

	    assert comand.oneconnect == true && check == true;



    }
}
