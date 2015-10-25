/**
 * —оздайте массив из всех нечЄтных чисел от 1 до 99,
 * выведите его на экран в строку,
 * а затем этот же массив выведите на экран тоже в строку,
 * но в обратном пор€дке (99 97 95 93 Е 7 5 3 1).
 */
public class NeParni
{
  public static void main( String[] args )
  {
    int M[] = new int[ 100 ];


      for( int i = 1; i < 100; i = i + 2 )
      {
        M[ i ] = i;
        System.out.print( M[ i ] + " " );

      }
    }
  }
