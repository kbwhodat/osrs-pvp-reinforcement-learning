package com.github.naton1.rl.env.nh;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class NhEnvironmentParams {

    private AccountBuild accountBuild = AccountBuild.PURE;

    private boolean onlySwitchPrayerWhenAboutToAttack = true;
    private boolean onlySwitchGearWhenAttackSoon = true;

    private boolean allowSmite = true;
    private boolean allowRedemption = true;
    private boolean allowMovingIfCanAttack = false;

    private boolean randomizeGear = false;
    private boolean randomizeBuild = false;

    private boolean randomizeFightType = false;
    private FightType fightType;

    private String episodeId = "";
    private String agent = "";
    private String target = "";

    private List<AccountBuild> randomBuildOptions = new ArrayList<>(List.of(AccountBuild.PURE, AccountBuild.ZERKER, AccountBuild.MED));

    public enum AccountBuild {
        PURE,
        ZERKER,
        MED,
        MAXED,
        LMS_PURE,
        LMS_ZERKER,
        LMS_MED,
        OBBY_MAUL_PURE,
        GMAUL_PURE,
        RANGE_PURE,
        STRENGTH_PURE,
        MAGE_PURE,
        RANGE_2H_HYBRID,
        DDS_PURE,
        OBBY_MAULER_MIRROR;
    }

    public enum FightType {
        NORMAL,
        LMS,
        PVP_ARENA,
    }
}
