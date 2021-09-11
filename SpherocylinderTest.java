import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
  * Tests the files for the Spherocylinder.
  * @author Cole Rasmussen
  * Project 07A and Project07B
  * @version 10/16/2020 - 10/23/2020
  */ 
public class SpherocylinderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** tests label methods. **/
   @Test public void labelTest() 
   {
      Spherocylinder drCross = new Spherocylinder("Large Example", 98.32, 99.0);
      Assert.assertEquals("Test Failed", true, 
         drCross.setLabel("Large Example"));
      Assert.assertEquals("Test Failed", "Large Example", drCross.getLabel());
   }
   /** tests radius method. **/
   @Test public void radiusTest()
   {
      Spherocylinder drCross = new Spherocylinder("Large Example", 98.32, 99.0);
      Assert.assertEquals("Test Failed", true, drCross.setRadius(98.32));
      Assert.assertEquals("Test Failed", 98.32, drCross.getRadius(), 0);
   }
/** tests cylinderHeight method. **/
   @Test public void cHeightTest()
   {
      Spherocylinder drCross = new Spherocylinder("Large Example", 98.32, 99.0);
      Assert.assertEquals("Test Failed", true, drCross.setCylinderHeight(99.0));
      Assert.assertEquals("Test Failed", 99.0, drCross.getCylinderHeight(), 0);
   } 
   /** tests circumference method. **/
   @Test public void circumferenceTest()
   {
      Spherocylinder drCross = new Spherocylinder("Large Example", 98.32, 99.0);
      Assert.assertEquals("Test Failed", 617.7627794018969, 
         drCross.circumference(), 0);
   }
   /** tests area method. **/
   @Test public void areaTest()
   {
      Spherocylinder drCross = new Spherocylinder("Large Example", 98.32, 99.0);
      Assert.assertEquals("Test Failed", 182635.38810237678, 
         drCross.surfaceArea(), 0);
   }
   /** tests volume method. **/
   @Test public void volumeTest()
   {
      Spherocylinder drCross = new Spherocylinder("Large Example", 98.32, 99.0);
      Assert.assertEquals("Test Failed", 6987754.6545100035, 
         drCross.volume(), 0);
   }
   /** tests toString method. **/
   @Test public void toStringTest()
   {
      Spherocylinder drCross = new Spherocylinder("Large Example", 98.32, 99.0);
      String james = "Spherocylinder \"Large Example\" with radius "
         + "98.32 and cylinder height 99.0 has:\n\tcircumference = "
         + "617.763 units\n\tsurface area = 182,635.388 square units"
         + "\n\tvolume = 6,987,754.655 cubic units";
      Assert.assertEquals(james, drCross.toString());
   }
   /** tests count methods. **/
   @Test public void countTests()
   {
      Spherocylinder.resetCount();
      Assert.assertEquals("Test Failed", Spherocylinder.getCount(), 0);
      Spherocylinder drCross = new Spherocylinder("Large Example", 98.32, 99.0);
      Assert.assertEquals("Test Failed", Spherocylinder.getCount(), 1);
   }
   /** tests equals method. **/
   @Test public void equalsTest()
   {
      Spherocylinder test1 = new Spherocylinder("Reference", 2.0, 15.0);
      Spherocylinder test2 = new Spherocylinder("Reference", 0.0, 15.0);
      Spherocylinder test3 = new Spherocylinder("Reference", 2.0, 0.0);
      Spherocylinder test4 = new Spherocylinder("Reference", 2.0, 15.0);
      Spherocylinder test5 = new Spherocylinder("Referene", 2.0, 15.0);
      Assert.assertEquals("Test Failed", test1.equals(test2), false);
      Assert.assertEquals("Test Failed", test1.equals(test3), false);
      Assert.assertEquals("Test Failed", test1.equals(test4), true);
      Assert.assertEquals("Test Failed", test1.equals(test5), false);
      String ref = "reference test";
      Assert.assertEquals("Test Failed", test1.equals(ref), false);
      Assert.assertEquals("Test Failed", test1.hashCode(), 0);
   }
         /** tests compareTo method. **/
   @Test public void firstCompareToTest()
   {
      Spherocylinder james = new Spherocylinder("Reference", 2.0, 15.0);
      Spherocylinder cross = new Spherocylinder("Reference", 3.0, 15.0);
      Assert.assertEquals("Test Failed", james.compareTo(cross), -1);
   }
         /** tests compareTo method. **/
   @Test public void secondCompareToTest()
   {
      Spherocylinder james = new Spherocylinder("Reference", 2.0, 15.0);
      Spherocylinder cross = new Spherocylinder("Reference", 2.0, 15.0);
      Assert.assertEquals("Test Failed", james.compareTo(cross), 0);
   }
         /** tests compareTo method. **/
   @Test public void thirdCompareToTest()
   {
      Spherocylinder james = new Spherocylinder("Reference", 3.0, 15.0);
      Spherocylinder cross = new Spherocylinder("Reference", 2.0, 15.0);
      Assert.assertEquals("Test Failed", james.compareTo(cross), 1);
   }
               
         /** tests compareTo method. **/
   @Test public void fourthCompareToTest()
   {
      Spherocylinder james = new Spherocylinder("Reference", 2.0, 15.0);
      Spherocylinder cross = new Spherocylinder("Reference", 2.0, 16.0);
      Assert.assertEquals("Test Failed", james.compareTo(cross), -1);
   }
         /** tests compareTo method. **/
   @Test public void fifthCompareToTest()
   {
      Spherocylinder james = new Spherocylinder("Reference", 2.0, 16.0);
      Spherocylinder cross = new Spherocylinder("Reference", 2.0, 15.0);
      Assert.assertEquals("Test Failed", james.compareTo(cross), 1);
   }

}
