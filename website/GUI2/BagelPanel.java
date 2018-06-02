package ch12;
import javax.swing.*;
import java.awt.*;

/**
 * The BagelPanel class allows theuser to select either
 * a white or whole wheat bagel.
 */

public class BagelPanel extends JPanel{
    
    //The following constants are used to indicate
    //the cost of each type of bagel.
    public final double WHITE_BAGEL = 1.25;
    public final double WHEAT_BAGEL = 1.50;
    
    private JRadioButton whiteBagel; //To select white bagel
    private JRadioButton wheatBagel; //To select wheat bagel
    private ButtonGroup bg; //Radio button group
    
    /**
     * Constructor
     */
    public BagelPanel(){
        
        //Create a GridLayout manager with 
        //2 rows and 1 column.
        setLayout(new GridLayout(2, 1));
        
        //Create the RadioButtons
        whiteBagel = new JRadioButton("White", true);
        wheatBagel = new JRadioButton("Wheat");
        
        //Group the radio buttons
        bg = new ButtonGroup();
        bg.add(whiteBagel);
        bg.add(wheatBagel);
        
        //Add a border around the panel.
        setBorder(BorderFactory.createTitledBorder("Bagel"));
        
        //Add radio buttons to the panel.
        add(whiteBagel);
        add(wheatBagel);
    }
    
    /**
     * Get bagel cost method
     * @return The cost of the selected bagel.
     */
    
    public double getBagelCost() {
        double bagelCost = 0.0;
        
        if(whiteBagel.isSelected()){
            bagelCost = WHITE_BAGEL;
        }
        else{
            bagelCost = WHEAT_BAGEL;
        }
        return bagelCost;
    }
}