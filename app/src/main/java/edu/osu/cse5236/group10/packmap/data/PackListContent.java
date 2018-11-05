package edu.osu.cse5236.group10.packmap.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class PackListContent {

    private static final String TAG = "PackListContent";

    /**
     * An array of sample (dummy) items.
     */
    public static final List<PackItem> ITEMS = new ArrayList<PackItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, PackItem> ITEM_MAP = new HashMap<String, PackItem>();

    public static void addItem(PackItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    public static PackItem createPackItem(int position, String group) {
        return new PackItem(String.valueOf(position), group);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class PackItem {
        public final String id;
        public final String content;

        public PackItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
