// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/main/jflex/jodd/csselly/csselly.jflex

package jodd.csselly;

import java.util.ArrayList;
import java.nio.CharBuffer;

// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
final class CSSellyLexer {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 4096;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int SELECTOR = 2;
  public static final int ATTR = 4;
  public static final int COMBINATOR = 6;
  public static final int PSEUDO_FN = 8;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  2,  2,  3,  3,  4, 4
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\4\1\5\22\0\1\1"+
    "\1\0\1\6\1\7\1\10\2\0\1\11\1\12\1\13"+
    "\1\14\1\15\1\0\1\16\1\17\1\0\12\20\1\21"+
    "\2\0\1\22\1\23\2\0\32\24\1\25\1\26\1\27"+
    "\1\10\1\24\1\0\6\30\24\24\1\0\1\10\1\0"+
    "\1\31\1\0\5\24\1\32\u01a2\24\2\32\326\24\u0100\32";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\0\1\2\1\3\1\4\1\5\1\2"+
    "\1\6\1\2\4\7\1\10\2\4\1\11\1\4\1\12"+
    "\1\13\1\1\1\14\1\15\1\16\3\4\1\17\1\4"+
    "\1\0\1\6\1\20\2\0\1\21\3\0\1\22\4\0"+
    "\1\11\2\0\1\11\5\0\1\17\1\0\1\17\1\0"+
    "\1\17\2\6\1\20\1\21\1\23\1\22\3\0\1\11"+
    "\1\0\2\11\1\17\4\0\1\17\4\0\1\17\1\0"+
    "\1\6\2\20\2\21\2\22\1\11\2\0\2\11\3\0"+
    "\1\17\7\0\1\6\1\20\1\21\1\22\1\0\1\11"+
    "\2\0\1\11\1\0\3\11\7\0\1\6\1\20\1\21"+
    "\1\22\2\0\2\11\6\0\1\6\1\20\1\21\1\22"+
    "\2\0\2\11\6\0\1\20\1\21\1\22\2\0\1\11"+
    "\10\0\1\11\7\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[178];
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
    "\0\0\0\33\0\66\0\121\0\154\0\207\0\242\0\207"+
    "\0\207\0\275\0\330\0\363\0\207\0\u010e\0\u0129\0\u0144"+
    "\0\207\0\u015f\0\u017a\0\u0195\0\u01b0\0\207\0\207\0\u01cb"+
    "\0\u01e6\0\u0201\0\u021c\0\u0237\0\u0252\0\u026d\0\207\0\u0288"+
    "\0\363\0\u02a3\0\u010e\0\u02be\0\u02d9\0\u02f4\0\u030f\0\u032a"+
    "\0\u0345\0\u0360\0\u037b\0\u015f\0\u017a\0\u01b0\0\u0396\0\u03b1"+
    "\0\u03cc\0\u03e7\0\u0237\0\u0252\0\u026d\0\u0288\0\u0402\0\u041d"+
    "\0\u0438\0\u0453\0\u046e\0\u0237\0\u0489\0\u04a4\0\u04bf\0\u04da"+
    "\0\207\0\u04f5\0\u0510\0\u052b\0\u0546\0\u0561\0\u057c\0\u0597"+
    "\0\u05b2\0\u05cd\0\u05e8\0\u041d\0\u0603\0\u061e\0\u0252\0\u0639"+
    "\0\u0453\0\u0654\0\u066f\0\u026d\0\u068a\0\u06a5\0\u06c0\0\u06db"+
    "\0\u06f6\0\u0711\0\u072c\0\u0747\0\u0762\0\u077d\0\u0798\0\u07b3"+
    "\0\u07ce\0\u05cd\0\u07e9\0\u0804\0\u0402\0\u081f\0\u083a\0\u0855"+
    "\0\u0870\0\u088b\0\u08a6\0\u08c1\0\u08dc\0\u08f7\0\u0912\0\u092d"+
    "\0\u0948\0\u0963\0\u097e\0\u0999\0\u09b4\0\u09cf\0\u09ea\0\u0a05"+
    "\0\u0a20\0\u0a3b\0\u0a56\0\u0a71\0\u0a8c\0\u0aa7\0\u0ac2\0\u0add"+
    "\0\u0af8\0\u0b13\0\u0b2e\0\u0b49\0\u0b64\0\u0b7f\0\u0b9a\0\u0bb5"+
    "\0\u0bd0\0\u0beb\0\u0c06\0\u0c21\0\u0c3c\0\u0c57\0\u0c72\0\u0c8d"+
    "\0\u0ca8\0\u0cc3\0\u0cde\0\u0cf9\0\u0d14\0\u0d2f\0\u0d4a\0\u0d65"+
    "\0\u0d80\0\u0d9b\0\u0db6\0\u0dd1\0\u0dec\0\u0e07\0\u0e22\0\u0e3d"+
    "\0\u0e58\0\u0e73\0\u0e8e\0\u0ea9\0\u0ec4\0\u0edf\0\u0efa\0\u0f15"+
    "\0\u0f30\0\u0f4b\0\u0f66\0\u0f81\0\u0f9c\0\u0fb7\0\u0fd2\0\u0fed"+
    "\0\u1008\0\u1023";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[178];
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
    "\1\6\2\7\1\10\2\7\6\6\1\11\1\6\1\12"+
    "\5\6\1\13\1\6\1\14\1\6\1\13\1\6\1\13"+
    "\2\15\4\10\1\15\1\16\7\15\1\17\1\15\1\20"+
    "\3\15\1\21\4\15\2\10\2\22\1\10\2\22\10\10"+
    "\1\23\5\10\1\24\1\10\1\25\1\26\1\24\1\10"+
    "\1\24\1\27\2\30\1\10\2\30\7\27\1\31\5\27"+
    "\1\32\5\27\1\33\1\10\6\34\1\35\2\34\1\36"+
    "\1\34\1\37\12\34\1\40\4\34\34\0\2\7\1\0"+
    "\2\7\51\0\1\13\1\0\1\41\1\0\1\13\1\0"+
    "\1\13\16\0\1\13\1\0\1\13\3\0\1\13\1\0"+
    "\1\41\1\0\1\13\1\0\3\13\1\0\1\13\2\0"+
    "\12\13\1\42\7\13\1\42\2\13\16\0\1\43\1\0"+
    "\1\43\3\0\1\43\1\0\1\44\1\0\1\43\1\0"+
    "\1\43\16\0\1\45\5\0\1\46\1\0\1\47\1\0"+
    "\1\46\1\0\1\46\16\0\1\50\2\0\1\51\2\0"+
    "\1\52\1\0\1\53\1\0\1\52\1\0\1\52\1\0"+
    "\2\54\1\0\2\54\10\0\1\55\5\0\1\24\1\0"+
    "\1\56\1\0\1\24\1\0\1\24\24\0\1\24\1\0"+
    "\1\56\1\0\1\24\1\0\1\24\1\0\2\57\1\0"+
    "\2\57\2\0\1\60\3\0\1\60\1\0\1\24\1\0"+
    "\1\24\1\0\1\61\1\0\1\24\1\0\1\56\1\0"+
    "\1\24\1\60\3\24\1\0\1\24\2\0\12\24\1\62"+
    "\7\24\1\62\2\24\1\0\2\30\1\0\2\30\7\0"+
    "\1\31\5\0\1\32\5\0\1\33\2\0\2\31\1\0"+
    "\2\31\26\0\2\32\1\0\2\32\26\0\2\33\1\0"+
    "\2\33\25\0\6\63\1\64\2\63\1\65\1\63\1\37"+
    "\12\63\1\66\4\63\2\64\1\63\1\64\2\63\3\64"+
    "\1\67\1\64\1\70\12\64\1\71\4\64\2\65\1\63"+
    "\1\65\2\63\1\67\4\65\1\72\12\65\1\73\4\65"+
    "\6\63\1\64\2\63\1\65\1\63\1\74\12\63\1\66"+
    "\4\63\1\0\2\13\1\0\1\13\1\75\10\0\1\13"+
    "\1\0\1\76\3\0\1\13\1\0\1\41\1\0\1\76"+
    "\1\0\1\13\2\43\1\0\1\43\2\0\12\43\1\77"+
    "\7\43\1\77\2\43\24\0\1\46\1\0\1\47\1\0"+
    "\1\46\1\0\1\46\16\0\1\46\1\0\1\46\3\0"+
    "\1\46\1\0\1\47\1\0\1\46\1\0\3\46\1\0"+
    "\1\46\2\0\12\46\1\100\7\46\1\100\2\46\24\0"+
    "\1\52\1\0\1\53\1\0\1\52\1\0\1\52\16\0"+
    "\1\50\5\0\1\52\1\0\1\53\1\0\1\52\1\0"+
    "\1\52\12\0\1\101\3\0\1\52\1\0\1\52\3\0"+
    "\1\52\1\0\1\53\1\0\1\52\1\0\3\52\1\0"+
    "\1\52\2\0\12\52\1\102\7\52\1\102\2\52\1\0"+
    "\2\57\1\0\2\57\2\0\1\60\3\0\1\60\5\0"+
    "\1\61\6\0\1\60\23\0\1\61\11\0\2\61\1\0"+
    "\2\61\1\103\2\0\1\104\4\0\1\105\5\0\1\106"+
    "\1\0\1\107\1\0\1\106\1\0\1\106\1\0\2\24"+
    "\1\0\1\24\1\110\2\0\1\60\3\0\1\60\1\0"+
    "\1\24\1\0\1\111\1\0\1\61\1\0\1\24\1\0"+
    "\1\56\1\0\1\111\1\60\1\24\2\67\1\63\1\67"+
    "\2\63\5\67\1\112\12\67\1\113\4\67\2\114\1\0"+
    "\1\114\2\0\1\63\17\114\1\115\4\114\5\64\1\116"+
    "\3\64\1\67\1\64\1\117\4\64\1\120\5\64\1\71"+
    "\1\64\1\120\2\64\2\121\1\0\1\121\2\0\3\121"+
    "\1\63\14\121\1\122\4\121\5\65\1\123\1\67\4\65"+
    "\1\124\4\65\1\125\5\65\1\73\1\65\1\125\2\65"+
    "\2\0\1\13\13\0\1\13\1\0\1\13\3\0\1\13"+
    "\1\0\1\41\1\0\1\13\1\0\1\13\1\0\2\13"+
    "\1\0\1\13\1\75\10\0\1\13\1\0\1\126\3\0"+
    "\1\13\1\0\1\41\1\0\1\126\1\0\1\13\1\0"+
    "\2\43\1\0\1\43\1\127\10\0\1\43\1\0\1\130"+
    "\3\0\1\43\1\0\1\44\1\0\1\130\1\0\1\43"+
    "\1\0\2\46\1\0\1\46\1\131\10\0\1\46\1\0"+
    "\1\132\3\0\1\46\1\0\1\47\1\0\1\132\1\0"+
    "\1\46\1\0\2\52\1\0\1\52\1\133\4\0\1\101"+
    "\3\0\1\52\1\0\1\134\3\0\1\52\1\0\1\53"+
    "\1\0\1\134\1\0\1\52\2\103\1\0\1\103\2\0"+
    "\1\135\17\103\1\136\4\103\2\104\1\0\1\104\2\0"+
    "\3\104\1\135\14\104\1\137\4\104\24\0\1\106\1\0"+
    "\1\107\1\0\1\106\1\0\1\106\1\0\2\135\1\0"+
    "\2\135\10\0\1\106\1\0\1\106\3\0\1\106\1\0"+
    "\1\107\1\0\1\106\1\0\3\106\1\0\1\106\2\0"+
    "\12\106\1\140\7\106\1\140\2\106\1\0\1\57\1\24"+
    "\1\0\2\57\2\0\1\60\3\0\1\60\1\0\1\24"+
    "\1\0\1\24\1\0\1\61\1\0\1\24\1\0\1\56"+
    "\1\0\1\24\1\60\1\24\1\0\2\24\1\0\1\24"+
    "\1\110\2\0\1\60\3\0\1\60\1\0\1\24\1\0"+
    "\1\141\1\0\1\61\1\0\1\24\1\0\1\56\1\0"+
    "\1\141\1\60\1\24\2\142\1\0\1\142\2\0\1\65"+
    "\2\142\1\64\14\142\1\143\4\142\5\67\1\144\5\67"+
    "\1\145\4\67\1\146\5\67\1\113\1\67\1\146\2\67"+
    "\5\114\1\147\1\64\11\114\1\150\5\114\1\115\1\114"+
    "\1\150\2\114\4\64\2\63\3\64\1\67\1\64\1\70"+
    "\12\64\1\71\11\64\1\116\3\64\1\67\1\64\1\70"+
    "\4\64\1\151\5\64\1\71\1\64\1\151\2\64\5\121"+
    "\1\152\3\121\1\65\6\121\1\153\5\121\1\122\1\121"+
    "\1\153\2\121\4\65\2\63\1\67\4\65\1\72\12\65"+
    "\1\73\11\65\1\123\1\67\4\65\1\72\4\65\1\154"+
    "\5\65\1\73\1\65\1\154\2\65\1\0\2\13\1\0"+
    "\1\13\1\75\10\0\1\13\1\0\1\155\3\0\1\13"+
    "\1\0\1\41\1\0\1\155\1\0\1\13\2\0\1\43"+
    "\13\0\1\43\1\0\1\43\3\0\1\43\1\0\1\44"+
    "\1\0\1\43\1\0\1\43\1\0\2\43\1\0\1\43"+
    "\1\127\10\0\1\43\1\0\1\156\3\0\1\43\1\0"+
    "\1\44\1\0\1\156\1\0\1\43\2\0\1\46\13\0"+
    "\1\46\1\0\1\46\3\0\1\46\1\0\1\47\1\0"+
    "\1\46\1\0\1\46\1\0\2\46\1\0\1\46\1\131"+
    "\10\0\1\46\1\0\1\157\3\0\1\46\1\0\1\47"+
    "\1\0\1\157\1\0\1\46\2\0\1\52\7\0\1\101"+
    "\3\0\1\52\1\0\1\52\3\0\1\52\1\0\1\53"+
    "\1\0\1\52\1\0\1\52\1\0\2\52\1\0\1\52"+
    "\1\133\4\0\1\101\3\0\1\52\1\0\1\160\3\0"+
    "\1\52\1\0\1\53\1\0\1\160\1\0\1\52\1\0"+
    "\2\135\1\0\2\135\25\0\5\103\1\161\1\162\11\103"+
    "\1\163\5\103\1\136\1\103\1\163\2\103\5\104\1\164"+
    "\3\104\1\165\6\104\1\166\5\104\1\137\1\104\1\166"+
    "\2\104\1\0\2\106\1\0\1\106\1\167\10\0\1\106"+
    "\1\0\1\170\3\0\1\106\1\0\1\107\1\0\1\170"+
    "\1\0\1\106\1\0\2\24\1\0\1\24\1\110\2\0"+
    "\1\60\3\0\1\60\1\0\1\24\1\0\1\171\1\0"+
    "\1\61\1\0\1\24\1\0\1\56\1\0\1\171\1\60"+
    "\1\24\5\142\1\172\1\67\2\142\1\67\6\142\1\173"+
    "\5\142\1\143\1\142\1\173\2\142\4\67\2\63\5\67"+
    "\1\112\12\67\1\113\11\67\1\144\5\67\1\112\4\67"+
    "\1\174\5\67\1\113\1\67\1\174\2\67\4\114\2\0"+
    "\1\63\17\114\1\115\11\114\1\147\1\63\11\114\1\175"+
    "\5\114\1\115\1\114\1\175\2\114\5\64\1\116\3\64"+
    "\1\67\1\64\1\70\4\64\1\176\5\64\1\71\1\64"+
    "\1\176\2\64\4\121\2\0\3\121\1\63\14\121\1\122"+
    "\11\121\1\152\3\121\1\63\6\121\1\177\5\121\1\122"+
    "\1\121\1\177\2\121\5\65\1\123\1\67\4\65\1\72"+
    "\4\65\1\200\5\65\1\73\1\65\1\200\2\65\1\0"+
    "\2\13\1\0\1\13\1\75\10\0\1\13\1\0\1\201"+
    "\3\0\1\13\1\0\1\41\1\0\1\201\1\0\1\13"+
    "\1\0\2\43\1\0\1\43\1\127\10\0\1\43\1\0"+
    "\1\202\3\0\1\43\1\0\1\44\1\0\1\202\1\0"+
    "\1\43\1\0\2\46\1\0\1\46\1\131\10\0\1\46"+
    "\1\0\1\203\3\0\1\46\1\0\1\47\1\0\1\203"+
    "\1\0\1\46\1\0\2\52\1\0\1\52\1\133\4\0"+
    "\1\101\3\0\1\52\1\0\1\204\3\0\1\52\1\0"+
    "\1\53\1\0\1\204\1\0\1\52\4\103\2\0\1\135"+
    "\17\103\1\136\5\103\1\162\1\135\1\103\3\135\17\103"+
    "\1\136\11\103\1\161\1\135\11\103\1\205\5\103\1\136"+
    "\1\103\1\205\2\103\4\104\2\0\3\104\1\135\14\104"+
    "\1\137\5\104\1\165\1\135\1\104\2\135\3\104\1\135"+
    "\14\104\1\137\11\104\1\164\3\104\1\135\6\104\1\206"+
    "\5\104\1\137\1\104\1\206\2\104\1\0\1\135\1\106"+
    "\1\0\2\135\10\0\1\106\1\0\1\106\3\0\1\106"+
    "\1\0\1\107\1\0\1\106\1\0\1\106\1\0\2\106"+
    "\1\0\1\106\1\167\10\0\1\106\1\0\1\207\3\0"+
    "\1\106\1\0\1\107\1\0\1\207\1\0\1\106\1\0"+
    "\2\24\1\0\1\24\1\110\2\0\1\60\3\0\1\60"+
    "\1\0\1\24\1\0\1\210\1\0\1\61\1\0\1\24"+
    "\1\0\1\56\1\0\1\210\1\60\1\24\4\142\2\0"+
    "\1\65\2\142\1\64\14\142\1\143\11\142\1\172\1\65"+
    "\2\142\1\64\6\142\1\211\5\142\1\143\1\142\1\211"+
    "\2\142\5\67\1\144\5\67\1\112\4\67\1\212\5\67"+
    "\1\113\1\67\1\212\2\67\5\114\1\147\1\63\11\114"+
    "\1\213\5\114\1\115\1\114\1\213\2\114\5\64\1\116"+
    "\3\64\1\67\1\64\1\70\4\64\1\214\5\64\1\71"+
    "\1\64\1\214\2\64\5\121\1\152\3\121\1\63\6\121"+
    "\1\215\5\121\1\122\1\121\1\215\2\121\5\65\1\123"+
    "\1\67\4\65\1\72\4\65\1\216\5\65\1\73\1\65"+
    "\1\216\2\65\1\0\2\13\1\0\1\13\1\75\10\0"+
    "\1\13\1\0\1\217\3\0\1\13\1\0\1\41\1\0"+
    "\1\217\1\0\1\13\1\0\2\43\1\0\1\43\1\127"+
    "\10\0\1\43\1\0\1\220\3\0\1\43\1\0\1\44"+
    "\1\0\1\220\1\0\1\43\1\0\2\46\1\0\1\46"+
    "\1\131\10\0\1\46\1\0\1\221\3\0\1\46\1\0"+
    "\1\47\1\0\1\221\1\0\1\46\1\0\2\52\1\0"+
    "\1\52\1\133\4\0\1\101\3\0\1\52\1\0\1\222"+
    "\3\0\1\52\1\0\1\53\1\0\1\222\1\0\1\52"+
    "\5\103\1\161\1\135\11\103\1\223\5\103\1\136\1\103"+
    "\1\223\2\103\5\104\1\164\3\104\1\135\6\104\1\224"+
    "\5\104\1\137\1\104\1\224\2\104\1\0\2\106\1\0"+
    "\1\106\1\167\10\0\1\106\1\0\1\225\3\0\1\106"+
    "\1\0\1\107\1\0\1\225\1\0\1\106\1\0\2\24"+
    "\1\0\1\24\1\110\2\0\1\60\3\0\1\60\1\0"+
    "\1\24\1\0\1\226\1\0\1\61\1\0\1\24\1\0"+
    "\1\56\1\0\1\226\1\60\1\24\5\142\1\172\1\65"+
    "\2\142\1\64\6\142\1\227\5\142\1\143\1\142\1\227"+
    "\2\142\5\67\1\144\5\67\1\112\4\67\1\230\5\67"+
    "\1\113\1\67\1\230\2\67\5\114\1\147\1\63\11\114"+
    "\1\231\5\114\1\115\1\114\1\231\2\114\5\64\1\116"+
    "\3\64\1\67\1\64\1\70\4\64\1\232\5\64\1\71"+
    "\1\64\1\232\2\64\5\121\1\152\3\121\1\63\6\121"+
    "\1\233\5\121\1\122\1\121\1\233\2\121\5\65\1\123"+
    "\1\67\4\65\1\72\4\65\1\234\5\65\1\73\1\65"+
    "\1\234\2\65\1\0\2\13\1\0\1\13\1\75\10\0"+
    "\1\13\1\0\1\13\3\0\1\13\1\0\1\41\1\0"+
    "\1\13\1\0\1\13\1\0\2\43\1\0\1\43\1\127"+
    "\10\0\1\43\1\0\1\235\3\0\1\43\1\0\1\44"+
    "\1\0\1\235\1\0\1\43\1\0\2\46\1\0\1\46"+
    "\1\131\10\0\1\46\1\0\1\236\3\0\1\46\1\0"+
    "\1\47\1\0\1\236\1\0\1\46\1\0\2\52\1\0"+
    "\1\52\1\133\4\0\1\101\3\0\1\52\1\0\1\237"+
    "\3\0\1\52\1\0\1\53\1\0\1\237\1\0\1\52"+
    "\5\103\1\161\1\135\11\103\1\240\5\103\1\136\1\103"+
    "\1\240\2\103\5\104\1\164\3\104\1\135\6\104\1\241"+
    "\5\104\1\137\1\104\1\241\2\104\1\0\2\106\1\0"+
    "\1\106\1\167\10\0\1\106\1\0\1\242\3\0\1\106"+
    "\1\0\1\107\1\0\1\242\1\0\1\106\1\0\2\24"+
    "\1\0\1\24\1\110\2\0\1\60\3\0\1\60\1\0"+
    "\1\24\1\0\1\24\1\0\1\61\1\0\1\24\1\0"+
    "\1\56\1\0\1\24\1\60\1\24\5\142\1\172\1\65"+
    "\2\142\1\64\6\142\1\243\5\142\1\143\1\142\1\243"+
    "\2\142\5\67\1\144\5\67\1\112\4\67\1\244\5\67"+
    "\1\113\1\67\1\244\2\67\5\114\1\147\1\63\11\114"+
    "\1\245\5\114\1\115\1\114\1\245\2\114\5\64\1\116"+
    "\3\64\1\67\1\64\1\70\4\64\1\246\5\64\1\71"+
    "\1\64\1\246\2\64\5\121\1\152\3\121\1\63\6\121"+
    "\1\247\5\121\1\122\1\121\1\247\2\121\5\65\1\123"+
    "\1\67\4\65\1\72\4\65\1\250\5\65\1\73\1\65"+
    "\1\250\2\65\1\0\2\43\1\0\1\43\1\127\10\0"+
    "\1\43\1\0\1\43\3\0\1\43\1\0\1\44\1\0"+
    "\1\43\1\0\1\43\1\0\2\46\1\0\1\46\1\131"+
    "\10\0\1\46\1\0\1\46\3\0\1\46\1\0\1\47"+
    "\1\0\1\46\1\0\1\46\1\0\2\52\1\0\1\52"+
    "\1\133\4\0\1\101\3\0\1\52\1\0\1\52\3\0"+
    "\1\52\1\0\1\53\1\0\1\52\1\0\1\52\5\103"+
    "\1\161\1\135\11\103\1\251\5\103\1\136\1\103\1\251"+
    "\2\103\5\104\1\164\3\104\1\135\6\104\1\252\5\104"+
    "\1\137\1\104\1\252\2\104\1\0\2\106\1\0\1\106"+
    "\1\167\10\0\1\106\1\0\1\253\3\0\1\106\1\0"+
    "\1\107\1\0\1\253\1\0\1\106\5\142\1\172\1\65"+
    "\2\142\1\64\6\142\1\254\5\142\1\143\1\142\1\254"+
    "\2\142\5\67\1\144\5\67\1\112\4\67\1\255\5\67"+
    "\1\113\1\67\1\255\2\67\5\114\1\147\1\63\11\114"+
    "\1\256\5\114\1\115\1\114\1\256\2\114\5\64\1\116"+
    "\3\64\1\67\1\64\1\70\12\64\1\71\4\64\5\121"+
    "\1\152\3\121\1\63\6\121\1\257\5\121\1\122\1\121"+
    "\1\257\2\121\5\65\1\123\1\67\4\65\1\72\12\65"+
    "\1\73\4\65\5\103\1\161\1\135\11\103\1\260\5\103"+
    "\1\136\1\103\1\260\2\103\5\104\1\164\3\104\1\135"+
    "\6\104\1\261\5\104\1\137\1\104\1\261\2\104\1\0"+
    "\2\106\1\0\1\106\1\167\10\0\1\106\1\0\1\106"+
    "\3\0\1\106\1\0\1\107\1\0\1\106\1\0\1\106"+
    "\5\142\1\172\1\65\2\142\1\64\6\142\1\262\5\142"+
    "\1\143\1\142\1\262\2\142\5\67\1\144\5\67\1\112"+
    "\12\67\1\113\4\67\5\114\1\147\1\63\17\114\1\115"+
    "\4\114\5\121\1\152\3\121\1\63\14\121\1\122\4\121"+
    "\5\103\1\161\1\135\17\103\1\136\4\103\5\104\1\164"+
    "\3\104\1\135\14\104\1\137\4\104\5\142\1\172\1\65"+
    "\2\142\1\64\14\142\1\143\4\142";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4158];
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\1\1\0\1\11\1\1\2\11\3\1\1\11"+
    "\3\1\1\11\4\1\2\11\7\1\1\11\1\1\1\0"+
    "\2\1\2\0\1\1\3\0\1\1\4\0\1\1\2\0"+
    "\1\1\5\0\1\1\1\0\1\1\1\0\5\1\1\11"+
    "\1\1\3\0\1\1\1\0\3\1\4\0\1\1\4\0"+
    "\1\1\1\0\10\1\2\0\2\1\3\0\1\1\7\0"+
    "\4\1\1\0\1\1\2\0\1\1\1\0\3\1\7\0"+
    "\4\1\2\0\2\1\6\0\4\1\2\0\2\1\6\0"+
    "\3\1\2\0\1\1\10\0\1\1\7\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[178];
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

  /** Input device. */
  private java.io.Reader zzReader;
  private char[] zzChars;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
	// position methods
	public long position() { return yychar; }
	public int length()   { return yylength(); }
	public int line()     { return -1; /*yyline;*/ }   	// for debugging
	public int column()   { return -1; /*yycolumn;*/ } 	// for debugging

	// state methods
	public void stateReset() 		{ yybegin(YYINITIAL); }
	public void stateSelector() 	{ yybegin(SELECTOR); }
	public void stateAttr()			{ yybegin(ATTR); }
	public void stateCombinator()	{ yybegin(COMBINATOR); }
	public void statePseudoFn()		{ yybegin(PSEUDO_FN); }

	// fast methods
	public final CharSequence xxtext() {
		return CharBuffer.wrap(zzBuffer, zzStartRead, zzMarkedPos - zzStartRead);
	}

	public final String yytext(int startIndex) {
		startIndex += zzStartRead;
		return new String(zzBuffer, startIndex, zzMarkedPos - startIndex);
	}
	public final String yytext(int startIndex, int endIndexOffset) {
		startIndex += zzStartRead;
		return new String(zzBuffer, startIndex, zzMarkedPos - endIndexOffset - startIndex);
	}

	ArrayList<CssSelector> selectors = new ArrayList<CssSelector>();
	CssSelector cssSelector;
	String pseudoFnName;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  CSSellyLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Creates a new scanner.
   */
  CSSellyLexer(char[] input) {
    this.zzChars = input;
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() {
	if (zzBuffer == null) {
      zzBuffer = zzChars;
      zzEndRead += zzChars.length;
      return false;
    }
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose()  {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

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
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
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
            zzDoEOF();
          { return 0; }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { cssSelector.setCombinator(Combinator.DESCENDANT); stateReset();
            }
            // fall through
          case 20: break;
          case 2:
            { cssSelector = new CssSelector(); selectors.add(cssSelector); yypushback(1); stateSelector();
            }
            // fall through
          case 21: break;
          case 3:
            { /* ignore whitespaces */
            }
            // fall through
          case 22: break;
          case 4:
            { throw new CSSellyException("Illegal character <"+ yytext() +">.", yystate(), line(), column());
            }
            // fall through
          case 23: break;
          case 5:
            { cssSelector = new CssSelector(); selectors.add(cssSelector); stateSelector();
            }
            // fall through
          case 24: break;
          case 6:
            { cssSelector = new CssSelector(yytext()); selectors.add(cssSelector); stateSelector();
            }
            // fall through
          case 25: break;
          case 7:
            { yypushback(1); stateCombinator();
            }
            // fall through
          case 26: break;
          case 8:
            { stateAttr();
            }
            // fall through
          case 27: break;
          case 9:
            { cssSelector.addAttributeSelector(yytext());
            }
            // fall through
          case 28: break;
          case 10:
            { stateSelector();
            }
            // fall through
          case 29: break;
          case 11:
            { throw new CSSellyException("Invalid combinator <"+ yytext() +">.", yystate(), line(), column());
            }
            // fall through
          case 30: break;
          case 12:
            { cssSelector.setCombinator(Combinator.ADJACENT_SIBLING); stateReset();
            }
            // fall through
          case 31: break;
          case 13:
            { cssSelector.setCombinator(Combinator.CHILD); stateReset();
            }
            // fall through
          case 32: break;
          case 14:
            { cssSelector.setCombinator(Combinator.GENERAL_SIBLING); stateReset();
            }
            // fall through
          case 33: break;
          case 15:
            { cssSelector.addPseudoFunctionSelector(pseudoFnName, yytext(0, 1)); stateSelector();
            }
            // fall through
          case 34: break;
          case 16:
            { cssSelector.addIdSelector(yytext(1));
            }
            // fall through
          case 35: break;
          case 17:
            { cssSelector.addClassSelector(yytext(1));
            }
            // fall through
          case 36: break;
          case 18:
            { cssSelector.addPseudoClassSelector(yytext( yycharat(1) == ':' ? 2 : 1 ));
            }
            // fall through
          case 37: break;
          case 19:
            { pseudoFnName = yytext(yycharat(1) == ':' ? 2 : 1,1); statePseudoFn();
            }
            // fall through
          case 38: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
