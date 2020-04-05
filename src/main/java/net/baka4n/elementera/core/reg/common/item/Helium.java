package net.baka4n.elementera.core.reg.common.item;

import net.baka4n.elementera.core.reg.common.item.reg.RegGroup;
import net.minecraft.item.Item;

public class Helium extends Item {
    public Helium() {
        super(new Settings()
                .group(RegGroup.Gas)
                .maxCount(16));
    }
}
