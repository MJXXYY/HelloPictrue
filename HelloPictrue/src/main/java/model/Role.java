package model;

public class Role {
    private Integer id;

    private String roleName;

    private String roelPermission;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoelPermission() {
        return roelPermission;
    }

    public void setRoelPermission(String roelPermission) {
        this.roelPermission = roelPermission == null ? null : roelPermission.trim();
    }
}