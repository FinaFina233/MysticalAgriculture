package com.blakebr0.mysticalagriculture.item;

import com.blakebr0.cucumber.item.BaseItem;
import com.blakebr0.mysticalagriculture.api.crop.CropTiers;
import com.blakebr0.mysticalagriculture.item.armor.EssenceBootsItem;
import com.blakebr0.mysticalagriculture.item.armor.EssenceChestplateItem;
import com.blakebr0.mysticalagriculture.item.armor.EssenceHelmetItem;
import com.blakebr0.mysticalagriculture.item.armor.EssenceLeggingsItem;
import com.blakebr0.mysticalagriculture.item.tool.EssenceAxeItem;
import com.blakebr0.mysticalagriculture.item.tool.EssenceHoeItem;
import com.blakebr0.mysticalagriculture.item.tool.EssencePickaxeItem;
import com.blakebr0.mysticalagriculture.item.tool.EssenceShovelItem;
import com.blakebr0.mysticalagriculture.item.tool.EssenceSwordItem;
import com.blakebr0.mysticalagriculture.lib.ModArmorMaterial;
import com.blakebr0.mysticalagriculture.lib.ModItemTier;
import com.blakebr0.mysticalagriculture.registry.CropRegistry;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.List;

import static com.blakebr0.mysticalagriculture.MysticalAgriculture.ITEM_GROUP;

public class ModItems {
    public static final List<BlockItem> ITEM_BLOCKS = new ArrayList<>();

    public static final BaseItem PROSPERITY_SHARD = new BaseItem(p -> p.group(ITEM_GROUP));
    public static final EssenceItem INFERIUM_ESSENCE = new EssenceItem(CropTiers.ONE, p -> p.group(ITEM_GROUP));
    public static final EssenceItem PRUDENTIUM_ESSENCE = new EssenceItem(CropTiers.TWO, p -> p.group(ITEM_GROUP));
    public static final EssenceItem INTERMEDIUM_ESSENCE = new EssenceItem(CropTiers.THREE, p -> p.group(ITEM_GROUP));
    public static final EssenceItem IMPERIUM_ESSENCE = new EssenceItem(CropTiers.FOUR, p -> p.group(ITEM_GROUP));
    public static final EssenceItem SUPREMIUM_ESSENCE = new EssenceItem(CropTiers.FIVE, p -> p.group(ITEM_GROUP));
    public static final BaseItem SOULIUM_DUST = new BaseItem(p -> p.group(ITEM_GROUP));
    public static final BaseItem PROSPERITY_INGOT = new BaseItem(p -> p.group(ITEM_GROUP));
    public static final BaseItem INFERIUM_INGOT = new BaseItem(p -> p.group(ITEM_GROUP));
    public static final BaseItem PRUDENTIUM_INGOT = new BaseItem(p -> p.group(ITEM_GROUP));
    public static final BaseItem INTERMEDIUM_INGOT = new BaseItem(p -> p.group(ITEM_GROUP));
    public static final BaseItem IMPERIUM_INGOT = new BaseItem(p -> p.group(ITEM_GROUP));
    public static final BaseItem SUPREMIUM_INGOT = new BaseItem(p -> p.group(ITEM_GROUP));
    public static final BaseItem SOULIUM_INGOT = new BaseItem(p -> p.group(ITEM_GROUP));
    public static final BaseItem PROSPERITY_NUGGET = new BaseItem(p -> p.group(ITEM_GROUP));
    public static final BaseItem INFERIUM_NUGGET = new BaseItem(p -> p.group(ITEM_GROUP));
    public static final BaseItem PRUDENTIUM_NUGGET = new BaseItem(p -> p.group(ITEM_GROUP));
    public static final BaseItem INTERMEDIUM_NUGGET = new BaseItem(p -> p.group(ITEM_GROUP));
    public static final BaseItem IMPERIUM_NUGGET = new BaseItem(p -> p.group(ITEM_GROUP));
    public static final BaseItem SUPREMIUM_NUGGET = new BaseItem(p -> p.group(ITEM_GROUP));
    public static final BaseItem SOULIUM_NUGGET = new BaseItem(p -> p.group(ITEM_GROUP));
    public static final BaseItem PROSPERITY_GEMSTONE = new BaseItem(p -> p.group(ITEM_GROUP));
    public static final BaseItem INFERIUM_GEMSTONE = new BaseItem(p -> p.group(ITEM_GROUP));
    public static final BaseItem PRUDENTIUM_GEMSTONE = new BaseItem(p -> p.group(ITEM_GROUP));
    public static final BaseItem INTERMEDIUM_GEMSTONE = new BaseItem(p -> p.group(ITEM_GROUP));
    public static final BaseItem IMPERIUM_GEMSTONE = new BaseItem(p -> p.group(ITEM_GROUP));
    public static final BaseItem SUPREMIUM_GEMSTONE = new BaseItem(p -> p.group(ITEM_GROUP));
    public static final BaseItem SOULIUM_GEMSTONE = new BaseItem(p -> p.group(ITEM_GROUP));
    public static final BaseItem PROSPERITY_SEED_BASE = new BaseItem(p -> p.group(ITEM_GROUP));
    public static final BaseItem SOULIUM_SEED_BASE = new BaseItem(p -> p.group(ITEM_GROUP));
    public static final BaseItem SOUL_DUST = new BaseItem(p -> p.group(ITEM_GROUP));
    public static final InfusionCrystalItem INFUSION_CRYSTAL = new InfusionCrystalItem(1000, p -> p.group(ITEM_GROUP));
    public static final MasterInfusionCrystalItem MASTER_INFUSION_CRYSTAL = new MasterInfusionCrystalItem(p -> p.group(ITEM_GROUP));
    public static final FertilizedEssenceItem FERTILIZED_ESSENCE = new FertilizedEssenceItem(p -> p.group(ITEM_GROUP));
    public static final MysticalFertilizerItem MYSTICAL_FERTILIZER = new MysticalFertilizerItem(p -> p.group(ITEM_GROUP));

