public class Permission {

    private int Permission_Id;
    private String Permission_Role;
    private String Permission_Title;
    private String Permission_Module;

    public Permission(int permission_Id, String permission_Role, String permission_Title, String permission_Module) {
        Permission_Id = permission_Id;
        Permission_Role = permission_Role;
        Permission_Title = permission_Title;
        Permission_Module = permission_Module;
    }

    public int getPermission_Id() {
        return Permission_Id;
    }

    public void setPermission_Id(int permission_Id) {
        Permission_Id = permission_Id;
    }

    public String getPermission_Role() {
        return Permission_Role;
    }

    public void setPermission_Role(String permission_Role) {
        Permission_Role = permission_Role;
    }

    public String getPermission_Title() {
        return Permission_Title;
    }

    public void setPermission_Title(String permission_Title) {
        Permission_Title = permission_Title;
    }

    public String getPermission_Module() {
        return Permission_Module;
    }

    public void setPermission_Module(String permission_Module) {
        Permission_Module = permission_Module;
    }
}
