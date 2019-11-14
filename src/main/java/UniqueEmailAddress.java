import java.util.HashSet;

public class UniqueEmailAddress {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            int splitPos = email.indexOf("@");

            String localName = email.substring(0, splitPos);
            String domainName = email.substring(splitPos);

            if (localName.contains("+")) {
                int plusPos = localName.indexOf("+");
                localName = localName.substring(0, plusPos);
            }

            localName = localName.replaceAll("\\.", "");
            email = localName + domainName;

            uniqueEmails.add(email);
        }
        return uniqueEmails.size();
    }

}
