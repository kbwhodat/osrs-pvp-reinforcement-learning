package com.github.naton1.rl.env.nh;

import static com.elvarg.util.ItemIdentifiers.AMULET_OF_GLORY;
import static com.elvarg.util.ItemIdentifiers.BLACK_DHIDE_CHAPS;
import static com.elvarg.util.ItemIdentifiers.COOKED_KARAMBWAN;
import static com.elvarg.util.ItemIdentifiers.DRAGON_DAGGER_P_PLUS_PLUS_;
import static com.elvarg.util.ItemIdentifiers.DRAGON_SCIMITAR;
import static com.elvarg.util.ItemIdentifiers.GREEN_DHIDE_BODY;
import static com.elvarg.util.ItemIdentifiers.IRON_PLATELEGS;
import static com.elvarg.util.ItemIdentifiers.MAGIC_SHORTBOW;
import static com.elvarg.util.ItemIdentifiers.MITHRIL_GLOVES;
import static com.elvarg.util.ItemIdentifiers.MONKS_ROBE_TOP;
import static com.elvarg.util.ItemIdentifiers.RANGING_POTION_4_;
import static com.elvarg.util.ItemIdentifiers.RUNE_ARROW;
import static com.elvarg.util.ItemIdentifiers.SHARK;
import static com.elvarg.util.ItemIdentifiers.SUPER_COMBAT_POTION_4_;

import com.elvarg.game.content.PrayerHandler;
import com.elvarg.game.model.MagicSpellbook;
import com.github.naton1.rl.env.Loadout;

public class NhDdsPureLoadout extends DynamicNhLoadout {

    @Override
    public int[] getRangedGear() {
        return new int[] {
            MAGIC_SHORTBOW,
            AMULET_OF_GLORY,
            GREEN_DHIDE_BODY,
            BLACK_DHIDE_CHAPS,
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
            DRAGON_SCIMITAR,
            AMULET_OF_GLORY,
            IRON_PLATELEGS,
            MONKS_ROBE_TOP,
            MITHRIL_GLOVES,
        };
    }

    @Override
    public int[] getMeleeSpecGear() {
        return new int[] {
            DRAGON_DAGGER_P_PLUS_PLUS_,
            AMULET_OF_GLORY,
            IRON_PLATELEGS,
            MONKS_ROBE_TOP,
            MITHRIL_GLOVES,
        };
    }

    @Override
    public PrayerHandler.PrayerData[] getRangedPrayers() {
        return new PrayerHandler.PrayerData[] {
            PrayerHandler.PrayerData.EAGLE_EYE,
        };
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
                .attackLevel(60)
                .strengthLevel(65)
                .defenceLevel(1)
                .hitpointsLevel(65)
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
            SUPER_COMBAT_POTION_4_,
            RANGING_POTION_4_,
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
        // Minimal randomization for DDS pure
    }
}
