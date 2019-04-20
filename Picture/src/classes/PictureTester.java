package classes;
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
    Picture beach = new Picture("images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue() {
	  Picture beach = new Picture("images/beach.jpg");
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  
  /** Method to test negate */
  public static void testNegate() {
	  Picture beach = new Picture("images/beach.jpg");
	  beach.negate();
	  beach.explore();
  }
  
  /** Method to test greyscale */
  public static void testGreyscale() {
	  Picture beach = new Picture("images/beach.jpg");
	  beach.greyscale();
	  beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorVerticalRightToLeft */
  public static void testMirrorVerticalRightToLeft() {
	  Picture caterpillar = new Picture("images/caterpillar.jpg");
	  caterpillar.mirrorVerticalRightToLeft();
	  caterpillar.explore();
  }
  
  /** Method to test mirrorHorizontal */
  public static void testMirrorHorizontal() {
	  Picture motorcycle = new Picture("images/redMotorcycle.jpg");
	  motorcycle.mirrorHorizontal();
	  motorcycle.explore();
  }
  
  /** Method to test mirrorHorizontalBotToTop */
  public static void testMirrorHorizontalBotToTop() {
	  Picture motorcycle = new Picture("images/redMotorcycle.jpg");
	  motorcycle.mirrorHorizontalBotToTop();
	  motorcycle.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test mirrorSnowman */
  public static void testMirrorArms() {
	  Picture snowman = new Picture("images/snowman.jpg");
	  snowman.mirrorArms();
	  snowman.explore();
  }
  
  /** Method to test mirrorGull */
  public static void testMirrorGull() {
	  Picture gull = new Picture("images/seagull.jpg");
	  gull.mirrorGull();
	  gull.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test myCollage method */
  public static void testMyCollage() {
	  Picture canvas = new Picture("images/640x480.jpg");
	  canvas.myCollage();
	  canvas.explore();
  }
  
  /** Method to test the copy method */
  public static void testCopy() {
	  Picture motorcycle = new Picture("images/blueMotorcycle.jpg");
	  Picture moon = new Picture("images/moon-surface.jpg");
	  motorcycle.copy(moon, 20, 200, 70, 320, 30, 50);
	  motorcycle.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("images/swan.jpg");
    swan.edgeDetection(10);
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
    //testGreyscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
	//testMyCollage();
    //testCopy();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}