package com.philliphsu.clock2.model;

import android.content.Context;

import com.philliphsu.clock2.Alarm;

/**
 * Created by Phillip Hsu on 6/28/2016.
 */
public class AlarmsListCursorLoader extends SQLiteCursorLoader<Alarm, AlarmCursor> {
    public static final String ACTION_CHANGE_CONTENT
            = "com.philliphsu.clock2.model.AlarmsListCursorLoader.action.CHANGE_CONTENT";

    public AlarmsListCursorLoader(Context context) {
        super(context);
    }

    @Override
    protected AlarmCursor loadCursor() {
        return new AlarmsTableManager(getContext()).queryItems();
    }

    @Override
    protected String getOnContentChangeAction() {
        return ACTION_CHANGE_CONTENT;
    }
}
