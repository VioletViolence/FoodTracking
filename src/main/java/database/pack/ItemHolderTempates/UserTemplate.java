package database.pack.ItemHolderTempates;

public class UserTemplate {
    public String name;
    public int usedId;
    public int normId;
    public String userType;

    public String getName() {
        return name;
    }

    public int getNormId() {
        return normId;
    }

    public void setNormId(int normId) {
        this.normId = normId;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getUsedId() {
        return usedId;
    }

    public void setUsedId(int usedId) {
        this.usedId = usedId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
