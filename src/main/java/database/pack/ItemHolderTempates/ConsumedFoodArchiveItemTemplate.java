package database.pack.ItemHolderTempates;

import java.sql.Date;

public class ConsumedFoodArchiveItemTemplate {
    private int archiveItemId;
    private int userId;
    private int totalCalories;
    private int totalCarbs;
    private int totalFats;
    private int totalProtein;
    private boolean normHeld;
    private Date archivedItemDate;

    public int getArchiveItemId() {
        return archiveItemId;
    }

    public void setArchiveItemId(int archiveItemId) {
        this.archiveItemId = archiveItemId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(int totalCalories) {
        this.totalCalories = totalCalories;
    }

    public int getTotalCarbs() {
        return totalCarbs;
    }

    public void setTotalCarbs(int totalCarbs) {
        this.totalCarbs = totalCarbs;
    }

    public int getTotalFats() {
        return totalFats;
    }

    public void setTotalFats(int totalFats) {
        this.totalFats = totalFats;
    }

    public int getTotalProtein() {
        return totalProtein;
    }

    public void setTotalProtein(int totalProtein) {
        this.totalProtein = totalProtein;
    }

    public boolean isNormHeld() {
        return normHeld;
    }

    public void setNormHeld(boolean normHeld) {
        this.normHeld = normHeld;
    }

    public Date getArchivedItemDate() {
        return archivedItemDate;
    }

    public void setArchivedItemDate(Date archivedItemDate) {
        this.archivedItemDate = archivedItemDate;
    }
}
