package jinkhya.pinkmod;


import jinkhya.pinkmod.pinkitems.armor.rosamond.*;
import jinkhya.pinkmod.pinkitems.armor.rosequartz.*;
import jinkhya.pinkmod.pinkitems.materials.RosamondDust;
import jinkhya.pinkmod.pinkitems.materials.RosamondIngot;
import jinkhya.pinkmod.pinkitems.materials.RoseQuartz;
import jinkhya.pinkmod.pinkitems.tools.rosamond.*;
import jinkhya.pinkmod.pinkitems.tools.rosequartz.*;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

    public static final Item.ToolMaterial ROSE_QUARTZ_SWORD = EnumHelper.addToolMaterial("rose_quartz", 3, 900, 8.0F, 4.0F, 16);
    public static final Item.ToolMaterial ROSE_QUARTZ_AXE = EnumHelper.addToolMaterial("rose_quartz", 3, 900, 8.0F, 4.0F, 16);
    public static final Item.ToolMaterial ROSE_QUARTZ_HOE = EnumHelper.addToolMaterial("rose_quartz", 3, 900, 8.0F, 4.0F, 16);
    public static final Item.ToolMaterial ROSE_QUARTZ_SHOVEL = EnumHelper.addToolMaterial("rose_quartz", 3, 900, 8.0F, 4.0F, 16);
    public static final Item.ToolMaterial ROSE_QUARTZ_PICKAXE = EnumHelper.addToolMaterial("rose_quartz", 3, 900, 8.0F, 4.0F, 16);

    public static final Item.ToolMaterial ROSAMOND_SWORD = EnumHelper.addToolMaterial("rosamond", 4, 2500, 12.0F, 5.0F, 30);
    public static final Item.ToolMaterial ROSAMOND_AXE = EnumHelper.addToolMaterial("rosamond", 4, 2500, 12.0F, 5.0F, 30);
    public static final Item.ToolMaterial ROSAMOND_HOE = EnumHelper.addToolMaterial("rosamond", 4, 2500, 12.0F, 5.0F, 30);
    public static final Item.ToolMaterial ROSAMOND_SHOVEL = EnumHelper.addToolMaterial("rosamond", 4, 2500, 12.0F, 5.0F, 30);
    public static final Item.ToolMaterial ROSAMOND_PICKAXE = EnumHelper.addToolMaterial("rosamond", 4, 2500, 12.0F, 5.0F, 30);


    public static final ItemArmor.ArmorMaterial ROSAMOND_HELMET = EnumHelper.addArmorMaterial("armor_rosamond", PinkMod.MOD_ID + ":rosamond", 60, new int[] {4, 7, 9, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
    public static final ItemArmor.ArmorMaterial ROSAMOND_CHESTPLATE= EnumHelper.addArmorMaterial("armor_rosamond", PinkMod.MOD_ID + ":rosamond", 60, new int[] {4, 7, 9, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
    public static final ItemArmor.ArmorMaterial ROSAMOND_LEGGINGS = EnumHelper.addArmorMaterial("armor_rosamond", PinkMod.MOD_ID + ":rosamond", 60, new int[] {4, 7, 9, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
    public static final ItemArmor.ArmorMaterial ROSAMOND_BOOTS = EnumHelper.addArmorMaterial("armor_rosamond", PinkMod.MOD_ID + ":rosamond", 60, new int[] {4, 7, 9, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);

    public static final ItemArmor.ArmorMaterial ROSE_QUARTZ_HELMET = EnumHelper.addArmorMaterial("armor_rose_quartz", PinkMod.MOD_ID + ":rose_quartz", 30, new int[] {2, 5, 6, 2}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
    public static final ItemArmor.ArmorMaterial ROSE_QUARTZ_CHESTPLATE= EnumHelper.addArmorMaterial("armor_rose_quartz", PinkMod.MOD_ID + ":rose_quartz", 30, new int[] {2, 5, 6, 2}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
    public static final ItemArmor.ArmorMaterial ROSE_QUARTZ_LEGGINGS = EnumHelper.addArmorMaterial("armor_rose_quartz", PinkMod.MOD_ID + ":rose_quartz", 30, new int[] {2, 5, 6, 2}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
    public static final ItemArmor.ArmorMaterial ROSE_QUARTZ_BOOTS = EnumHelper.addArmorMaterial("armor_rose_quartz", PinkMod.MOD_ID + ":rose_quartz", 30, new int[] {2, 5, 6, 2}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);

    /**
     * Rose Quartz Tools and materials
     **/

    @GameRegistry.ObjectHolder("pinkmod:rose_quartz")
    public static RoseQuartz roseQuartz;

    @GameRegistry.ObjectHolder("pinkmod:rose_quartz_axe")
    public static RoseQuartzAxe roseQuartzAxe;

    @GameRegistry.ObjectHolder("pinkmod:rose_quartz_hoe")
    public static RoseQuartzHoe roseQuartzHoe;

    @GameRegistry.ObjectHolder("pinkmod:rose_quartz_pickaxe")
    public static RoseQuartzPickaxe roseQuartzPickaxe;

    @GameRegistry.ObjectHolder("pinkmod:rose_quartz_shovel")
    public static RoseQuartzShovel roseQuartzShovel;

    @GameRegistry.ObjectHolder("pinkmod:rose_quartz_sword")
    public static RoseQuartzSword roseQuartzSword;

    @GameRegistry.ObjectHolder("pinkmod:rose_quartz_shield")
    public static RoseQuartzShield roseQuartzShield;
    /**
     * Rose Quartz Armor
     **/
    @GameRegistry.ObjectHolder("pinkmod:rose_quartz_helmet")
    public static RoseQuartzHelmet roseQuartzHelmet;

    @GameRegistry.ObjectHolder("pinkmod:rose_quartz_chestplate")
    public static RoseQuartzChestplate roseQuartzChestplate;

    @GameRegistry.ObjectHolder("pinkmod:rose_quartz_leggings")
    public static RoseQuartzLeggings roseQuartzLeggings;

    @GameRegistry.ObjectHolder("pinkmod:rose_quartz_boots")
    public static RoseQuartzBoots roseQuartzBoots;
    /**
     * Rosamond Armor
     **/

    @GameRegistry.ObjectHolder("pinkmod:rosamond_helmet")
    public static RosamondHelmet rosamondHelmet;

    @GameRegistry.ObjectHolder("pinkmod:rosamond_chestplate")
    public static RosamondChestplate rosamondChestplate;

    @GameRegistry.ObjectHolder("pinkmod:rosamond_leggings")
    public static RosamondLeggings rosamondLeggings;

    @GameRegistry.ObjectHolder("pinkmod:rosamond_boots")
    public static RosamondBoots rosamondBoots;

    /**
     * Rosamond Tools and materials
     **/

    @GameRegistry.ObjectHolder("pinkmod:rosamond_dust")
    public static RosamondDust rosamondDust;

    @GameRegistry.ObjectHolder("pinkmod:rosamond_ingot")
    public static RosamondIngot rosamondIngot;

    @GameRegistry.ObjectHolder("pinkmod:rosamond_axe")
    public static RosamondAxe rosamondAxe;

    @GameRegistry.ObjectHolder("pinkmod:rosamond_hoe")
    public static RosamondHoe rosamondHoe;

    @GameRegistry.ObjectHolder("pinkmod:rosamond_pickaxe")
    public static RosamondPickaxe rosamondPickaxe;

    @GameRegistry.ObjectHolder("pinkmod:rosamond_shovel")
    public static RosamondShovel rosamondShovel;

    @GameRegistry.ObjectHolder("pinkmod:rosamond_sword")
    public static RosamondSword rosamondSword;

    @GameRegistry.ObjectHolder("pinkmod:rosamond_shield")
    public static RosamondShield rosamondShield;

    @SideOnly(Side.CLIENT)
    public static void initClient() {

        roseQuartz.initModel();
        roseQuartzAxe.initModel();
        roseQuartzHoe.initModel();
        roseQuartzPickaxe.initModel();
        roseQuartzShovel.initModel();
        roseQuartzSword.initModel();
        roseQuartzShield.initModel();

        rosamondDust.initModel();
        rosamondIngot.initModel();
        rosamondAxe.initModel();
        rosamondHoe.initModel();
        rosamondPickaxe.initModel();
        rosamondShovel.initModel();
        rosamondSword.initModel();
        rosamondShield.initModel();

        rosamondHelmet.initModel();
        rosamondChestplate.initModel();
        rosamondLeggings.initModel();
        rosamondBoots.initModel();

        roseQuartzHelmet.initModel();
        roseQuartzChestplate.initModel();
        roseQuartzLeggings.initModel();
        roseQuartzBoots.initModel();
    }

}

