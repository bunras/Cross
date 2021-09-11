import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
  * Tests the files for the SpherocylinderList.
  * @author Cole Rasmussen
  * Project 8
  * @version 10/30/2020
  */ 
public class SpherocylinderListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that tests getName. **/
   @Test public void getNameTest()
   {
      Spherocylinder t1 = new Spherocylinder("Small Example", 2.1, 3.52);
      Spherocylinder t2 = new Spherocylinder("Medium Example", 3, 4.20);
      Spherocylinder t3 = new Spherocylinder("Large Example", 4.2, 5.99);
      Spherocylinder[] ketchup = {t1, t2, t3};
      SpherocylinderList mustard = new SpherocylinderList("Test", ketchup,
         ketchup.length);
      Assert.assertEquals("Test Failed", "Test", mustard.getName());
   }
   /** A test that tests numberOfSpherocylinders. **/
   @Test public void numberOfSpherocylinders1()
   {
      Spherocylinder t1 = new Spherocylinder("Small Example", 2.1, 3.52);
      Spherocylinder t2 = new Spherocylinder("Medium Example", 3, 4.20);
      Spherocylinder t3 = new Spherocylinder("Large Example", 4.2, 5.99);
      Spherocylinder[] milk = {t1, t2, t3};
      SpherocylinderList cookies = new SpherocylinderList("Test", milk, 
         milk.length);
      Assert.assertEquals("Test Failed", 3, cookies.numberOfSpherocylinders());
   }
   /** A test that tests numberOfSpherocylinders. **/
   @Test public void numberOfSpherocylinders2()
   {
      Spherocylinder[] ice = {};
      SpherocylinderList fire  = new SpherocylinderList("Test", ice, 
         ice.length);
      Assert.assertEquals("Test Failed", 0, fire.numberOfSpherocylinders());
   }
   /** A test that tests totalSurfaceArea. **/
   @Test public void totalSurfaceAreaTest1()
   {
      Spherocylinder t1 = new Spherocylinder("Small Example", 2.1, 3.52);
      Spherocylinder t2 = new Spherocylinder("Medium Example", 3, 4.20);
      Spherocylinder t3 = new Spherocylinder("Large Example", 4.2, 5.99);
      Spherocylinder[] dog = {t1, t2, t3};
      SpherocylinderList cat = new SpherocylinderList("Test", dog, dog.length);
      Assert.assertEquals("Test Failed", 673.871624, cat.totalSurfaceArea(), 
         0.000001);
   }
   /** A test that tests totalSurfaceArea. **/
   @Test public void totalSurfaceAreaTest2()
   {
      Spherocylinder[] shirt = {};
      SpherocylinderList pants  = new SpherocylinderList("Test", shirt,
         shirt.length);
      Assert.assertEquals("Test Failed", 0.0, pants.totalSurfaceArea(), 
         0.000001);
   }
   /** A test that tests totalVolume. **/
   @Test public void totalVolumeTest1()
   {
      Spherocylinder t1 = new Spherocylinder("Small Example", 2.1, 3.52);
      Spherocylinder t2 = new Spherocylinder("Medium Example", 3, 4.20);
      Spherocylinder t3 = new Spherocylinder("Large Example", 4.2, 5.99);
      Spherocylinder[] eyes = {t1, t2, t3};
      SpherocylinderList ears = new SpherocylinderList("Test", eyes, 
         eyes.length);
      Assert.assertEquals("Test Failed", 961.7005732, ears.totalVolume(), 
         0.000001);
   }
   /** A test that tests totalVolume. **/
   @Test public void totalVolumeTest2()
   {
      Spherocylinder[] young = {};
      SpherocylinderList old  = new SpherocylinderList("Test", young,
         young.length);
      Assert.assertEquals("Test Failed", 0.0, old.totalVolume(), 0.000001);
   }
   /** A test that tests averageSurfaceArea. **/
   @Test public void averageSurfaceAreaTest1()
   {
      Spherocylinder t1 = new Spherocylinder("Small Example", 2.1, 3.52);
      Spherocylinder t2 = new Spherocylinder("Medium Example", 3, 4.20);
      Spherocylinder t3 = new Spherocylinder("Large Example", 4.2, 5.99);
      Spherocylinder[] norsk = {t1, t2, t3};
      SpherocylinderList swede = new SpherocylinderList("Test", norsk, 
         norsk.length);
      Assert.assertEquals("Test Failed", 224.623875, 
         swede.averageSurfaceArea(), 0.000001);
   }
   /** A test that tests averageSurfaceArea. **/
   @Test public void averageSurfaceAreaTest2()
   {
      Spherocylinder[] pb = {};
      SpherocylinderList j  = new SpherocylinderList("Test", pb, pb.length);
      Assert.assertEquals("Test Failed", 0.0, j.averageSurfaceArea(), 0.000001);
   }
   /** A test that tests averageVolume. **/
   @Test public void averageVolumeTest1()
   {
      Spherocylinder t1 = new Spherocylinder("Small Example", 2.1, 3.52);
      Spherocylinder t2 = new Spherocylinder("Medium Example", 3, 4.20);
      Spherocylinder t3 = new Spherocylinder("Large Example", 4.2, 5.99);
      Spherocylinder[] wind = {t1, t2, t3};
      SpherocylinderList rain = new SpherocylinderList("Test", wind, 
         wind.length);
      Assert.assertEquals("Test Failed", 320.566857, rain.averageVolume(),
         0.000001);
   }
   /** A test that tests averageVolume. **/
   @Test public void averageVolumeTest2()
   {
      Spherocylinder[] wii = {};
      SpherocylinderList sports  = new SpherocylinderList("Test", wii, 
         wii.length);
      Assert.assertEquals("Test Failed", 0.0, sports.averageVolume(), 0.000001);
   }
   /** A test that tests toString. **/
   @Test public void toStringTest()
   {
      Spherocylinder t1 = new Spherocylinder("Small Example", 2.1, 3.52);
      Spherocylinder t2 = new Spherocylinder("Medium Example", 3, 4.20);
      Spherocylinder t3 = new Spherocylinder("Large Example", 4.2, 5.99);
      Spherocylinder[] spooky = {t1, t2, t3};
      SpherocylinderList scary = new SpherocylinderList("Test", spooky, 
         spooky.length);
      Assert.assertEquals("Test Failed",
         "----- Summary for Test -----\n"
         + "Number of Spherocylinders: 3\n"
         + "Total Surface Area: 673.872\n"
         + "Total Volume: 961.701\n"
         + "Average Surface Area: 224.624\n"
         + "Average Volume: 320.567", scary.toString());
   }
   /** A test that tests getList. **/
   @Test public void getListTest()
   {
      Spherocylinder t1 = new Spherocylinder("Small Example", 2.1, 3.52);
      Spherocylinder t2 = new Spherocylinder("Medium Example", 3, 4.20);
      Spherocylinder t3 = new Spherocylinder("Large Example", 4.2, 5.99);
      Spherocylinder[] iPhone = {t1, t2, t3};
      SpherocylinderList android = new SpherocylinderList("Test", iPhone, 
         iPhone.length);
      Assert.assertEquals("Test Failed", iPhone, android.getList());
   }
   /** A test that tests addSpherocylinder. **/
   @Test public void addSpherocylinderTest1()
   {
      Spherocylinder t1 = new Spherocylinder("Small Example", 2.1, 3.52);
      Spherocylinder t2 = new Spherocylinder("Medium Example", 3, 4.20);
      Spherocylinder[] cash = {t1, t2};
      SpherocylinderList coin = new SpherocylinderList("Test", cash, 
         cash.length);
      coin.addSpherocylinder("Large Example", 4.2, 5.99);
      Assert.assertEquals("Test Failed",
         "----- Summary for Test -----\n"
         + "Number of Spherocylinders: 3\n"
         + "Total Surface Area: 673.872\n"
         + "Total Volume: 961.701\n"
         + "Average Surface Area: 224.624\n"
         + "Average Volume: 320.567", coin.toString());
   }
   /** A test that tests addSpherocylinder. **/
   @Test public void addSpherocylinderTest2()
   {
      Spherocylinder t1 = new Spherocylinder("Small Example", 2.1, 3.52);
      Spherocylinder t2 = new Spherocylinder("Delete", 0.2, 60.0);
      Spherocylinder t3 = new Spherocylinder("Large Example", 4.2, 5.99);
      Spherocylinder[] air = {t1, t2, t3};
      SpherocylinderList pod = new SpherocylinderList("Test", air, air.length);
      pod.deleteSpherocylinder("Delete");
      pod.addSpherocylinder("Medium Example", 3, 4.20);
      Assert.assertEquals("Test Failed",
         "----- Summary for Test -----\n"
         + "Number of Spherocylinders: 3\n"
         + "Total Surface Area: 673.872\n"
         + "Total Volume: 961.701\n"
         + "Average Surface Area: 224.624\n"
         + "Average Volume: 320.567", pod.toString());
   }
   /** A test that tests findSpherocylinder. **/
   @Test public void findSpherocylinderTest1()
   {
      Spherocylinder t1 = new Spherocylinder("Small Example", 2.1, 3.52);
      Spherocylinder t2 = new Spherocylinder("Medium Example", 3, 4.20);
      Spherocylinder t3 = new Spherocylinder("Large Example", 4.2, 5.99);
      Spherocylinder[] air = {t1, t2, t3};
      SpherocylinderList pod = new SpherocylinderList("Test", air, air.length);
      Assert.assertEquals("Test Failed", pod.getList()[2], 
         pod.findSpherocylinder("Large Example"));
   }
   /** A test that tests findSpherocylinder. **/
   @Test public void findSpherocylinder2()
   {
      Spherocylinder t1 = new Spherocylinder("Small Example", 2.1, 3.52);
      Spherocylinder t2 = new Spherocylinder("Medium Example", 3, 4.20);
      Spherocylinder t3 = new Spherocylinder("Large Example", 4.2, 5.99);
      Spherocylinder[] air = {t1, t2, t3};
      SpherocylinderList pod = new SpherocylinderList("Test", air, air.length);
      Assert.assertEquals("Test Failed", null, 
         pod.findSpherocylinder("Cross")); 
   }
   /** A test that tests deleteSpherocylinder. **/
   @Test public void deleteSpherocylinderTest1()
   {
      Spherocylinder t1 = new Spherocylinder("Small Example", 2.1, 3.52);
      Spherocylinder t2 = new Spherocylinder("Medium Example", 3, 4.20);
      Spherocylinder t3 = new Spherocylinder("Large Example", 4.2, 5.99);
      Spherocylinder[] air = {t1, t2, t3};
      SpherocylinderList pod = new SpherocylinderList("Test", air, air.length);
      Assert.assertEquals("Test Failed", t2, 
         pod.deleteSpherocylinder("Medium Example")); 
   }
   /** A test that tests deleteSpherocylinder. **/
   @Test public void deleteSpherocylinderTest2()
   {
      Spherocylinder t1 = new Spherocylinder("Small Example", 2.1, 3.52);
      Spherocylinder t2 = new Spherocylinder("Medium Example", 3, 4.20);
      Spherocylinder t3 = new Spherocylinder("Large Example", 4.2, 5.99);
      Spherocylinder[] air = {t1, t2, t3};
      SpherocylinderList pod = new SpherocylinderList("Test", air, air.length);
      Assert.assertEquals("Test Failed", null,
         pod.deleteSpherocylinder("Cross")); 
   }
   /** A test that tests deleteSpherocylinder. **/
   @Test public void deleteSpherocylinderTest3()
   {
      Spherocylinder t1 = new Spherocylinder("Small Example", 2.1, 3.52);
      Spherocylinder t2 = new Spherocylinder("Medium Example", 3, 4.20);
      Spherocylinder t3 = new Spherocylinder("Large Example", 4.2, 5.99);
      Spherocylinder[] air = {t1, t2, t3};
      SpherocylinderList pod = new SpherocylinderList("Test", air, air.length);
      pod.deleteSpherocylinder("Medium Example");
      Assert.assertEquals("Test Failed", 2, pod.numberOfSpherocylinders());
   }
   /** A test that tests deleteSpherocylinder. **/
   @Test public void deleteSpherocylinderTest4()
   {
      Spherocylinder t1 = new Spherocylinder("Small Example", 2.1, 3.52);
      Spherocylinder t2 = new Spherocylinder("Medium Example", 3, 4.20);
      Spherocylinder t3 = new Spherocylinder("Large Example", 4.2, 5.99);
      Spherocylinder[] air = {t1, t2, t3};
      SpherocylinderList pod = new SpherocylinderList("Test", air, air.length);
      pod.deleteSpherocylinder("Medium Example");
      Assert.assertEquals("Test Failed", null, pod.getList()[2]);
   }
   /** A test that tests editSpherocylinder. **/
   @Test public void editSpherocylinderTest1()
   {
      Spherocylinder t1 = new Spherocylinder("Small Example", 2.1, 3.52);
      Spherocylinder t2 = new Spherocylinder("Medium Example", 3, 4.20);
      Spherocylinder t3 = new Spherocylinder("Large Example", 4.2, 5.99);
      Spherocylinder[] air = {t1, t2, t3};
      SpherocylinderList pod = new SpherocylinderList("Test", air, air.length);
      Assert.assertEquals("Test Failed", true, 
         pod.editSpherocylinder("Large Example", 22.0, 420.0));
   }
   /** A test that tests editSpherocylinder. **/
   @Test public void editSpherocylinderTest2()
   {
      Spherocylinder t1 = new Spherocylinder("Small Example", 2.1, 3.52);
      Spherocylinder t2 = new Spherocylinder("Medium Example", 3, 4.20);
      Spherocylinder t3 = new Spherocylinder("Large Example", 4.2, 5.99);
      Spherocylinder[] air = {t1, t2, t3};
      SpherocylinderList pod = new SpherocylinderList("Test", air, air.length);
      Assert.assertEquals("Test Failed", false, 
         pod.editSpherocylinder("Milk", 22.0, 420.0));
   }
   /** A test that tests editSpherocylinder. **/
   @Test public void editSpherocylinderTest3()
   {
      Spherocylinder t1 = new Spherocylinder("Small Example", 2.1, 3.52);
      Spherocylinder t2 = new Spherocylinder("Medium Example", 3, 4.20);
      Spherocylinder t3 = new Spherocylinder("Large Example", 29.2, 69.1);
      Spherocylinder[] air = {t1, t2, t3};
      SpherocylinderList pod = new SpherocylinderList("Test", air, air.length);
      pod.editSpherocylinder("Large Example", 4.2, 5.99);
      Assert.assertEquals("Test",
                           "Spherocylinder \"Large Example\" with radius "
                              + "4.2 and cylinder height 5.99 has:\n"
                              + "\tcircumference = 26.389 units\n"
                              + "\tsurface area = 379.743 square units\n"
                              + "\tvolume = 642.291 cubic units", 
                              pod.getList()[2].toString());
   }
   /** A test that tests findSpherocylinderWithLargestVolume. **/
   @Test public void findSpherocylinderWithLargestVolumeTest1()
   {
      Spherocylinder t1 = new Spherocylinder("Small Example", 2.1, 3.52);
      Spherocylinder t2 = new Spherocylinder("Medium Example", 3, 4.20);
      Spherocylinder t3 = new Spherocylinder("Large Example", 4.2, 5.99);
      Spherocylinder[] air = {t1, t2, t3};
      SpherocylinderList pod = new SpherocylinderList("Test", air, air.length);
      Assert.assertEquals("Test Failed", t3,
         pod.findSpherocylinderWithLargestVolume());
   }
   /** A test that tests findSpherocylinderWithLargestVolume. **/
   @Test public void findSpherocylinderWithLargestVolumeTest2()
   {
      Spherocylinder t1 = new Spherocylinder("Small Example", 2.1, 3.52);
      Spherocylinder t2 = new Spherocylinder("Medium Example", 3, 4.20);
      Spherocylinder t3 = new Spherocylinder("Large Example", 4.2, 5.99);
      Spherocylinder[] air = {t1, t2, t3};
      SpherocylinderList pod = new SpherocylinderList("Test", air, air.length);
      pod.deleteSpherocylinder("Small Example");
      pod.deleteSpherocylinder("Medium Example");
      pod.deleteSpherocylinder("Large Example");
      Assert.assertEquals("Test Failed", null, 
         pod.findSpherocylinderWithLargestVolume());
   }
}
