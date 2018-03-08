this.setLocationRelativeTo(null);   //centers form
this.getRootPane().setDefaultButton(JButton); // sets default button
this.setIconImage(Toolkit.getDefaultToolkit().getImage("/src/Picture.jpg"));// set icon for form
 ------------------------------------------------------------------------------------------------------------------------
private void setDate()
{   
    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    Date date = new Date();
    this.setTitle("project name --" + dateFormat.format(date));
}
------------------------------------------------------------------------------------------------------------------------
private StringBuffer padSpaces(String first, String second)
{

     final int MAX_SPACES = 35;
     StringBuffer line = new StringBuffer(first);
     
     int numSpaces = MAX_SPACES - first.length() - second.length();
      for (int i = 0; i< numSpaces; i++)
      {
         line.append(" ");
         line.append(second);
         return line;
       }
}
------------------------------------------------------------------------------------------------------------------------
catch(NumberFormatException numexp)// display error message
{
   JOptionPane.showMessageDialog( null,
        message,"Illegal Input", JOptionPane.WARNING_MESSAGE );
   listAllJTextField.requestFocus();
   listAllJTextField.selectAll();
}
------------------------------------------------------------------------------------------------------------------------
    public static int binarySearch(int[] anArray, int key) 
    {
        int low = 0;
        int high = (anArray.length - 1);    //.length will give you how many 
        //items are in the array, not the index number
        int middle;
        while (low <= high)
        {
            middle  = (low + high)/2;
            if(key == anArray[middle])
                return middle;
            else if (key < anArray[middle])
                high = middle -1;
            else
                low = middle +1;
        }
        return -1;
    }
------------------------------------------------------------------------------------------------------------------------
    private static int linearSearch(int[] anArray, int key) 
    {
        for (int i = 0; i < anArray.length; i++)
        {
            if(anArray[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
------------------------------------------------------------------------------------------------------------------------
    private void AboutJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // shows about form
        About myAbout = new About(this, true);
        myAbout.setVisible(true);
    } 
------------------------------------------------------------------------------------------------------------------------
 Scanner input = new Scanner(new File("src/" + name)); // reads file