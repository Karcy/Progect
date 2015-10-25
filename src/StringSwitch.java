/**
 * Created with IntelliJ IDEA.
 * User: Eugene Chipachenko
 * Date: 08.10.2015
 * Time: 17:56
 */
public class StringSwitch
{
  public static void main( String[] args )
  {
    String str = "Dva";
    switch( str )
    {
      case "Odun":
        System.out.println( "Odun" );
        break;
      case "Dva":
        System.out.println( "Dva" );
        break;
      case "Tru":
        System.out.println( "Tru" );
        break;
      default:
        System.out.println( "Net" );
        break;
    }
  }
}
