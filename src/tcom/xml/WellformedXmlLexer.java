// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g 2010-11-10 15:48:57
package tcom.xml;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class WellformedXmlLexer extends Lexer {
    public static final int SLASH=14;
    public static final int WS=4;
    public static final int ESC_SEQ=6;
    public static final int UNICODE_ESC=9;
    public static final int OCTAL_ESC=10;
    public static final int ANGD=12;
    public static final int HEX_DIGIT=8;
    public static final int EQ=13;
    public static final int ANGI=11;
    public static final int ID=5;
    public static final int EOF=-1;
    public static final int STRING=7;

      @Override
      public void reportError(RecognitionException e) {
        throw new IllegalArgumentException(e);
      }


    // delegates
    // delegators

    public WellformedXmlLexer() {;} 
    public WellformedXmlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public WellformedXmlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g"; }

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:12:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:12:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:12:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\t' && LA1_0<='\n')||LA1_0=='\r'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:19:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:19:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:19:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:23:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:23:8: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:23:12: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:23:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:23:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:27:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:27:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:31:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt4=1;
                    }
                    break;
                case 'u':
                    {
                    alt4=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt4=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:31:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:32:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:33:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:38:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\\') ) {
                int LA5_1 = input.LA(2);

                if ( ((LA5_1>='0' && LA5_1<='3')) ) {
                    int LA5_2 = input.LA(3);

                    if ( ((LA5_2>='0' && LA5_2<='7')) ) {
                        int LA5_5 = input.LA(4);

                        if ( ((LA5_5>='0' && LA5_5<='7')) ) {
                            alt5=1;
                        }
                        else {
                            alt5=2;}
                    }
                    else {
                        alt5=3;}
                }
                else if ( ((LA5_1>='4' && LA5_1<='7')) ) {
                    int LA5_3 = input.LA(3);

                    if ( ((LA5_3>='0' && LA5_3<='7')) ) {
                        alt5=2;
                    }
                    else {
                        alt5=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:38:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:38:14: ( '0' .. '3' )
                    // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:38:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:38:25: ( '0' .. '7' )
                    // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:38:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:38:36: ( '0' .. '7' )
                    // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:38:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:39:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:39:14: ( '0' .. '7' )
                    // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:39:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:39:25: ( '0' .. '7' )
                    // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:39:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:40:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:40:14: ( '0' .. '7' )
                    // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:40:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:45:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:45:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    // $ANTLR start "ANGI"
    public final void mANGI() throws RecognitionException {
        try {
            int _type = ANGI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:48:6: ( '<' )
            // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:48:8: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANGI"

    // $ANTLR start "ANGD"
    public final void mANGD() throws RecognitionException {
        try {
            int _type = ANGD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:50:6: ( '>' )
            // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:50:8: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANGD"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:52:4: ( '=' )
            // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:52:6: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:54:7: ( '/' )
            // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:54:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASH"

    public void mTokens() throws RecognitionException {
        // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:1:8: ( WS | ID | STRING | ANGI | ANGD | EQ | SLASH )
        int alt6=7;
        switch ( input.LA(1) ) {
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt6=1;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt6=2;
            }
            break;
        case '\"':
            {
            alt6=3;
            }
            break;
        case '<':
            {
            alt6=4;
            }
            break;
        case '>':
            {
            alt6=5;
            }
            break;
        case '=':
            {
            alt6=6;
            }
            break;
        case '/':
            {
            alt6=7;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 6, 0, input);

            throw nvae;
        }

        switch (alt6) {
            case 1 :
                // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:1:10: WS
                {
                mWS(); 

                }
                break;
            case 2 :
                // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:1:13: ID
                {
                mID(); 

                }
                break;
            case 3 :
                // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:1:16: STRING
                {
                mSTRING(); 

                }
                break;
            case 4 :
                // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:1:23: ANGI
                {
                mANGI(); 

                }
                break;
            case 5 :
                // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:1:28: ANGD
                {
                mANGD(); 

                }
                break;
            case 6 :
                // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:1:33: EQ
                {
                mEQ(); 

                }
                break;
            case 7 :
                // /home/rlopez/Dropbox/antlrWS/Xml/WellformedXmlLexer.g:1:36: SLASH
                {
                mSLASH(); 

                }
                break;

        }

    }


 

}