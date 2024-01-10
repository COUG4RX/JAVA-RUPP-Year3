class IDCardParser {
    public static void main(String[] args) {
        String idCardString = "IDKHM1603633111<<<<<<<<<<<<<<<,9501016M2406215KHM<<<<<<<<<<<6,MEN<<CHENDA<<<<<<<<<<<<<<<<<<<";

        String idNumber = idCardString.substring(5, 14);
        String dob = idCardString.substring(31, 37);
        String gender = idCardString.substring(38, 39);
        String lastNameEn = idCardString.substring(67, 73);
        String firstNameEn = idCardString.substring(62, 65);
        String expiredDate = idCardString.substring(39, 45);

        System.out.println("ID Number: " + idNumber);
        System.out.println("Date of Birth: " + dob.substring(4,6) + "/" + dob.substring(2,4) + "/" + dob.substring(0,2));
        System.out.println("Gender: " + gender);
        System.out.println("Last Name: " + lastNameEn);
        System.out.println("First Name: " + firstNameEn);
        System.out.println("Expired Date: " + expiredDate.substring(4,6) + "/" + expiredDate.substring(2,4) + "/" + expiredDate.substring(0,2));
    }
}