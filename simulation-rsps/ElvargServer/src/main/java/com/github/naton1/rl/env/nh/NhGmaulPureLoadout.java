package com.github.naton1.rl.env.nh;

import static com.elvarg.util.ItemIdentifiers.AMULET_OF_STRENGTH;
import static com.elvarg.util.ItemIdentifiers.COOKED_KARAMBWAN;
import static com.elvarg.util.ItemIdentifiers.GRANITE_MAUL;
import static com.elvarg.util.ItemIdentifiers.GREEN_DHIDE_BODY;
import static com.elvarg.util.ItemIdentifiers.GREEN_DHIDE_CHAPS;
import static com.elvarg.util.ItemIdentifiers.GREEN_DHIDE_VAMB;
import static com.elvarg.util.ItemIdentifiers.IRON_PLATELEGS;
import static com.elvarg.util.ItemIdentifiers.MAGIC_SHORTBOW;
import static com.elvarg.util.ItemIdentifiers.RUNE_ARROW;
import static com.elvarg.util.ItemIdentifiers.RUNE_SCIMITAR;
import static com.elvarg.util.ItemIdentifiers.SHARK;
import static com.elvarg.util.ItemIdentifiers.SUPER_STRENGTH_4_;

import com.elvarg.game.content.PrayerHandler;
import com.elvarg.game.model.MagicSpellbook;
import com.github.naton1.rl.env.Loadout;

public class NhGmaulPureLoadout extends DynamicNhLoadout {

    @Override
    public int[] getRangedGear() {
        return new int[] {
            MAGIC_SHORTBOW,
            AMULET_OF_STRENGTH,
            GREEN_DHIDE_BODY,
            GREEN_DHIDE_CHAPS,
            GREEN_DHIDE_VAMB,
            RUNE_ARROW,
        };
    }

    @Override
    public int[] getMageGear() {
        return new int[] {};
    }

    @Override
    public int[] getMeleeGear() {
        return new int[] {
            RUNE_SCIMITAR,
            AMULET_OF_STRENGTH,
            IRON_PLATELEGS,
        };
    }

    @Override
    public int[] getMeleeSpecGear() {
        return new int[] {
            GRANITE_MAUL,
            AMULET_OF_STRENGTH,
            IRON_PLATELEGS,
        };
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
            PrayerHandler.PrayerData.SUPERHUMAN_STRENGTH,
        };
    }

    @Override
    public Loadout.CombatStats getCombatStats() {
        return Loadout.CombatStats.builder()
                .attackLevel(50)
                .strengthLevel(65)
                .defenceLevel(1)
                .hitpointsLevel(65)
                .magicLevel(1)
                .rangedLevel(60)
                .prayerLevel(13)
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
        // Minimal randomization for simple gmauler setup
    }
}