    public static final EssenceSwordItem INFERIUM_SWORD = new EssenceSwordItem(ModItemTier.INFERIUM, 3, -2.4F, p -> p.group(ITEM_GROUP));
    public static final EssencePickaxeItem INFERIUM_PICKAXE = new EssencePickaxeItem(ModItemTier.INFERIUM, 1, -2.8F, p -> p.group(ITEM_GROUP));
    public static final EssenceShovelItem INFERIUM_SHOVEL = new EssenceShovelItem(ModItemTier.INFERIUM, 1.5F, -3.0F, p -> p.group(ITEM_GROUP));
    public static final EssenceAxeItem INFERIUM_AXE = new EssenceAxeItem(ModItemTier.INFERIUM, 5.0F, -3.0F, p -> p.group(ITEM_GROUP));
    public static final EssenceHoeItem INFERIUM_HOE = new EssenceHoeItem(ModItemTier.INFERIUM, 0.0F, p -> p.group(ITEM_GROUP));
    public static final EssenceSwordItem PRUDENTIUM_SWORD = new EssenceSwordItem(ModItemTier.PRUDENTIUM, 3, -2.4F, p -> p.group(ITEM_GROUP));
    public static final EssencePickaxeItem PRUDENTIUM_PICKAXE = new EssencePickaxeItem(ModItemTier.PRUDENTIUM, 1, -2.8F, p -> p.group(ITEM_GROUP));
    public static final EssenceShovelItem PRUDENTIUM_SHOVEL = new EssenceShovelItem(ModItemTier.PRUDENTIUM, 1.5F, -3.0F, p -> p.group(ITEM_GROUP));
    public static final EssenceAxeItem PRUDENTIUM_AXE = new EssenceAxeItem(ModItemTier.PRUDENTIUM, 5.0F, -3.0F, p -> p.group(ITEM_GROUP));
    public static final EssenceHoeItem PRUDENTIUM_HOE = new EssenceHoeItem(ModItemTier.PRUDENTIUM, 0.0F, p -> p.group(ITEM_GROUP));
    public static final EssenceSwordItem INTERMEDIUM_SWORD = new EssenceSwordItem(ModItemTier.INTERMEDIUM, 3, -2.4F, p -> p.group(ITEM_GROUP));
    public static final EssencePickaxeItem INTERMEDIUM_PICKAXE = new EssencePickaxeItem(ModItemTier.INTERMEDIUM, 1, -2.8F, p -> p.group(ITEM_GROUP));
    public static final EssenceShovelItem INTERMEDIUM_SHOVEL = new EssenceShovelItem(ModItemTier.INTERMEDIUM, 1.5F, -3.0F, p -> p.group(ITEM_GROUP));
    public static final EssenceAxeItem INTERMEDIUM_AXE = new EssenceAxeItem(ModItemTier.INTERMEDIUM, 5.0F, -3.0F, p -> p.group(ITEM_GROUP));
    public static final EssenceHoeItem INTERMEDIUM_HOE = new EssenceHoeItem(ModItemTier.INTERMEDIUM, 0.0F, p -> p.group(ITEM_GROUP));
    public static final EssenceSwordItem IMPERIUM_SWORD = new EssenceSwordItem(ModItemTier.IMPERIUM, 3, -2.4F, p -> p.group(ITEM_GROUP));
    public static final EssencePickaxeItem IMPERIUM_PICKAXE = new EssencePickaxeItem(ModItemTier.IMPERIUM, 1, -2.8F, p -> p.group(ITEM_GROUP));
    public static final EssenceShovelItem IMPERIUM_SHOVEL = new EssenceShovelItem(ModItemTier.IMPERIUM, 1.5F, -3.0F, p -> p.group(ITEM_GROUP));
    public static final EssenceAxeItem IMPERIUM_AXE = new EssenceAxeItem(ModItemTier.IMPERIUM, 5.0F, -3.0F, p -> p.group(ITEM_GROUP));
    public static final EssenceHoeItem IMPERIUM_HOE = new EssenceHoeItem(ModItemTier.IMPERIUM, 0.0F, p -> p.group(ITEM_GROUP));
    public static final EssenceSwordItem SUPREMIUM_SWORD = new EssenceSwordItem(ModItemTier.SUPREMIUM, 3, -2.4F, p -> p.group(ITEM_GROUP));
    public static final EssencePickaxeItem SUPREMIUM_PICKAXE = new EssencePickaxeItem(ModItemTier.SUPREMIUM, 1, -2.8F, p -> p.group(ITEM_GROUP));
    public static final EssenceShovelItem SUPREMIUM_SHOVEL = new EssenceShovelItem(ModItemTier.SUPREMIUM, 1.5F, -3.0F, p -> p.group(ITEM_GROUP));
    public static final EssenceAxeItem SUPREMIUM_AXE = new EssenceAxeItem(ModItemTier.SUPREMIUM, 5.0F, -3.0F, p -> p.group(ITEM_GROUP));
    public static final EssenceHoeItem SUPREMIUM_HOE = new EssenceHoeItem(ModItemTier.SUPREMIUM, 0.0F, p -> p.group(ITEM_GROUP));
    public static final EssenceHelmetItem INFERIUM_HELMET = new EssenceHelmetItem(ModArmorMaterial.INFERIUM, p -> p.group(ITEM_GROUP));
    public static final EssenceChestplateItem INFERIUM_CHESTPLATE = new EssenceChestplateItem(ModArmorMaterial.INFERIUM, p -> p.group(ITEM_GROUP));
    public static final EssenceLeggingsItem INFERIUM_LEGGINGS = new EssenceLeggingsItem(ModArmorMaterial.INFERIUM, p -> p.group(ITEM_GROUP));
    public static final EssenceBootsItem INFERIUM_BOOTS = new EssenceBootsItem(ModArmorMaterial.INFERIUM, p -> p.group(ITEM_GROUP));
    public static final EssenceHelmetItem PRUDENTIUM_HELMET = new EssenceHelmetItem(ModArmorMaterial.PRUDENTIUM, p -> p.group(ITEM_GROUP));
    public static final EssenceChestplateItem PRUDENTIUM_CHESTPLATE = new EssenceChestplateItem(ModArmorMaterial.PRUDENTIUM, p -> p.group(ITEM_GROUP));
    public static final EssenceLeggingsItem PRUDENTIUM_LEGGINGS = new EssenceLeggingsItem(ModArmorMaterial.PRUDENTIUM, p -> p.group(ITEM_GROUP));
    public static final EssenceBootsItem PRUDENTIUM_BOOTS = new EssenceBootsItem(ModArmorMaterial.PRUDENTIUM, p -> p.group(ITEM_GROUP));
    public static final EssenceHelmetItem INTERMEDIUM_HELMET = new EssenceHelmetItem(ModArmorMaterial.INTERMEDIUM, p -> p.group(ITEM_GROUP));
    public static final EssenceChestplateItem INTERMEDIUM_CHESTPLATE = new EssenceChestplateItem(ModArmorMaterial.INTERMEDIUM, p -> p.group(ITEM_GROUP));
    public static final EssenceLeggingsItem INTERMEDIUM_LEGGINGS = new EssenceLeggingsItem(ModArmorMaterial.INTERMEDIUM, p -> p.group(ITEM_GROUP));
    public static final EssenceBootsItem INTERMEDIUM_BOOTS = new EssenceBootsItem(ModArmorMaterial.INTERMEDIUM, p -> p.group(ITEM_GROUP));
    public static final EssenceHelmetItem IMPERIUM_HELMET = new EssenceHelmetItem(ModArmorMaterial.IMPERIUM, p -> p.group(ITEM_GROUP));
    public static final EssenceChestplateItem IMPERIUM_CHESTPLATE = new EssenceChestplateItem(ModArmorMaterial.IMPERIUM, p -> p.group(ITEM_GROUP));
    public static final EssenceLeggingsItem IMPERIUM_LEGGINGS = new EssenceLeggingsItem(ModArmorMaterial.IMPERIUM, p -> p.group(ITEM_GROUP));
    public static final EssenceBootsItem IMPERIUM_BOOTS = new EssenceBootsItem(ModArmorMaterial.IMPERIUM, p -> p.group(ITEM_GROUP));
    public static final EssenceHelmetItem SUPREMIUM_HELMET = new EssenceHelmetItem(ModArmorMaterial.SUPREMIUM, p -> p.group(ITEM_GROUP));
    public static final EssenceChestplateItem SUPREMIUM_CHESTPLATE = new EssenceChestplateItem(ModArmorMaterial.SUPREMIUM, p -> p.group(ITEM_GROUP));
    public static final EssenceLeggingsItem SUPREMIUM_LEGGINGS = new EssenceLeggingsItem(ModArmorMaterial.SUPREMIUM, p -> p.group(ITEM_GROUP));
    public static final EssenceBootsItem SUPREMIUM_BOOTS = new EssenceBootsItem(ModArmorMaterial.SUPREMIUM, p -> p.group(ITEM_GROUP));

    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        ITEM_BLOCKS.forEach(registry::register);

