package database.pack.ItemHolderTempates;

import java.sql.Date;

public class ConsumedFoodTemplate {
    private int attachedUserId;
    private int portion;
    private Date consumedDate;
    private int itemId;
    private int foodItemId;

    public int getAttachedUserId() {
        return attachedUserId;
    }

    public void setAttachedUserId(int attachedUserId) {
        this.attachedUserId = attachedUserId;
    }

    public int getPortion() {
        return portion;
    }

    public void setPortion(int portion) {
        this.portion = portion;
    }

    public Date getConsumedDate() {
        return consumedDate;
    }

    public void setConsumedDate(Date consumedDate) {
        this.consumedDate = consumedDate;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getFoodItemId() {
        return foodItemId;
    }

    public void setFoodItemId(int foodItemId) {
        this.foodItemId = foodItemId;
    }
}
