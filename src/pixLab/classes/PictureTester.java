package pixLab.classes;
import java.awt.*;
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
	public static void testChromakey()
	  {
	    Picture source = new Picture("panda.jpg");
	    Picture background = new Picture("bird.jpg");
	    source.explore();
	    background.explore();
	    source.chromakey(background, Color.WHITE);
	    source.explore();
	  }
	
	public static void testGlitch()
	  {
	    Picture beach = new Picture("panda.jpg");
	    beach.explore();
	    beach.glitch();
	    beach.shiftUpDown(200);
//	    beach.shiftLeftRight(200);
	    beach.explore();
	    beach.glitch();
	    
	  }
  /** Method to test zeroBlue */
  public static void testZeroRed()
  {
    Picture beach = new Picture("panda.jpg");
    beach.explore();
    beach.zeroRed();
    beach.explore();
  }
  public static void testZeroBlue()
  {
    Picture beach = new Picture("panda.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testNegate()
  {
    Picture beach = new Picture("panda.jpg");
    beach.explore();
    beach.negative();
    beach.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("redMotorcycle.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture temple = new Picture("seagull.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testSteganography()
  {
	  Picture source = new Picture("artWall.jpg");
	  Picture message = new Picture("hands.jpg");
	  
	  source.explore();
	  message.explore();
	  source.hidePicture(message);
	  source.explore();
	  source.revealPicture();
	  source.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
//	  testChromakey();
	  testSteganography();
//	  testGlitch();
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
//	testZeroBlue();
//    testZeroRed();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
//    testNegate();
    //testGrayscale();
    //testFixUnderwater();
   //testMirrorVertical();
	  //testMirrorHorizontal();
    //testMirrorTemple();
    //testMirrorArms();
//    testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}