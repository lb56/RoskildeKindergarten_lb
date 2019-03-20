public class Child {

    private String childName;
    private String dateOfBirth;
    private int age;
    private String parent1Name;
    private String parent2Name;
    private String address;
    private String primaryPhone;
    private String secondaryPhone;

    public Child(String childName, String dateOfBirth, int age, String parent1Name, String parent2Name, String address, String primaryPhone, String secondaryPhone) {
        this.childName = childName;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.parent1Name = parent1Name;
        this.parent2Name = parent2Name;
        this.address = address;
        this.primaryPhone = primaryPhone;
        this.secondaryPhone = secondaryPhone;
    }

    public String toString() {
        String minString = ("Navn: " + childName + "\t Fødselsdag: " + dateOfBirth + "\t Alder: " + age + "\t Første forælders navn: " + parent1Name + "\t Anden forælders navn: " + parent2Name + "\t Adresse: " + address + "\t Hjemme nr.:" + primaryPhone + "\t Arbejds nr.: " + secondaryPhone);
        return minString;
    }

}


