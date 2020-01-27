package com.Zoe.PixelmonRFSupplements.Items;

import com.Zoe.PixelmonRFSupplements.Init.ModItems;
import com.Zoe.PixelmonRFSupplements.PixelmonSupplementals;
import com.Zoe.PixelmonRFSupplements.Utils.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.REDSTONE);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        PixelmonSupplementals.proxy.registerItemRenderer(this, 0, "Inventory");

    }
}
