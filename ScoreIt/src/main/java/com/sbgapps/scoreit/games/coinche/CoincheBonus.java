/*
 * Copyright (c) 2014 SBG Apps
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sbgapps.scoreit.games.coinche;

import android.content.Context;

import com.google.gson.annotations.SerializedName;
import com.sbgapps.scoreit.R;
import com.sbgapps.scoreit.games.Player;

import java.io.Serializable;

/**
 * Created by Stéphane on 21/08/2014.
 */
public class CoincheBonus implements Serializable {

    public static final int BONUS_BELOTE = 0;
    public static final int BONUS_COINCHE = 1;
    public static final int BONUS_SURCOINCHE = 2;

    @SerializedName("bonus")
    private int mBonus;
    @SerializedName("player")
    private int mPlayer;

    public CoincheBonus() {
        this(BONUS_BELOTE);
    }

    public CoincheBonus(int bonus) {
        this(bonus, Player.PLAYER_1);
    }

    public CoincheBonus(int bonus, int player) {
        mBonus = bonus;
        mPlayer = player;
    }

    public static String getLitteralBonus(Context context, int bonus) {
        switch (bonus) {
            case BONUS_BELOTE:
                return context.getString(R.string.belote);
            case BONUS_COINCHE:
                return context.getString(R.string.coinche);
            case BONUS_SURCOINCHE:
                return context.getString(R.string.surcoinche);
        }
        return null;
    }

    public int get() {
        return mBonus;
    }

    public void set(int bonus) {
        mBonus = bonus;
    }

    public int getPlayer() {
        return mPlayer;
    }

    public void setPlayer(int player) {
        mPlayer = player;
    }
}