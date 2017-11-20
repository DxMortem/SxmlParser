package tcom.xml;

import static tcom.xml.WellformedXmlLexer.ANGD;
import static tcom.xml.WellformedXmlLexer.ANGI;
import static tcom.xml.WellformedXmlLexer.EOF;
import static tcom.xml.WellformedXmlLexer.EQ;
import static tcom.xml.WellformedXmlLexer.ID;
import static tcom.xml.WellformedXmlLexer.SLASH;
import static tcom.xml.WellformedXmlLexer.STRING;

import org.antlr.runtime.Token;

/**
 * Parser basico usando las convenciones del descenso recursivo.
 * @author rlopez
 *
 */
public class BasicParser {

	protected Token token; //Token vigente en el proceso
	protected WellformedXmlLexer lexer; //Analizador lexico

	/**
	 * Toma el siguiente token de la entrada
	 */
	protected void sigToken() {
		token = lexer.nextToken();
	}

	/**
	 * Verifica que su unico argumento coincide con el tipo del token vigente.
	 * 
	 * @param tokType
	 *            Tipo esperado del token vigente
	 * @throws RegParsingException
	 */
	protected void expect(int tokType) throws XmlParsingException {
		
		if (token.getType() == tokType) {
			sigToken();
		} else {
			throw new XmlParsingException("Error: " + locateError(token)
					+ " Se esperaba el token \"" + tokenName(tokType)
					+ "\" y aparece " + token.getText());
		}
		
	}

	/**
	 * Produce un nombre legible para un token
	 */
	protected String tokenName(int tokType) {
		String resp = null;
		switch (tokType) {
		case SLASH:
			resp = "slash";
			break;

		case ANGI:
			resp = "angular izq";
			break;

		case ANGD:
			resp = "angular der";
			break;

		case ID:
			resp = "identificador";
			break;

		case STRING:
			resp = "cadena entre comillas";
			break;

		case EQ:
			resp = "=";
			break;

		case EOF:
			resp = "Fin de archivo";
			break;

		default:
			break;
		}
		return resp;
	}

	/**
	 * Produce una descripcion de la ubicacion de un token
	 * 
	 * @param actual Token ubicado
	 */
	protected String locateError(Token actual) {
		StringBuilder sbf = new StringBuilder();

		sbf.append("[");
		sbf.append(actual.getLine());
		sbf.append(",");
		sbf.append(actual.getCharPositionInLine());
		sbf.append("]");

		return sbf.toString();
	}


}
