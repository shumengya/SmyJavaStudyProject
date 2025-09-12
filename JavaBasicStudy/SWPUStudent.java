package JavaBasicStudy;

public class SWPUStudent {
    private String name; //学生姓名
    private int age; //学生年龄
    private String studentID; //学号
    private String major; //专业
    private double gpa; //绩点
    private String email; //电子邮件
    private String phoneNumber; //电话号码
    private String address; //住址
    private String gender; //性别

    public SWPUStudent(String name, int age, String studentID, String major, double gpa, String email, String phoneNumber, String address, String gender) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
        this.major = major;
        this.gpa = gpa;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
    }


    public void ShowInfo() {
        System.out.println("==================================");
        System.out.println("西南石油大学学生信息：");
        System.out.println("姓名: " + name);
        System.out.println("年龄: " + age);
        System.out.println("学号: " + studentID);
        System.out.println("专业: " + major);
        System.out.println("绩点: " + gpa);
        System.out.println("电子邮件: " + email);
        System.out.println("电话号码: " + phoneNumber);
        System.out.println("住址: " + address);
        System.out.println("性别: " + gender);
        System.out.println("==================================");
    }


//======================对学生属性进行封装==================================

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }



    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }



    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
//======================对学生属性进行封装==================================


}
