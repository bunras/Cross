import java.text.DecimalFormat;
/**
  * Constructs a spherocylinder.
  * @author Cole Rasmussen
  * Project 07A & Project 07B
  * @version 10/16/2020 - 10/23/2020
  */
public class Spherocylinder implements Comparable<Spherocylinder>
{
   private String label = "";
   private double radius, cHeight = 0;
   private static int count = 0;
   // constructor
   /**
     * creates the spherocylinder.
     * @param labelIn takes the label
     * @param radiusIn takes the radius
     * @param cHeightIn takes the height
     */
   public Spherocylinder(String labelIn, double radiusIn, double cHeightIn)
   {
      setLabel(labelIn);
      setRadius(radiusIn);
      setCylinderHeight(cHeightIn);
      count++;
   }
   // methods
   /**
     * gets the label.
     * @return returns the label
     */
   public String getLabel()
   {
      return label;
   }
   /**
     * sets the label.
     * @param labelIn uses the user's input of the label
     * @return returns the correct boolean
     */
   public boolean setLabel(String labelIn)
   {
      boolean isSet = false;
      if (labelIn != null)
      {
         label = labelIn.trim();
         isSet = true;
      }
      return isSet;
   }
   /**
     * gets the radius.
     * @return returns the radius
     */
   public double getRadius()
   {
      return radius;
   }
   /**
     * sets the radius.
     * @param radiusIn uses the user's input of the label
     * @return returns the correct boolean
     */
   public boolean setRadius(double radiusIn)
   {
      boolean isSet = false;
      if (radiusIn >= 0)
      {
         radius = radiusIn;
         isSet = true;
      }
      return isSet;
   }
   /**
     * gets the cylinder height.
     * @return returns the height
     */
   public double getCylinderHeight()
   {
      return cHeight;
   }
   /**
     * sets the height.
     * @param cHeightIn uses the user's input of the label
     * @return returns the correct boolean
     */
   public boolean setCylinderHeight(double cHeightIn)
   {
      boolean isSet = false;
      if (cHeightIn >= 0)
      {
         cHeight = cHeightIn;
         isSet = true;
      }
      return isSet;
   }
   /** 
     * calculates the surface area.
     * @return returns the surface area
     */
   public double surfaceArea()
   {
      double area = (2 * Math.PI * radius * (2 * radius + cHeight));
      return area;
   }
   /**
     * calculates the volume.
     * @return returns the volume
     */
   public double volume()
   {
      double v = (Math.PI * (radius * radius)) * ((double) 4 / 3 * radius
         + cHeight);
      return v;
   }
   /** 
     * calculates the circumference.
     * @return returns the circumference
     */
   public double circumference()
   {
      double cir = 2 * Math.PI * radius;
      return cir;
   }
   /**
     * makes a string.
     * @return returns the output
     */
   public String toString()
   {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "Spherocylinder " + "\"" + label + "\""
         + " with radius " + radius 
         + " and cylinder height " + cHeight + " has:"
         + "\n\tcircumference = " + df.format(circumference()) + " units"
         + "\n\tsurface area = " + df.format(surfaceArea()) 
         + " square units" + "\n\tvolume = " + df.format(volume())
         + " cubic units";
      return output; 
   }
   /**
     * gets the count.
     * @return returns the count
     */
   public static int getCount()
   {
      return count;
   }
   /**
     * resets the count.
     */
   public static void resetCount()
   {
      count = 0;
   }
   /**
     * setst the object equal to.
     * @param cole takes the Spherocylinder object
     * @return returns the boolean
     */
   public boolean equals(Object cole) {
      if (!(cole instanceof Spherocylinder)) {
         return false;
      }
      else {
         Spherocylinder d = (Spherocylinder) cole;
         return (label.equalsIgnoreCase(d.getLabel())
            && Math.abs(radius - d.getRadius()) < .000001
            && Math.abs(cHeight - d.getCylinderHeight())
            < .000001);
      }
   }
   /** 
     * fixes the equals method.
     * @return returns 0
     */
   public int hashCode()
   {
      return 0;
   }
   /**
     * compares objects to each other.
     * @param thing takes a Spherocylinder object
     * @return returns an integer
     */
   public int compareTo(Spherocylinder thing)
   {
      if (Math.abs(this.volume() - thing.volume()) < 0.000001)
      {
         return 0;
      }
      else if (this.volume() < thing.volume())
      {
         return -1;
      }
      else
      {
         return 1;
      }
   }
}