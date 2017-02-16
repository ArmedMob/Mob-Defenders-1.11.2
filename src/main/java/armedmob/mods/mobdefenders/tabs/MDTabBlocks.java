package armedmob.mods.mobdefenders.tabs;

import armedmob.mods.mobdefenders.blocks.MDBlocks;
import armedmob.mods.mobdefenders.items.MDItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Armed Mob on 2/6/2017.
 */
public class MDTabBlocks extends CreativeTabs {

    public MDTabBlocks(int index, String label) {

        super(index, label);
    }

    @Override
    public ItemStack getTabIconItem() {

        return new ItemStack(Item.getItemFromBlock(MDBlocks.blockAluminum));
    }
    
    //Old 1.10.2 Code
    /*@Override
    public Item getTabIconItem() {
      
    	return Item(Item.getItemFromBlock(MDBlocks.blockAluminum)
    }*/
}
