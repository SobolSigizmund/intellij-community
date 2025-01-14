/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

 /* It's an automatically generated code. Do not modify it. */
package com.intellij.lexer;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.*;
import com.intellij.psi.xml.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>_XmlLexer.flex</tt>
 */
public class __XmlLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int TAG = 2;
  public static final int PROCESSING_INSTRUCTION = 4;
  public static final int PI_ANY = 6;
  public static final int END_TAG = 8;
  public static final int COMMENT = 10;
  public static final int ATTR_LIST = 12;
  public static final int ATTR = 14;
  public static final int ATTR_VALUE_START = 16;
  public static final int ATTR_VALUE_DQ = 18;
  public static final int ATTR_VALUE_SQ = 20;
  public static final int DTD_MARKUP = 22;
  public static final int DOCTYPE = 24;
  public static final int CDATA = 26;
  public static final int C_COMMENT_START = 28;
  public static final int C_COMMENT_END = 30;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10,  8,  8, 11, 11, 12, 12, 13, 13, 14, 14
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\2\3\1\0\2\3\22\0\1\3\1\15\1\57\1\6\1\4"+
    "\1\65\1\16\1\60\1\14\1\14\3\0\1\12\1\11\1\63\12\2"+
    "\1\10\1\30\1\17\1\64\1\13\1\61\1\0\1\23\1\54\1\21"+
    "\1\22\1\50\1\44\2\1\1\56\2\1\1\55\1\52\1\1\1\45"+
    "\1\47\2\1\1\51\1\24\1\53\3\1\1\46\1\1\1\20\1\66"+
    "\1\25\1\0\1\7\1\0\1\32\1\41\4\44\1\31\4\1\1\26"+
    "\1\42\1\40\1\34\1\33\1\36\1\1\1\35\1\27\1\37\2\1"+
    "\1\43\2\1\1\5\1\14\1\62\54\0\1\1\12\0\1\1\4\0"+
    "\1\1\5\0\27\1\1\0\37\1\1\0\376\1\4\0\36\1\70\0"+
    "\131\1\7\0\11\1\2\0\7\1\16\0\2\1\16\0\5\1\225\0"+
    "\1\1\13\0\1\1\1\0\3\1\1\0\1\1\1\0\24\1\1\0"+
    "\54\1\1\0\7\1\3\0\1\1\1\0\1\1\1\0\1\1\1\0"+
    "\1\1\1\0\22\1\15\0\14\1\1\0\102\1\1\0\14\1\1\0"+
    "\44\1\16\0\65\1\2\0\2\1\2\0\2\1\3\0\34\1\2\0"+
    "\10\1\2\0\2\1\67\0\46\1\2\0\1\1\7\0\47\1\110\0"+
    "\33\1\5\0\3\1\56\0\32\1\5\0\13\1\46\0\107\1\2\0"+
    "\5\1\1\0\17\1\1\0\4\1\1\0\1\1\17\0\2\1\u021e\0"+
    "\65\1\3\0\1\1\32\0\12\1\43\0\10\1\2\0\2\1\2\0"+
    "\26\1\1\0\7\1\1\0\1\1\3\0\4\1\42\0\2\1\1\0"+
    "\3\1\16\0\2\1\23\0\6\1\4\0\2\1\2\0\26\1\1\0"+
    "\7\1\1\0\2\1\1\0\2\1\1\0\2\1\37\0\4\1\1\0"+
    "\1\1\23\0\3\1\20\0\7\1\1\0\1\1\1\0\3\1\1\0"+
    "\26\1\1\0\7\1\1\0\2\1\1\0\5\1\3\0\1\1\42\0"+
    "\1\1\44\0\10\1\2\0\2\1\2\0\26\1\1\0\7\1\1\0"+
    "\2\1\2\0\4\1\3\0\1\1\36\0\2\1\1\0\3\1\43\0"+
    "\6\1\3\0\3\1\1\0\4\1\3\0\2\1\1\0\1\1\1\0"+
    "\2\1\3\0\2\1\3\0\3\1\3\0\10\1\1\0\3\1\113\0"+
    "\10\1\1\0\3\1\1\0\27\1\1\0\12\1\1\0\5\1\46\0"+
    "\2\1\43\0\10\1\1\0\3\1\1\0\27\1\1\0\12\1\1\0"+
    "\5\1\44\0\1\1\1\0\2\1\43\0\10\1\1\0\3\1\1\0"+
    "\27\1\1\0\20\1\46\0\2\1\237\0\56\1\1\0\1\1\1\0"+
    "\2\1\14\0\7\1\72\0\2\1\1\0\1\1\2\0\2\1\1\0"+
    "\1\1\2\0\1\1\6\0\4\1\1\0\7\1\1\0\3\1\1\0"+
    "\1\1\1\0\1\1\2\0\2\1\1\0\2\1\1\0\1\1\1\0"+
    "\2\1\11\0\1\1\2\0\5\1\1\0\1\1\25\0\2\1\142\0"+
    "\10\1\1\0\41\1\u0136\0\46\1\12\0\47\1\11\0\132\1\5\0"+
    "\104\1\5\0\122\1\u0c06\0\234\1\4\0\132\1\6\0\26\1\2\0"+
    "\6\1\2\0\46\1\2\0\6\1\2\0\10\1\1\0\1\1\1\0"+
    "\1\1\1\0\1\1\1\0\37\1\2\0\65\1\1\0\7\1\1\0"+
    "\1\1\3\0\3\1\1\0\7\1\3\0\4\1\2\0\6\1\4\0"+
    "\15\1\5\0\3\1\1\0\7\1\202\0\1\1\202\0\1\1\4\0"+
    "\1\1\2\0\12\1\1\0\1\1\2\0\6\1\6\0\1\1\1\0"+
    "\1\1\1\0\1\1\1\0\10\1\1\0\6\1\u0ecc\0\1\1\53\0"+
    "\5\1\13\0\124\1\6\0\4\1\2\0\132\1\1\0\3\1\6\0"+
    "\50\1\4\0\136\1\u1c71\0\u51a6\1\u0c5a\0\u2ba4\1\u215c\0\u012e\1\322\0"+
    "\7\1\14\0\5\1\7\0\12\1\1\0\15\1\1\0\5\1\1\0"+
    "\1\1\1\0\2\1\1\0\2\1\1\0\154\1\41\0\u016b\1\22\0"+
    "\100\1\2\0\66\1\50\0\14\1\164\0\3\1\1\0\1\1\1\0"+
    "\207\1\44\0\32\1\6\0\32\1\13\0\131\1\3\0\6\1\2\0"+
    "\6\1\2\0\6\1\2\0\3\1\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\16\0\1\1\1\2\1\1\1\3\1\4\1\1"+
    "\1\3\1\5\1\6\1\7\2\3\2\10\1\3\4\11"+
    "\1\12\1\13\1\14\1\13\1\15\1\16\3\17\1\20"+
    "\1\21\1\22\2\23\1\14\1\23\1\24\3\23\1\25"+
    "\1\3\2\12\2\3\2\1\1\26\1\13\4\26\1\27"+
    "\10\0\1\30\1\31\1\5\1\0\1\32\2\10\1\33"+
    "\1\12\2\0\1\16\5\0\1\34\1\0\2\12\3\0"+
    "\1\35\1\36\1\0\1\37\12\0\1\40\1\41\1\42"+
    "\1\43\1\44\2\12\1\45\1\46\2\0\1\47\2\0"+
    "\2\12\2\0\2\12\2\0\1\50\1\51\4\0\1\52"+
    "\1\53";

  private static int [] zzUnpackAction() {
    int [] result = new int[145];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\67\0\156\0\245\0\334\0\u0113\0\u014a\0\u0181"+
    "\0\u01b8\0\u01ef\0\u0226\0\u025d\0\u0294\0\u02cb\0\u0302\0\u0339"+
    "\0\u0370\0\u03a7\0\u03de\0\u0415\0\u044c\0\u0483\0\u04ba\0\u04f1"+
    "\0\u0483\0\u0528\0\u055f\0\u0596\0\u05cd\0\u0604\0\u0483\0\u03de"+
    "\0\u0528\0\u0604\0\u063b\0\u0483\0\u0672\0\u06a9\0\u0483\0\u06e0"+
    "\0\u0483\0\u03de\0\u0528\0\u0483\0\u0483\0\u0483\0\u0483\0\u0717"+
    "\0\u03de\0\u0528\0\u0483\0\u074e\0\u0785\0\u07bc\0\u0483\0\u07f3"+
    "\0\u082a\0\u0861\0\u0898\0\u08cf\0\u0483\0\u0906\0\u0483\0\u093d"+
    "\0\u0974\0\u03de\0\u0528\0\u09ab\0\u0483\0\u09e2\0\u0a19\0\u0a50"+
    "\0\u0a87\0\u0abe\0\u0af5\0\u0b2c\0\u0b63\0\u0483\0\u0483\0\u0b9a"+
    "\0\u0bd1\0\u0483\0\u0c08\0\u0c3f\0\u0483\0\u0c76\0\u0cad\0\u0ce4"+
    "\0\u0d1b\0\u0d52\0\u0d89\0\u0dc0\0\u0df7\0\u07f3\0\u0483\0\u0e2e"+
    "\0\u0e65\0\u0e9c\0\u0898\0\u08cf\0\u0ed3\0\u0483\0\u0483\0\u0f0a"+
    "\0\u0483\0\u0f41\0\u0f78\0\u0faf\0\u0fe6\0\u101d\0\u1054\0\u108b"+
    "\0\u10c2\0\u10f9\0\u1130\0\u0596\0\u0483\0\u0483\0\u0483\0\u0483"+
    "\0\u1167\0\u119e\0\u0483\0\u0483\0\u11d5\0\u120c\0\u0483\0\u1243"+
    "\0\u127a\0\u12b1\0\u12e8\0\u131f\0\u1356\0\u138d\0\u13c4\0\u13fb"+
    "\0\u1432\0\u063b\0\u063b\0\u1469\0\u14a0\0\u14d7\0\u150e\0\u0483"+
    "\0\u0483";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[145];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\3\20\1\21\1\22\1\20\1\22\7\20\1\23\1\24"+
    "\46\20\1\25\1\26\1\27\1\26\1\30\3\26\2\27"+
    "\2\26\1\31\2\26\1\23\1\32\1\26\4\27\1\26"+
    "\2\27\1\26\26\27\4\26\1\33\4\26\1\34\5\26"+
    "\2\34\5\26\1\23\1\32\1\26\4\34\1\26\2\34"+
    "\1\26\12\34\1\35\13\34\2\26\1\36\5\26\3\37"+
    "\1\30\12\37\1\40\1\41\41\37\1\42\5\37\1\26"+
    "\1\43\1\26\1\30\3\26\2\43\2\26\1\31\2\26"+
    "\1\23\1\32\1\26\4\43\1\26\2\43\1\26\26\43"+
    "\10\26\12\44\1\45\4\44\1\46\1\47\46\44\1\26"+
    "\1\50\1\26\1\30\3\26\2\50\5\26\1\23\1\32"+
    "\1\26\4\50\1\26\2\50\1\26\26\50\10\26\3\51"+
    "\1\30\12\51\1\52\1\53\37\51\1\54\1\55\3\51"+
    "\1\56\2\51\16\26\1\23\1\32\47\26\4\57\1\60"+
    "\1\57\1\60\7\57\1\61\1\62\37\57\1\63\5\57"+
    "\1\64\5\57\1\65\1\57\1\65\7\57\1\61\1\62"+
    "\40\57\1\63\4\57\1\66\1\57\1\26\1\43\1\26"+
    "\1\30\3\26\2\43\2\26\1\67\2\26\1\23\1\32"+
    "\1\70\4\43\1\26\2\43\1\26\16\43\1\71\1\43"+
    "\1\72\5\43\1\73\1\74\6\26\25\75\1\76\41\75"+
    "\1\77\1\100\10\77\1\101\3\77\1\102\1\103\1\77"+
    "\4\100\1\104\2\100\1\77\26\100\11\77\1\100\10\77"+
    "\1\101\3\77\1\102\1\103\1\77\4\100\1\105\2\100"+
    "\1\77\26\100\10\77\3\20\2\0\1\20\1\0\7\20"+
    "\2\0\46\20\1\25\3\0\1\21\70\0\1\106\62\0"+
    "\1\107\4\0\1\110\2\107\10\0\4\107\1\0\1\111"+
    "\1\107\1\0\1\111\1\112\3\107\1\113\1\107\1\114"+
    "\16\107\25\0\1\115\43\0\1\116\1\0\1\117\3\0"+
    "\3\20\1\0\12\20\2\0\46\20\1\25\70\0\2\27"+
    "\4\0\1\27\1\120\2\27\6\0\4\27\1\0\2\27"+
    "\1\0\26\27\13\0\1\30\100\0\1\121\64\0\1\122"+
    "\54\0\2\34\4\0\1\34\1\123\2\34\6\0\4\34"+
    "\1\0\2\34\1\0\26\34\11\0\2\34\4\0\1\34"+
    "\1\123\2\34\6\0\4\34\1\0\2\34\1\0\11\34"+
    "\1\124\14\34\23\0\1\125\54\0\2\43\4\0\1\43"+
    "\1\126\2\43\6\0\4\43\1\0\2\43\1\0\26\43"+
    "\10\0\12\44\1\127\54\44\15\0\1\130\52\0\2\50"+
    "\4\0\1\50\1\131\2\50\6\0\4\50\1\0\2\50"+
    "\1\0\26\50\15\0\1\132\145\0\1\133\7\0\1\134"+
    "\145\0\1\135\2\0\25\136\1\137\31\136\1\140\7\136"+
    "\1\0\2\43\4\0\1\43\1\126\2\43\6\0\4\43"+
    "\1\0\2\43\1\0\22\43\1\141\3\43\11\0\2\43"+
    "\4\0\1\43\1\126\2\43\6\0\4\43\1\0\2\43"+
    "\1\0\15\43\1\142\10\43\10\0\57\143\1\57\7\143"+
    "\60\144\1\57\6\144\25\0\1\145\42\0\3\100\5\0"+
    "\1\100\2\0\3\100\2\0\4\100\1\0\2\100\1\0"+
    "\26\100\22\0\1\127\67\0\1\146\53\0\17\106\1\0"+
    "\42\106\1\147\4\106\1\0\2\107\4\0\1\107\1\150"+
    "\2\107\6\0\4\107\1\0\2\107\1\151\26\107\12\0"+
    "\1\152\40\0\1\153\24\0\2\107\4\0\1\107\1\150"+
    "\2\107\6\0\4\107\1\0\1\107\1\154\1\151\26\107"+
    "\11\0\2\107\4\0\1\107\1\150\2\107\6\0\4\107"+
    "\1\0\2\107\1\151\2\107\1\155\6\107\1\156\14\107"+
    "\11\0\2\107\4\0\1\107\1\150\2\107\6\0\4\107"+
    "\1\0\2\107\1\151\6\107\1\157\17\107\11\0\2\107"+
    "\4\0\1\107\1\150\2\107\6\0\4\107\1\0\2\107"+
    "\1\151\10\107\1\160\15\107\22\0\1\161\5\0\1\162"+
    "\1\0\1\163\45\0\2\120\4\0\1\120\1\0\2\120"+
    "\6\0\4\120\1\0\2\120\1\0\26\120\22\0\1\161"+
    "\5\0\1\162\47\0\2\123\4\0\1\123\1\0\2\123"+
    "\6\0\4\123\1\0\2\123\1\0\26\123\11\0\2\34"+
    "\4\0\1\34\1\123\2\34\6\0\4\34\1\0\1\164"+
    "\1\34\1\0\26\34\11\0\2\126\4\0\1\126\1\0"+
    "\2\126\6\0\4\126\1\0\2\126\1\0\26\126\23\0"+
    "\1\165\73\0\1\166\47\0\2\131\4\0\1\131\1\0"+
    "\2\131\6\0\4\131\1\0\2\131\1\0\26\131\10\0"+
    "\57\132\1\0\2\132\1\167\4\132\57\133\1\0\5\133"+
    "\1\170\1\133\60\134\1\0\1\134\1\167\4\134\60\135"+
    "\1\0\4\135\1\170\1\135\57\140\1\136\7\140\1\0"+
    "\2\43\4\0\1\43\1\126\2\43\6\0\4\43\1\0"+
    "\2\43\1\0\23\43\1\171\2\43\11\0\2\43\4\0"+
    "\1\43\1\126\2\43\6\0\4\43\1\0\2\43\1\0"+
    "\20\43\1\172\5\43\23\0\1\173\54\0\2\150\4\0"+
    "\1\150\1\0\2\150\6\0\4\150\1\0\2\150\1\151"+
    "\26\150\12\0\1\152\25\0\1\174\40\0\1\175\16\0"+
    "\3\175\6\0\1\175\6\0\1\175\2\0\1\175\3\0"+
    "\1\175\3\0\1\175\13\0\2\107\4\0\1\107\1\150"+
    "\2\107\6\0\4\107\1\0\2\107\1\174\26\107\11\0"+
    "\2\107\4\0\1\107\1\150\2\107\6\0\4\107\1\0"+
    "\2\107\1\151\3\107\1\176\22\107\11\0\2\107\4\0"+
    "\1\107\1\150\2\107\6\0\4\107\1\0\2\107\1\151"+
    "\2\107\1\154\23\107\11\0\2\107\4\0\1\107\1\150"+
    "\2\107\6\0\4\107\1\0\2\107\1\151\3\107\1\111"+
    "\22\107\11\0\2\107\4\0\1\107\1\150\2\107\6\0"+
    "\4\107\1\0\2\107\1\151\4\107\1\156\21\107\22\0"+
    "\1\177\75\0\1\200\112\0\1\201\22\0\2\43\4\0"+
    "\1\43\1\126\2\43\6\0\4\43\1\0\2\43\1\0"+
    "\24\43\1\202\1\43\11\0\2\43\4\0\1\43\1\126"+
    "\2\43\6\0\3\43\1\203\1\0\2\43\1\0\26\43"+
    "\12\0\1\175\16\0\3\175\4\0\1\174\1\0\1\175"+
    "\6\0\1\175\2\0\1\175\3\0\1\175\3\0\1\175"+
    "\13\0\2\107\4\0\1\107\1\150\2\107\6\0\4\107"+
    "\1\0\2\107\1\151\4\107\1\154\21\107\32\0\1\204"+
    "\65\0\1\205\46\0\2\43\4\0\1\43\1\126\2\43"+
    "\6\0\4\43\1\0\2\43\1\0\25\43\1\206\11\0"+
    "\2\43\4\0\1\43\1\126\2\43\6\0\4\43\1\0"+
    "\2\43\1\0\17\43\1\207\6\43\33\0\1\210\67\0"+
    "\1\211\43\0\2\43\4\0\1\43\1\126\2\43\6\0"+
    "\1\212\3\43\1\0\2\43\1\0\26\43\11\0\2\43"+
    "\4\0\1\43\1\126\2\43\6\0\4\43\1\0\2\43"+
    "\1\0\21\43\1\213\4\43\34\0\1\214\110\0\1\215"+
    "\43\0\1\216\112\0\1\217\37\0\1\220\116\0\1\221"+
    "\16\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5445];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\16\0\6\1\1\11\2\1\1\11\5\1\1\11"+
    "\4\1\1\11\2\1\1\11\1\1\1\11\2\1\4\11"+
    "\3\1\1\11\3\1\1\11\5\1\1\11\1\1\1\11"+
    "\5\1\1\11\10\0\2\11\1\1\1\0\1\11\2\1"+
    "\1\11\1\1\2\0\1\1\5\0\1\11\1\0\2\1"+
    "\3\0\2\11\1\0\1\11\12\0\1\1\4\11\2\1"+
    "\2\11\2\0\1\11\2\0\2\1\2\0\2\1\2\0"+
    "\2\1\4\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[145];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private IElementType elTokenType = XmlTokenType.XML_DATA_CHARACTERS;
  private IElementType elTokenType2 = XmlTokenType.XML_ATTRIBUTE_VALUE_TOKEN;
  private IElementType javaEmbeddedTokenType = XmlTokenType.XML_ATTRIBUTE_VALUE_TOKEN;
  private boolean myConditionalCommentsSupport;

  public void setConditionalCommentsSupport(final boolean b) {
    myConditionalCommentsSupport = b;
  }

  public void setElTypes(IElementType _elTokenType,IElementType _elTokenType2) {
    elTokenType = _elTokenType;
    elTokenType2 = _elTokenType2;
  }

  public void setJavaEmbeddedType(IElementType _tokenType) {
    javaEmbeddedTokenType = _tokenType;
  }

  private int myPrevState = YYINITIAL;

  public int yyprevstate() {
    return myPrevState;
  }

  private int popState(){
    final int prev = myPrevState;
    myPrevState = YYINITIAL;
    return prev;
  }

  protected void pushState(int state){
    myPrevState = state;
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public __XmlLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 992) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return XmlTokenType.XML_DATA_CHARACTERS;
            }
          case 44: break;
          case 2: 
            { return XmlTokenType.XML_REAL_WHITE_SPACE;
            }
          case 45: break;
          case 3: 
            { if(yystate() == YYINITIAL){
        return XmlTokenType.XML_BAD_CHARACTER;
      }
      else yybegin(popState()); yypushback(yylength());
            }
          case 46: break;
          case 4: 
            { yybegin(TAG); return XmlTokenType.XML_START_TAG_START;
            }
          case 47: break;
          case 5: 
            { yybegin(ATTR_LIST); pushState(TAG); return XmlTokenType.XML_NAME;
            }
          case 48: break;
          case 6: 
            { return XmlTokenType.XML_WHITE_SPACE;
            }
          case 49: break;
          case 7: 
            { yybegin(YYINITIAL); return XmlTokenType.XML_TAG_END;
            }
          case 50: break;
          case 8: 
            { yybegin(PI_ANY); return XmlTokenType.XML_NAME;
            }
          case 51: break;
          case 9: 
            { return XmlTokenType.XML_TAG_CHARACTERS;
            }
          case 52: break;
          case 10: 
            { return XmlTokenType.XML_NAME;
            }
          case 53: break;
          case 11: 
            { return XmlTokenType.XML_COMMENT_CHARACTERS;
            }
          case 54: break;
          case 12: 
            { return XmlTokenType.XML_BAD_CHARACTER;
            }
          case 55: break;
          case 13: 
            { if (myConditionalCommentsSupport) {
    yybegin(C_COMMENT_START);
    return XmlTokenType.XML_CONDITIONAL_COMMENT_START;
  } else return XmlTokenType.XML_COMMENT_CHARACTERS;
            }
          case 56: break;
          case 14: 
            { yybegin(ATTR); return XmlTokenType.XML_NAME;
            }
          case 57: break;
          case 15: 
            { yybegin(ATTR_LIST); yypushback(yylength());
            }
          case 58: break;
          case 16: 
            { yybegin(ATTR_VALUE_DQ); return XmlTokenType.XML_ATTRIBUTE_VALUE_START_DELIMITER;
            }
          case 59: break;
          case 17: 
            { yybegin(ATTR_VALUE_SQ); return XmlTokenType.XML_ATTRIBUTE_VALUE_START_DELIMITER;
            }
          case 60: break;
          case 18: 
            { return XmlTokenType.XML_EQ;
            }
          case 61: break;
          case 19: 
            { return XmlTokenType.XML_ATTRIBUTE_VALUE_TOKEN;
            }
          case 62: break;
          case 20: 
            { yybegin(ATTR_LIST); return XmlTokenType.XML_ATTRIBUTE_VALUE_END_DELIMITER;
            }
          case 63: break;
          case 21: 
            { yybegin(YYINITIAL); return XmlTokenType.XML_DOCTYPE_END;
            }
          case 64: break;
          case 22: 
            { yybegin(COMMENT); return XmlTokenType.XML_COMMENT_CHARACTERS;
            }
          case 65: break;
          case 23: 
            { yybegin(COMMENT); return XmlTokenType.XML_CONDITIONAL_COMMENT_END;
            }
          case 66: break;
          case 24: 
            { yybegin(PROCESSING_INSTRUCTION); return XmlTokenType.XML_PI_START;
            }
          case 67: break;
          case 25: 
            { yybegin(END_TAG); return XmlTokenType.XML_END_TAG_START;
            }
          case 68: break;
          case 26: 
            { yybegin(YYINITIAL); return XmlTokenType.XML_EMPTY_ELEMENT_END;
            }
          case 69: break;
          case 27: 
            { yybegin(YYINITIAL); return XmlTokenType.XML_PI_END;
            }
          case 70: break;
          case 28: 
            { return XmlElementType.XML_MARKUP_DECL;
            }
          case 71: break;
          case 29: 
            { yybegin(COMMENT); return XmlTokenType.XML_CONDITIONAL_COMMENT_START_END;
            }
          case 72: break;
          case 30: 
            { return elTokenType;
            }
          case 73: break;
          case 31: 
            { return XmlTokenType.XML_ENTITY_REF_TOKEN;
            }
          case 74: break;
          case 32: 
            { yybegin(ATTR_LIST); pushState(PROCESSING_INSTRUCTION); return XmlTokenType.XML_NAME;
            }
          case 75: break;
          case 33: 
            { yybegin(YYINITIAL); return XmlTokenType.XML_COMMENT_END;
            }
          case 76: break;
          case 34: 
            { if (myConditionalCommentsSupport) {
    yybegin(C_COMMENT_END);
    return XmlTokenType.XML_CONDITIONAL_COMMENT_END_START;
  } else return XmlTokenType.XML_COMMENT_CHARACTERS;
            }
          case 77: break;
          case 35: 
            { return elTokenType2;
            }
          case 78: break;
          case 36: 
            { return javaEmbeddedTokenType;
            }
          case 79: break;
          case 37: 
            { yybegin(YYINITIAL); return XmlTokenType.XML_CDATA_END;
            }
          case 80: break;
          case 38: 
            { return XmlTokenType.XML_CHAR_ENTITY_REF;
            }
          case 81: break;
          case 39: 
            { yybegin(COMMENT); return XmlTokenType.XML_COMMENT_START;
            }
          case 82: break;
          case 40: 
            { return XmlTokenType.XML_DOCTYPE_PUBLIC;
            }
          case 83: break;
          case 41: 
            { return XmlTokenType.XML_DOCTYPE_SYSTEM;
            }
          case 84: break;
          case 42: 
            { yybegin(CDATA); return XmlTokenType.XML_CDATA_START;
            }
          case 85: break;
          case 43: 
            { yybegin(DOCTYPE); return XmlTokenType.XML_DOCTYPE_START;
            }
          case 86: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
