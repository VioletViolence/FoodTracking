package database.pack.ItemHolderTempates;

public class UserTypeTemplate {
    private int typeId;
    private String typeName;
    private boolean normAttached;
    private boolean statPanelAccess;
    private boolean editRights;


    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public boolean isNormAttached() {
        return normAttached;
    }

    public void setNormAttached(boolean normAttached) {
        this.normAttached = normAttached;
    }

    public boolean isStatPanelAccess() {
        return statPanelAccess;
    }

    public void setStatPanelAccess(boolean statPanelAccess) {
        this.statPanelAccess = statPanelAccess;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public boolean isEditRights() {
        return editRights;
    }

    public void setEditRights(boolean editRights) {
        this.editRights = editRights;
    }
}
