package net.baka4n.elementera.itemsettings;

import net.baka4n.elementera.itemgroup.Group;
import net.minecraft.item.Item;

public class Carbon extends Item {
    public Carbon() {
        super(new Item.Settings()
                .group(Group.Materials)
                .maxCount(16));
    }
}
