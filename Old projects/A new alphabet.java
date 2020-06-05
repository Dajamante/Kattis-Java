import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String[] stringArray = new String[255];
        stringArray['a'] = "@";
        stringArray['b'] = "8";
        stringArray['c'] = "(";
        stringArray['d'] = "|)";
        stringArray['e'] = "3";
        stringArray['f'] = "#";
        stringArray['g'] = "6";
        stringArray['h'] = "[-]";
        stringArray['i'] = "|";
        stringArray['j'] = "_|";
        stringArray['k'] = "|<";
        stringArray['l'] = "1";
        stringArray['m'] = "[]\\/[]";
        stringArray['n'] = "[]\\[]";
        stringArray['o'] = "0";
        stringArray['p'] = "|D";
        stringArray['q'] = "(,)";
        stringArray['r'] = "|Z";
        stringArray['s'] = "$";
        stringArray['t'] = "']['";
        stringArray['u'] = "|_|";
        stringArray['v'] = "\\/";
        stringArray['w'] = "\\/\\/";
        stringArray['x'] = "}{";
        stringArray['y'] = "`/";
        stringArray['z'] = "2";


        InputReader in = new InputReader();

        String toTranslate = in.nextLine().toLowerCase();

        for (int i = 0; i < toTranslate.length(); i++) {
            char c = toTranslate.charAt(i);
            if (c >= 'a' && c <= 'z')
                System.out.print(stringArray[c]);
            else
                System.out.print(c);
        }
    }
}

            /*char c = toTranslate.charAt(i);
            if (c >= 'a' && c <= 'z')
                System.out.print(stringArray[c]);
            else
                System.out.print(c);
        }
    }*/

   /* char c = toTranslate.charAt(i);
            if(stringArray[c]== null)
                    System.out.print(c);
                    else
                    System.out.print(stringArray[c]);*/

   /* char c = toTranslate.charAt(i);
    String t = stringArray[c];
            if(t== null)
                    System.out.print(c);
                    else
                    System.out.print(t);*/

