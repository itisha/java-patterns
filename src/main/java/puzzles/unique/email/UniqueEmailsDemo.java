package puzzles.unique.email;

import org.junit.Assert;

import java.util.HashSet;

public class UniqueEmailsDemo {
    public static void main(String[] args) {
        Solution solution = new Solution();

        Assert.assertEquals(2,
                solution.numUniqueEmails(new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"}));
    }
}

class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> aliasList = new HashSet<>(emails.length);
        for (String email : emails) {
            String[] nameAndHost = email.split("@");
            String finalName = nameAndHost[0].split("\\+")[0].replace(".", "");
            aliasList.add(finalName + "@" + nameAndHost[1]);
        }
        return aliasList.size();
    }
}
