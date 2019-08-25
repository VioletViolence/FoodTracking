package database.pack;

public class UserTypeTemplate {
    public String typeName;
    public boolean editAccess;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public boolean isEditAccess() {
        return editAccess;
    }

    public void setEditAccess(boolean editAccess) {
        this.editAccess = editAccess;
    }
}
