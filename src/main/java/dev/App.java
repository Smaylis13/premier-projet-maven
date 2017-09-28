package dev;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        // using default font standard.flf, obtained from maven artifact
        String asciiArt1 = FigletFont.convertOneLine("App");
        System.out.print(asciiArt1);

 
    }
}
