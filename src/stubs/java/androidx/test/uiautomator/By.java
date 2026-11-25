package androidx.test.uiautomator;

import java.util.regex.Pattern;

public class By {
    private By() {}

    public static BySelector text(Pattern textPattern) {
        return new BySelector();
    }

    public static BySelector desc(Pattern contentDescriptionPattern) {
        return new BySelector();
    }
}
