/**
 * �������� ������ �� ���� �������� ����� �� 1 �� 99,
 * �������� ��� �� ����� � ������,
 * � ����� ���� �� ������ �������� �� ����� ���� � ������,
 * �� � �������� ������� (99 97 95 93 � 7 5 3 1).
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
