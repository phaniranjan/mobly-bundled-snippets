package com.google.android.mobly.snippet.event;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

public class SnippetEvent {
    private final String mCallbackId;
    private final String mEventName;
    private final Bundle mData = new Bundle();

    public SnippetEvent(String callbackId, String eventName) {
        mCallbackId = callbackId;
        mEventName = eventName;
    }

    public String getCallbackId() {
        return mCallbackId;
    }

    public String getEventName() {
        return mEventName;
    }

    public Bundle getData() {
        return mData;
    }

    public JSONObject toJson() throws JSONException {
        JSONObject result = new JSONObject();
        result.put("callbackId", mCallbackId);
        result.put("name", mEventName);
        return result;
    }
}
