package jinkhya.pinkmod;


import jinkhya.pinkmod.pinkitems.materials.RosamondDust;
import jinkhya.pinkmod.pinkitems.materials.RosamondIngot;
import jinkhya.pinkmod.pinkitems.materials.RoseQuartz;
import jinkhya.pinkmod.pinkitems.tools.rosamond.*;
import jinkhya.pinkmod.pinkitems.tools.rosequartz.*;
import net.minecraft.item.Item;
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


    @SideOnly(Side.CLIENT)
    public static void initClient() {

        roseQuartz.initModel();
        roseQuartzAxe.initModel();
        roseQuartzHoe.initModel();
        roseQuartzPickaxe.initModel();
        roseQuartzShovel.initModel();
        roseQuartzSword.initModel();

        rosamondDust.initModel();
        rosamondIngot.initModel();
        rosamondAxe.initModel();
        rosamondHoe.initModel();
        rosamondPickaxe.initModel();
        rosamondShovel.initModel();
        rosamondSword.initModel();

    }

}

