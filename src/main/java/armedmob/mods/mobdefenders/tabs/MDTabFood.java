package armedmob.mods.mobdefenders.tabs;

import armedmob.mods.mobdefenders.items.MDItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * Created by Armed Mob on 2/6/2017.
 */
public class MDTabFood extends CreativeTabs {

    public MDTabFood(int index, String label) {

        super(index, label);
    }

    @Override
    public ItemStack getTabIconItem() {

        return new ItemStack(MDItems.corn);
    }
    
    //Old 1.10.2 Code
    /*@Override
    public Item getTabIconItem() {
      
    	return Item(MDItems.corn)
    }*/
}
