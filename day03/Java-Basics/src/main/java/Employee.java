public class Employee {

    public static void main(String[] args) {
        Details details = new Details();
        Details detailsOne = new Details();

        details.setId(10);
        details.setName("Arun");
        details.setRole("Trainee");
        details.setPhone(123456789);
        details.setEmail("arun@gmail.com");
        details.showdisplay();

        detailsOne.setId(20);
        detailsOne.setName("Babu");
        detailsOne.setRole("Engineer");
        detailsOne.setPhone(345678901);
        detailsOne.setEmail("babu@gmail.com");
        detailsOne.showdisplay();

        Details detailsTwo=new Details(30,"Charu","Developer");
        detailsTwo.setPhone(12345L);
        detailsTwo.setEmail("charu@gmail.com");
        detailsTwo.showdisplay();


    }
}