        registry.register(PROSPERITY_SHARD.setRegistryName("prosperity_shard"));
        registry.register(INFERIUM_ESSENCE.setRegistryName("inferium_essence"));
        registry.register(PRUDENTIUM_ESSENCE.setRegistryName("prudentium_essence"));
        registry.register(INTERMEDIUM_ESSENCE.setRegistryName("intermedium_essence"));
        registry.register(IMPERIUM_ESSENCE.setRegistryName("imperium_essence"));
        registry.register(SUPREMIUM_ESSENCE.setRegistryName("supremium_essence"));
        registry.register(SOULIUM_DUST.setRegistryName("soulium_dust"));
        registry.register(PROSPERITY_INGOT.setRegistryName("prosperity_ingot"));
        registry.register(INFERIUM_INGOT.setRegistryName("inferium_ingot"));
        registry.register(INTERMEDIUM_INGOT.setRegistryName("intermedium_ingot"));
        registry.register(PRUDENTIUM_INGOT.setRegistryName("prudentium_ingot"));
        registry.register(IMPERIUM_INGOT.setRegistryName("imperium_ingot"));
        registry.register(SUPREMIUM_INGOT.setRegistryName("supremium_ingot"));
        registry.register(SOULIUM_INGOT.setRegistryName("soulium_ingot"));
        registry.register(PROSPERITY_NUGGET.setRegistryName("prosperity_nugget"));
        registry.register(INFERIUM_NUGGET.setRegistryName("inferium_nugget"));
        registry.register(PRUDENTIUM_NUGGET.setRegistryName("prudentium_nugget"));
        registry.register(INTERMEDIUM_NUGGET.setRegistryName("intermedium_nugget"));
        registry.register(IMPERIUM_NUGGET.setRegistryName("imperium_nugget"));
        registry.register(SUPREMIUM_NUGGET.setRegistryName("supremium_nugget"));
        registry.register(SOULIUM_NUGGET.setRegistryName("soulium_nugget"));
        registry.register(PROSPERITY_GEMSTONE.setRegistryName("prosperity_gemstone"));
        registry.register(INFERIUM_GEMSTONE.setRegistryName("inferium_gemstone"));
        registry.register(PRUDENTIUM_GEMSTONE.setRegistryName("prudentium_gemstone"));
        registry.register(INTERMEDIUM_GEMSTONE.setRegistryName("intermedium_gemstone"));
        registry.register(IMPERIUM_GEMSTONE.setRegistryName("imperium_gemstone"));
        registry.register(SUPREMIUM_GEMSTONE.setRegistryName("supremium_gemstone"));
        registry.register(SOULIUM_GEMSTONE.setRegistryName("soulium_gemstone"));
        registry.register(PROSPERITY_SEED_BASE.setRegistryName("prosperity_seed_base"));
        registry.register(SOULIUM_SEED_BASE.setRegistryName("soulium_seed_base"));
        registry.register(SOUL_DUST.setRegistryName("soul_dust"));
        registry.register(INFUSION_CRYSTAL.setRegistryName("infusion_crystal"));
        registry.register(MASTER_INFUSION_CRYSTAL.setRegistryName("master_infusion_crystal"));
        registry.register(FERTILIZED_ESSENCE.setRegistryName("fertilized_essence"));
        registry.register(MYSTICAL_FERTILIZER.setRegistryName("mystical_fertilizer"));

