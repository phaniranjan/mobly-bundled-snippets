package com.google.android.mobly.snippet.event;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;

public class EventCache {
    private static final EventCache sInstance = new EventCache();
    private final ConcurrentHashMap<String, LinkedBlockingDeque<SnippetEvent>> mCache =
            new ConcurrentHashMap<>();

    private EventCache() {}

    public static EventCache getInstance() {
        return sInstance;
    }

    public static String getQueueId(String callbackId, String eventName) {
        return callbackId + ":" + eventName;
    }

    public LinkedBlockingDeque<SnippetEvent> getEventDeque(String qId) {
        return mCache.computeIfAbsent(qId, k -> new LinkedBlockingDeque<>());
    }

    public void postEvent(SnippetEvent event) {
        String qId = getQueueId(event.getCallbackId(), event.getEventName());
        getEventDeque(qId).addLast(event);
    }
}
