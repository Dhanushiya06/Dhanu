public class Details {
    private int id;
    private String name;
    private String role;
    private Long phone;
    private String email;

    public Details() {
    }

    public Details(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void showdisplay(){
        System.out.println("Name: "+ name);
        System.out.println(" Id: "+ id);
        System.out.println("Role: "+ role);
        System.out.println("Phone: "+ phone);
        System.out.println("Email: "+ email);

    }
}