        CropRegistry.getInstance().onRegisterItems(registry);

        registry.register(INFERIUM_SWORD.setRegistryName("inferium_sword"));
        registry.register(INFERIUM_PICKAXE.setRegistryName("inferium_pickaxe"));
        registry.register(INFERIUM_SHOVEL.setRegistryName("inferium_shovel"));
        registry.register(INFERIUM_AXE.setRegistryName("inferium_axe"));
        registry.register(INFERIUM_HOE.setRegistryName("inferium_hoe"));
        registry.register(PRUDENTIUM_SWORD.setRegistryName("prudentium_sword"));
        registry.register(PRUDENTIUM_PICKAXE.setRegistryName("prudentium_pickaxe"));
        registry.register(PRUDENTIUM_SHOVEL.setRegistryName("prudentium_shovel"));
        registry.register(PRUDENTIUM_AXE.setRegistryName("prudentium_axe"));
        registry.register(PRUDENTIUM_HOE.setRegistryName("prudentium_hoe"));
        registry.register(INTERMEDIUM_SWORD.setRegistryName("intermedium_sword"));
        registry.register(INTERMEDIUM_PICKAXE.setRegistryName("intermedium_pickaxe"));
        registry.register(INTERMEDIUM_SHOVEL.setRegistryName("intermedium_shovel"));
        registry.register(INTERMEDIUM_AXE.setRegistryName("intermedium_axe"));
        registry.register(INTERMEDIUM_HOE.setRegistryName("intermedium_hoe"));
        registry.register(IMPERIUM_SWORD.setRegistryName("imperium_sword"));
        registry.register(IMPERIUM_PICKAXE.setRegistryName("imperium_pickaxe"));
        registry.register(IMPERIUM_SHOVEL.setRegistryName("imperium_shovel"));
        registry.register(IMPERIUM_AXE.setRegistryName("imperium_axe"));
        registry.register(IMPERIUM_HOE.setRegistryName("imperium_hoe"));
        registry.register(SUPREMIUM_SWORD.setRegistryName("supremium_sword"));
        registry.register(SUPREMIUM_PICKAXE.setRegistryName("supremium_pickaxe"));
        registry.register(SUPREMIUM_SHOVEL.setRegistryName("supremium_shovel"));
        registry.register(SUPREMIUM_AXE.setRegistryName("supremium_axe"));
        registry.register(SUPREMIUM_HOE.setRegistryName("supremium_hoe"));
        registry.register(INFERIUM_HELMET.setRegistryName("inferium_helmet"));
        registry.register(INFERIUM_CHESTPLATE.setRegistryName("inferium_chestplate"));
        registry.register(INFERIUM_LEGGINGS.setRegistryName("inferium_leggings"));
        registry.register(INFERIUM_BOOTS.setRegistryName("inferium_boots"));
        registry.register(PRUDENTIUM_HELMET.setRegistryName("prudentium_helmet"));
        registry.register(PRUDENTIUM_CHESTPLATE.setRegistryName("prudentium_chestplate"));
        registry.register(PRUDENTIUM_LEGGINGS.setRegistryName("prudentium_leggings"));
        registry.register(PRUDENTIUM_BOOTS.setRegistryName("prudentium_boots"));
        registry.register(INTERMEDIUM_HELMET.setRegistryName("intermedium_helmet"));
        registry.register(INTERMEDIUM_CHESTPLATE.setRegistryName("intermedium_chestplate"));
        registry.register(INTERMEDIUM_LEGGINGS.setRegistryName("intermedium_leggings"));
        registry.register(INTERMEDIUM_BOOTS.setRegistryName("intermedium_boots"));
        registry.register(IMPERIUM_HELMET.setRegistryName("imperium_helmet"));
        registry.register(IMPERIUM_CHESTPLATE.setRegistryName("imperium_chestplate"));
        registry.register(IMPERIUM_LEGGINGS.setRegistryName("imperium_leggings"));
        registry.register(IMPERIUM_BOOTS.setRegistryName("imperium_boots"));
        registry.register(SUPREMIUM_HELMET.setRegistryName("supremium_helmet"));
        registry.register(SUPREMIUM_CHESTPLATE.setRegistryName("supremium_chestplate"));
        registry.register(SUPREMIUM_LEGGINGS.setRegistryName("supremium_leggings"));
        registry.register(SUPREMIUM_BOOTS.setRegistryName("supremium_boots"));
    }
}
