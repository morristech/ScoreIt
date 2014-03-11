/*
 * Copyright 2013 SBG Apps
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package com.sbgapps.scoreit.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.sbgapps.scoreit.R;

/**
 * Created by sbaiget on 21/01/14.
 */
public class PlayerScore extends FrameLayout {

    private final TextView mScore;
    private final ImageView mImage;
    private int mPlayer;

    public PlayerScore(Context context) {
        this(context, null);
    }

    public PlayerScore(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PlayerScore(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.player_score, this, true);

        mScore = (TextView) findViewById(R.id.score);
        mImage = (ImageView) findViewById(R.id.image);
    }

    public int getPlayer() {
        return mPlayer;
    }

    public void setPlayer(int player) {
        mPlayer = player;
    }

    public TextView getScore() {
        return mScore;
    }

    public ImageView getImage() {
        return mImage;
    }
}
