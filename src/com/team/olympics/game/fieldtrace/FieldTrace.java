package com.team.olympics.game.fieldtrace;

import com.team.olympics.game.Game;
import com.team.olympics.game.gender.Gender;

public abstract class FieldTrace extends Game {
    public FieldTrace(Gender gender) {
        super(gender);
    }

    public abstract void show();
}
