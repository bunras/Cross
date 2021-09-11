import java.text.DecimalFormat;
/**
  * Makes a Spherocylinder list.
  * @author Cole Rasmussen
  * Project 8
  * @version 10/30/2020
  */ 
public class SpherocylinderList
{
   // instance variables
   private String name;
   private Spherocylinder[] theList;
   private int number;
   // constructor
   /**
     * sets the name and the array.
     * @param nameX sets the name
     * @param arrayX sets the array
     * @param numberX sets the number
     */
   public SpherocylinderList(String nameX, Spherocylinder[] arrayX, int numberX)
   {
      name = nameX;
      theList = arrayX;
      number = numberX;
   }
   // methods
   /**
     * returns the list name.
     * @return returns the name
     */
   public String getName()
   {
      return name;
   }
   /**
     * takes the number of Spherocylinders.
     * @return returns the number
     */
   public int numberOfSpherocylinders()
   {
      if (number == 0)
      {
         return 0;
      }
      else
      {
         return number;
      }
   }
      /**
     * takes the total surface area.
     * @return returns the total
     */
   public double totalSurfaceArea()
   {
      double total = 0;
      int i = 0;
      if (number == 0)
      {
         return 0;
      }
      else
      {
         while (i < number)
         {
            total += theList[i].surfaceArea();
            i++;
         }
         total = total;
      }
      return total;
   }
   /**
     * takes the total volume.
     * @return returns the volume
     */
   public double totalVolume()
   {
      double total = 0;
      int i = 0;
      if (number == 0)
      {
         return 0;
      }
      else
      {
         while (i < number)
         {
            total += theList[i].volume();
            i++;
         }
      }
      return total;
   }
   /**
     * takes the average surface area.
     * @return returns the average
     */
   public double averageSurfaceArea()
   {
      double sum = 0;
      double cole = 0;
      if (number == 0)
      {
         return 0;
      }
      else
      {
         for (int i = 0; i < number; i++)
         {
            sum += theList[i].surfaceArea();
         }
         cole = number;
      }
      return sum / cole;
   }
   /**
     * takes the average volume.
     * @return returns the average
     */
   public double averageVolume()
   {
      double sum = 0;
      double cole = 0;
      if (number == 0)
      {
         return 0;
      }
      else
      {
         for (int i = 0; i < number; i++)
         {
            sum += theList[i].volume();
         }
         cole = number;
      }
      return sum / cole;
   }
   /**
     * summarizes the objects into a string.
     * @return returns the output
     */
   public String toString()
   {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String out = "----- Summary for " + getName() + " -----\n";
      out += "Number of Spherocylinders: " + numberOfSpherocylinders() + "\n";
      out += "Total Surface Area: " + df.format(totalSurfaceArea()) + "\n";
      out += "Total Volume: " + df.format(totalVolume()) + "\n";
      out += "Average Surface Area: " + df.format(averageSurfaceArea()) + "\n";
      out += "Average Volume: " + df.format(averageVolume());
      return out;
   }
   /**
     * takes the list.
     * @return returns the array
     */
   public Spherocylinder[] getList() 
   {
      return theList;
   }
   /**
     * adds a Spherocylinder object.
     * @param labelX takes the label
     * @param radiusX takes the radius
     * @param cHeightX takes the height
     */
   public void addSpherocylinder(String labelX, double radiusX, double cHeightX)
   {
      Spherocylinder addition = new Spherocylinder(labelX, radiusX,
         cHeightX);   
      if (number == theList.length)
      {
         Spherocylinder[] spell = 
            new Spherocylinder[theList.length + 1];
         for (int i = 0; i < number; i++) 
         {
            spell[i] = theList[i];
         }
         spell[number] = addition; 
         theList = spell;
         number++;
      }
      else
      {
         getList()[number] = addition;
         number++;
      }
   }
   /**
     * finds a Spherocylinder.
     * @param labelX takes the label
     * @return returns the object
     */
   public Spherocylinder findSpherocylinder(String labelX)
   {
      if (labelX != null)
      {
         for (Spherocylinder nut : theList)
         {
            if (nut != null)
            {
               if (nut.getLabel().equalsIgnoreCase(labelX)
                  && nut != null)
               {
                  return nut;
               }
            }
         }
      }
      return null;
   }
   /**
     * deletes a Spherocylinder.
     * @param labelX takes the label
     * @return returns the object
     */
   public Spherocylinder deleteSpherocylinder(String labelX)
   {
      labelX = labelX.toLowerCase();
      Spherocylinder deletion;
      for (int i = 0; i < number; i++)
      {
         if (labelX.equals(getList()[i].getLabel().toLowerCase()))
         {
            deletion = getList()[i];
            for (int p = i; p < number - 1; p++)
            {
               getList()[p] = getList()[p + 1];
            }
            getList()[number - 1] = null;
            number--;
            return deletion;
         }
      }
      return null;
   }
   /**
     * edits a Spherocylinder object.
     * @param labelX takes the label
     * @param radiusX takes the radius
     * @param cHeightX takes the height
     * @return returns the boolean
     */
   public boolean editSpherocylinder(String labelX, double radiusX, 
      double cHeightX)
   {
      boolean check = false;
      Spherocylinder edit = findSpherocylinder(labelX);
      if (edit != null)
      {
         for (int i = 0; i < number; i++)
         {
            if (edit.getLabel().equalsIgnoreCase(labelX))
            {
               edit.setRadius(radiusX);
               edit.setCylinderHeight(cHeightX);
               check = true;
               break;
            }
         }
      }
      return check;
   }
   /**
     * finds the object with the largest volume.
     * @return returns the object
     */
   public Spherocylinder findSpherocylinderWithLargestVolume()
   {
      double largest = 0;
      Spherocylinder cramps;
   
      if (number > 0)
      {
         largest = theList[0].volume();
      }
      int i = 0;
      while (i < number)
      {
         if (!(largest > theList[i].volume()))
         {
            largest = theList[i].volume();
         }
         i++;
      }
      for (Spherocylinder obtuse : theList)
      {
         if (obtuse != null)
         {
            if (obtuse.volume() == largest)
            {
               return obtuse;
            }
         }
      }
      return null;
   }
}