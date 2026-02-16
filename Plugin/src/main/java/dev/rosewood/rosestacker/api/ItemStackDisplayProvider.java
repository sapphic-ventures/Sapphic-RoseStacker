package dev.rosewood.rosestacker.api;

import dev.rosewood.rosestacker.stack.StackedItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An interface for formatting the display name of stacked items.
 * Implementations can be registered via {@link RoseStackerAPI#setItemStackNameProvider(ItemStackDisplayProvider)}
 * to customize how item stack names are displayed per item.
 */
public interface ItemStackDisplayProvider {

    /**
     * Formats the display name for a stacked item.
     * <p>
     * This method is called whenever the display name of a stacked item needs to be updated.
     * Return null to use the default formatting behavior.
     *
     * @param item The StackedItem being formatted
     * @param displayName The base display name of the item (already processed for custom names, colors, etc.)
     * @param despawnTimer The despawn timer string (e.g., "5:00" or "∞"), or null if timer is disabled
     * @return The formatted display string, or null to use default formatting
     */
    @Nullable
    String formatName(@NotNull StackedItem item, @NotNull String displayName, @Nullable String despawnTimer);

}

