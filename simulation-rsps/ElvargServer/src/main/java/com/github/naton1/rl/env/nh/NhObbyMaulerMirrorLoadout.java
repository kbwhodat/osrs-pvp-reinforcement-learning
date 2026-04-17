package com.github.naton1.rl.env.nh;

import static com.elvarg.util.ItemIdentifiers.AMULET_OF_STRENGTH;
import static com.elvarg.util.ItemIdentifiers.BERSERKER_NECKLACE;
import static com.elvarg.util.ItemIdentifiers.CLIMBING_BOOTS;
import static com.elvarg.util.ItemIdentifiers.COOKED_KARAMBWAN;
import static com.elvarg.util.ItemIdentifiers.FIRE_CAPE;
import static com.elvarg.util.ItemIdentifiers.IRON_PLATELEGS;
import static com.elvarg.util.ItemIdentifiers.LEATHER_BODY;
import static com.elvarg.util.ItemIdentifiers.LEATHER_CHAPS;
import static com.elvarg.util.ItemIdentifiers.LEATHER_VAMBRACES;
import static com.elvarg.util.ItemIdentifiers.MITHRIL_GLOVES;
import static com.elvarg.util.ItemIdentifiers.MONKS_ROBE_TOP;
import static com.elvarg.util.ItemIdentifiers.RUNE_KNIFE;
import static com.elvarg.util.ItemIdentifiers.SHARK;
import static com.elvarg.util.ItemIdentifiers.SUPER_STRENGTH_4_;
import static com.elvarg.util.ItemIdentifiers.TZHAAR_KET_OM;

import com.elvarg.game.content.PrayerHandler;
import com.elvarg.game.model.MagicSpellbook;
import com.elvarg.game.model.container.impl.Equipment;
import com.github.naton1.rl.env.Loadout;

public class NhObbyMaulerMirrorLoadout extends DynamicNhLoadout {

    @Override
    public int[] getRangedGear() {
        return new int[] {
            RUNE_KNIFE,
            AMULET_OF_STRENGTH,
            LEATHER_CHAPS,
            LEATHER_BODY,
            LEATHER_VAMBRACES,
            FIRE_CAPE,
            CLIMBING_BOOTS,
        };
    }

    @Override
    public int[] getMageGear() {
        return new int[] {};
    }

    @Override
    public int[] getMeleeGear() {
        return new int[] {
            TZHAAR_KET_OM,
            BERSERKER_NECKLACE,
            IRON_PLATELEGS,
            MONKS_ROBE_TOP,
            MITHRIL_GLOVES,
            FIRE_CAPE,
            CLIMBING_BOOTS,
        };
    }

    @Override
    public int[] getMeleeSpecGear() {
        // No spec weapon at 1 Attack.
        return getMeleeGear();
    }

    @Override
    public PrayerHandler.PrayerData[] getRangedPrayers() {
        return new PrayerHandler.PrayerData[] {};
    }

    @Override
    public PrayerHandler.PrayerData[] getMagePrayers() {
        return new PrayerHandler.PrayerData[] {};
    }

    @Override
    public PrayerHandler.PrayerData[] getMeleePrayers() {
        return new PrayerHandler.PrayerData[] {
            PrayerHandler.PrayerData.ULTIMATE_STRENGTH,
        };
    }

    @Override
    public Loadout.CombatStats getCombatStats() {
        return Loadout.CombatStats.builder()
                .attackLevel(1)
                .strengthLevel(99)
                .defenceLevel(1)
                .hitpointsLevel(80)
                .magicLevel(1)
                .rangedLevel(60)
                .prayerLevel(31)
                .build();
    }

    @Override
    public MagicSpellbook getMagicSpellbook() {
        return MagicSpellbook.NORMAL;
    }

    @Override
    protected int[] getDefaultInventoryItems() {
        return new int[] {
            SUPER_STRENGTH_4_,
            SUPER_STRENGTH_4_,
            COOKED_KARAMBWAN,
            COOKED_KARAMBWAN,
            COOKED_KARAMBWAN,
            COOKED_KARAMBWAN,
        };
    }

    @Override
    protected int getFillItem() {
        return SHARK;
    }

    @Override
    protected void applyRandomization(final RandomizerContext randomizerContext) {
        // 20% chance to use amulet of strength on melee instead of berserker necklace
        if (randomizerContext.getRandom().nextInt(5) == 0) {
            randomizerContext.setMelee(Equipment.AMULET_SLOT, AMULET_OF_STRENGTH);
        }
    }
}
