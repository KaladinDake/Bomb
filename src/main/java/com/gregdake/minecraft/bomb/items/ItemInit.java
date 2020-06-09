package com.gregdake.minecraft.bomb.items;

import com.gregdake.minecraft.bomb.BombMod;
import com.gregdake.minecraft.bomb.items.common.BombItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(modid = BombMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(BombMod.MOD_ID)
public class ItemInit {
    public static final Item bomb_item = null;

    private static final Logger LOGGER = LogManager.getLogger();

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        LOGGER.info("Loading our bomb!");
        Item.Properties bombProps = new Item.Properties()
                .maxStackSize(30)
                .group(ItemGroup.COMBAT);

        BombItem bombItem = new BombItem(bombProps);
        event.getRegistry().register(bombItem.setRegistryName("bomb_item"));
    }
}
