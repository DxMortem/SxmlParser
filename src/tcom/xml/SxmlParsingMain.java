package tcom.xml;

/**
 * Programa principal
 * @author rlopez
 *
 */
public class SxmlParsingMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SxmlParser parser = new SxmlParser();
		try {
                    if(args.length!=1){
                        System.out.println("Se requiere un nombre de archivo como argumento");
                        System.exit(0);
                    }
                    parser.analizar(args[0]);			
                    System.out.println("El archivo" + args[0] + "esta sintacticamente correcto");System.out.flush();
		} catch (XmlParsingException e) {
			System.out.println(e.getMessage());
		}

	}

}
