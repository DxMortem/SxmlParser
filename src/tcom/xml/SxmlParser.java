package tcom.xml;

import static tcom.xml.WellformedXmlLexer.ANGD;
import static tcom.xml.WellformedXmlLexer.ANGI;
import static tcom.xml.WellformedXmlLexer.EOF;
import static tcom.xml.WellformedXmlLexer.EQ;
import static tcom.xml.WellformedXmlLexer.ID;
import static tcom.xml.WellformedXmlLexer.SLASH;
import static tcom.xml.WellformedXmlLexer.STRING;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;

/**
 * Parser para el lenguaje Sxml
 * @author DiegoBorrero
 * @author JeffersonCastañeda
 *
 */
public class SxmlParser extends BasicParser{
	
	/**
	 * Conecta el parser con el analizador lexico (clase WellFormedXmlLexer)
	 * @param archName Nombre del archivo para analizar
	 * @throws XmlParsingException Si se detecta cualquier error
	 */
	public void analizar(String archName) throws XmlParsingException{
		InputStream is = SxmlParser.class.getResourceAsStream("/" + archName);
		try {
			ANTLRInputStream in = new ANTLRInputStream(is);

			lexer = new WellformedXmlLexer(in);

			parse();

		} catch (IllegalArgumentException e) {
			throw new XmlParsingException("Caracter invalido en la entrada");
		} catch (IOException e) {
			throw new XmlParsingException("Complicacion de I/O : "+e.getMessage());
		} catch (XmlParsingException e){
			StringBuilder sb = new StringBuilder();
			String eol = System.getProperty("line.separator");
			
			sb.append(e.getMessage());
			sb.append(eol);
			sb.append(eol);
			
			throw new XmlParsingException(sb.toString());

		}

	}
	
	/**
	 * Inicio del proceso de parsing
	 * @throws XmlParsingException
	 */
	private void parse() throws XmlParsingException {
		sigToken();
		PP();
		expect(EOF);		
	}

	/**
	 * Analiza las producciones principales
	 * @throws XmlParsingException
	 */
	
	private void PP() throws XmlParsingException{
		expect(ANGI);
		expect(ID);
		PT();
		switch(token.getType()) {
			case ANGD:
				sigToken();
				PL();
				expect(SLASH);
				expect(ID);
				break;
			case SLASH:
				sigToken();
				break;
		}
		expect(ANGD);		
	}
	
	/**
	 * Analiza las producciones que son atributos
	 * @throws XmlParsingException 
	 */
	private void PT() throws XmlParsingException{
		while(token.getType()==ID) {
			sigToken();
			expect(EQ);
			expect(STRING);
		}
	}
	
	/**
	 * Analiza las producciones que generan cualquier marca
	 * @throws XmlParsingException 
	 */
	private void PL() throws XmlParsingException{
		while(token.getType()==ANGI) {
			sigToken();
			if(token.getType()==ID) {
				expect(ID);
			}else {
				break;
			}
			PT();
			switch(token.getType()) {
				case ANGD:
					sigToken();
					PL();
					expect(SLASH);
					expect(ID);
					break;
				case SLASH:
					sigToken();
					break;
			}
			expect(ANGD);
		}
	}

}
