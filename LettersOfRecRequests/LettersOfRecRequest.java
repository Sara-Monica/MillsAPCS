
 /**
 * Writing Letters to Request Letters of Recomendation from teachers
 * 
 * @Sara Cisneros and Allen Ng
 * @8/27/15
 */
public class LettersOfRecRequest
{
    public static void main(String[] args)
    {
        Dreyer ();
        Peel ();
        Paul ();
    }
    public static void Dreyer ()
    {
        System.out.println("Dear Mrs. Dreyer,");
        System.out.println("I'm an amazing student, but you don't know me that well becuase you've");
        System.out.println("only had me for a couple months in AP computer science.");
        Intro ();
        Stuffdone ();
        System.out.println("I've participated in programs where they learn to code and do math.");
        Begging ();
        System.out.println("I promise to work super hard in AP computer science.");
        Salutation ();
    }
    public static void Peel ()
    {
        System.out.println("Dear Mrs. Peel");
        System.out.println("I've had you for two years, so you should totally know me and be able");
        System.out.println("to write a really good letter about about how amazing I am.");
        Intro ();
        Stuffdone ();
        System.out.println("Also I adore math (and your a math teacher!)");
        Begging ();
        Salutation (); 
    }
    public static void Paul ()
    {
        System.out.println("Dear Mr. Paul,");
        System.out.println("I was in your class for 2 years, and I was so smart. I got an A+");
        System.out.println("every semester and helped other people figure out there work.");
        Intro ();
        Stuffdone ();
        System.out.println("Since I helped to much with turoring in chemistry you should really");
        System.out.println("write a letter for me. Please, Please, Please, Please");
        Begging ();
        Salutation ();
    }
    public static void Intro ()
    {
        System.out.println("I finally made it to senior year here at Mills and I'm starting to apply");
        System.out.println("to colleges. The only way I'll get into any of my dream schools is if");
        System.out.println("you help me and write a letter of Rec for me. Here if why you");
        System.out.println("write an amazing letter for me so I can get into Stanford, Cal, or Duke");
    }
    public static void Stuffdone ()
    {
        System.out.println("I am such an amazing person becuase I participate in a lot of activities");
        System.out.println("and I always succeed in everything I do. I've taken so many AP");
        System.out.println("classes and gotten A's in all of them. I never fail. I'm in");
        System.out.println("some clubs and I volunteer for some programs.");
    }
    public static void Begging ()
    {
        System.out.println("Please, please, please, please help a bud out.");
    }
    public static void Salutation ()
    {
        System.out.println("\t\t\t\t Sincerely,");
        System.out.println("\t\t\t\t A student going to college");
    }
}
    