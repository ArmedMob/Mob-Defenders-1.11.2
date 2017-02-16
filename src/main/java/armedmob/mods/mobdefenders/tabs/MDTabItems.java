package armedmob.mods.mobdefenders.tabs;

import armedmob.mods.mobdefenders.Refereneces;
import armedmob.mods.mobdefenders.items.MDItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Armed Mob on 2/6/2017.
 */
public class MDTabItems extends CreativeTabs {

    public MDTabItems(int index, String label) {

        super(index, label);
    }

    //New 1.11.2 Code
    @Override
    public ItemStack getTabIconItem() {

        return new ItemStack(MDItems.ingotAluminum);
    }

    //Old 1.10.2 Code
    /*@Override
    public Item getTabIconItem() {
      
    	return Item(MDItems.ingotAluminum)
    }*/
}