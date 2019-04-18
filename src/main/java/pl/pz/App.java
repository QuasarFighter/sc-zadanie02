package pl.pz;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SimpleClass sc = SimpleClass.builder().x(1).y(2).z(3).build();
        System.out.println( sc.toString() );
    }
}
