

public class LittleOldLadySong
{
    public static void main(String[] args)
    {
        System.out.println("I know an old lady who swallowed a fly,");
        fly ();
        System.out.println("I know an old lady who swallowed a spider,");
        spider ();
        System.out.println("I know an old lady who swallowed a bird,");
        bird ();
        System.out.println("I know an old lady who swallowed a cat,");
        cat ();
        horse ();
    }
    public static void fly ()
    {
        System.out.println("I don't know why she swallowed the fly,");
        System.out.println("I guess she'll die.");
    }
    public static void spider ()
    {
        System.out.println("That wriggled and jiggled and tickled inside her.");
        System.out.println("She swallowed the spider to catch the fly");
        fly ();
    }
    public static void bird ()
    {
        System.out.println("How absurd to swallow a bird!");
        System.out.println("She swallowed the bird to catch the spider,");
        spider ();
    }
    public static void cat ()
    {
        System.out.println("Imagine that, to swallow a cat!");
        System.out.println("She swallowed the cat to catch the bird,");
        bird ();
    }
    public static void horse ()
    {;
        System.out.println("I know an old lady who swallowed a horse,");
        System.out.println("She's dead, of course!!");
    }
}