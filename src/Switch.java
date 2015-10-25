/**
 * Created with IntelliJ IDEA.
 * User: Eugene Chipachenko
 * Date: 08.10.2015
 * Time: 17:46
 */
public class Switch
{
  public static void main( String[] args )
  {
    int month = 4;
    String season;
    switch( month )
    {
      case 12:
      case 1:
      case 2:
        season = "Zima";
        break;
      case 3:
      case 4:
      case 5:
        season = "Vesna";
        break;
      case 6:
      case 7:
      case 8:
        season = "Lito";
        break;
      case 9:
      case 10:
      case 11:
        season = "Osin";
        break;
      default:
        season = "Vugadani";
    }
    System.out.println( "Kviten vidnosutsa do " + season + "." );
  }
}
