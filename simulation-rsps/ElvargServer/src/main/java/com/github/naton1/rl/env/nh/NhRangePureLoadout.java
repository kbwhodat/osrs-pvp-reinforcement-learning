package com.github.naton1.rl.env.nh;

import static com.elvarg.util.ItemIdentifiers.GREEN_DHIDE_BODY;
import static com.elvarg.util.ItemIdentifiers.GREEN_DHIDE_CHAPS;
import static com.elvarg.util.ItemIdentifiers.GREEN_DHIDE_VAMB;
import static com.elvarg.util.ItemIdentifiers.MAGIC_SHORTBOW;
import static com.elvarg.util.ItemIdentifiers.RANGING_POTION_4_;
import static com.elvarg.util.ItemIdentifiers.RUNE_ARROW;
import static com.elvarg.util.ItemIdentifiers.SHARK;

import com.elvarg.game.content.PrayerHandler;
import com.elvarg.game.model.MagicSpellbook;
import com.github.naton1.rl.env.Loadout;

public class NhRangePureLoadout extends DynamicNhLoadout {

    @Override
    public int[] getRangedGear() {
        return new int[] {
            MAGIC_SHORTBOW,
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
        // No melee weapon — return range gear as fallback
        return getRangedGear();
    }

    @Override
    public int[] getMeleeSpecGear() {
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
        return new PrayerHandler.PrayerData[] {};
    }

    @Override
    public Loadout.CombatStats getCombatStats() {
        return Loadout.CombatStats.builder()
                .attackLevel(1)
                .strengthLevel(1)
                .defenceLevel(1)
                .hitpointsLevel(55)
                .magicLevel(1)
                .rangedLevel(75)
                .prayerLevel(1)
                .build();
    }

    @Override
    public MagicSpellbook getMagicSpellbook() {
        return MagicSpellbook.NORMAL;
    }

    @Override
    protected int[] getDefaultInventoryItems() {
        return new int[] {
            RANGING_POTION_4_,
        };
    }

    @Override
    protected int getFillItem() {
        return SHARK;
    }

    @Override
    protected void applyRandomization(final RandomizerContext randomizerContext) {
        // Minimal randomization for simple range pure
    }
}
