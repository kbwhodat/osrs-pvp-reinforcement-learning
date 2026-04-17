package com.github.naton1.rl.env.nh;

import static com.elvarg.util.ItemIdentifiers.AMULET_OF_POWER;
import static com.elvarg.util.ItemIdentifiers.ELDER_CHAOS_HOOD;
import static com.elvarg.util.ItemIdentifiers.ELDER_CHAOS_ROBE;
import static com.elvarg.util.ItemIdentifiers.ELDER_CHAOS_TOP;
import static com.elvarg.util.ItemIdentifiers.MYSTIC_FIRE_STAFF;
import static com.elvarg.util.ItemIdentifiers.SHARK;
import static com.elvarg.util.ItemIdentifiers.RUNE_KNIFE;
import static com.elvarg.util.ItemIdentifiers.STAFF_OF_FIRE;
import static com.elvarg.util.ItemIdentifiers.WIZARD_BOOTS;

import com.elvarg.game.content.PrayerHandler;
import com.elvarg.game.model.MagicSpellbook;
import com.github.naton1.rl.env.Loadout;

public class NhMagePureLoadout extends DynamicNhLoadout {

    @Override
    public int[] getRangedGear() {
        // Mage pures don't range, but NhEnvironment requires a valid ranged weapon.
        // Use rune knife as placeholder — 1 Range makes it ineffective.
        return new int[] {
            RUNE_KNIFE,
            AMULET_OF_POWER,
        };
    }

    @Override
    public int[] getMageGear() {
        return new int[] {
            MYSTIC_FIRE_STAFF,
            AMULET_OF_POWER,
            ELDER_CHAOS_TOP,
            ELDER_CHAOS_ROBE,
            ELDER_CHAOS_HOOD,
            WIZARD_BOOTS,
        };
    }

    @Override
    public int[] getMeleeGear() {
        return new int[] {
            STAFF_OF_FIRE,
            AMULET_OF_POWER,
        };
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
                .hitpointsLevel(50)
                .magicLevel(65)
                .rangedLevel(1)
                .prayerLevel(1)
                .build();
    }

    @Override
    public MagicSpellbook getMagicSpellbook() {
        return MagicSpellbook.NORMAL;
    }

    @Override
    protected int[] getDefaultInventoryItems() {
        return new int[] {};
    }

    @Override
    protected int getFillItem() {
        return SHARK;
    }

    @Override
    protected void applyRandomization(final RandomizerContext randomizerContext) {
        // Minimal randomization for simple mage pure
    }
}
