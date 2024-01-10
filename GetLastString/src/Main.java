import java.util.HashMap;
import java.util.Map;

class IDCardParser {

    public static void main(String[] args) {
        String str1 = "idNumber: 160363311";
        String str2 = "dob: 01/01/1995";
        String str3 = "gender: M";
        String str4 = "lastNameEn: MEN";
        String str5 = "firstNameEn: CHENDA";
        String str6 = "expiredDate: 21/06/2024";

        Map<String, String> idCardInfo = parseIDCardInfo(str1, str2, str3, str4, str5, str6);

        System.out.println("ID Number: " + idCardInfo.get("idNumber"));
        System.out.println("Date of Birth: " + idCardInfo.get("dob"));
        System.out.println("Gender: " + idCardInfo.get("gender"));
        System.out.println("Last Name: " + idCardInfo.get("lastNameEn"));
        System.out.println("First Name: " + idCardInfo.get("firstNameEn"));
        System.out.println("Expired Date: " + idCardInfo.get("expiredDate"));
    }

    private static Map<String, String> parseIDCardInfo(String... idCardStrings) {
        Map<String, String> idCardInfo = new HashMap<>();

        for (String idCardString : idCardStrings) {
            String[] parts = idCardString.split(": ");
            if (parts.length == 2) {
                idCardInfo.put(parts[0], parts[1]);
            }
        }

        return idCardInfo;
    }
}
