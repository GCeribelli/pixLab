package pixLab;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("src/images/8-3-large.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  public static void testNegate()
  {
    Picture beach = new Picture("src/images/8-3-large.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }

  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("src/images/8-3-large.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
   public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("src/images/8-3-large.jpg");
    beach.explore();
    beach.keepOnlyRed();
    beach.explore();
  }
    public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("src/images/8-3-large.jpg");
    beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
  }
    public static void testGrayscale()
  {
    Picture beach = new Picture("src/images/8-3-large.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
 
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("src/images/redMotorcycle.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  public static void testMirrorHorizontalBotToTop()
  {
    Picture caterpillar = new Picture("src/images/redMotorcycle.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  public static void testFixUnderwater()
  {
    Picture water = new Picture("src/images/water.jpg");
    water.explore();
    water.underWater();
    water.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("src/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  public static void testMirrorArms()
  {
    Picture temple = new Picture("src/images/snowman.jpg");
    temple.explore();
    temple.mirrorSnow();
    temple.explore();
  }
  public static void testMirrorGull()
  {
    Picture temple = new Picture("src/images/seagull.jpg");
    temple.explore();
    temple.mirrorGull();
    temple.explore();
  }
  public static void testMirrorDiagonal()
  {
    Picture temple = new Picture("src/images/beach.jpg");
    temple.explore();
    temple.mirrorDiagonal();
    temple.explore();
  }
  public static void testCopy()
  {
    Picture temple = new Picture("src/images/beach.jpg");
    Picture snowman = new Picture("src/images/snowman.jpg");
    temple.explore();
    temple.copyPart(snowman, 200,200,100,100,400,400);
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("src/images/beach.jpg");
    canvas.myCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("src/images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("src/images/swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}