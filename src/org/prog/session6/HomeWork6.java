package org.prog.session6;

//TODO: from these emails, print only valid ones:
// String[] emails = new String[]{"test"};
// only one @
// at least 3 symbols before @
// at least one dot (.) after @
// @ and . must not be next to each other
// at least 5 symbols after @

public class HomeWork6 {

    public static void main(String[] args) {
        String[] emails = new String[]{
                "test@t.ua",
                "test@test.com",
                "ab@bcde.com",
                "fgh@.bheg",
                "kkl@@malinator.com",
                "kool.mail.com",
                "some@email.com"
        };

        for (int i = 0; i < emails.length; i++) {
            System.out.println(i + " " + emails[i]);
        }

        System.out.println("---------");
        for (int i = 0; i < emails.length; i++) {
            if (emails[i].indexOf("@") == emails[i].lastIndexOf("@")
                    && emails[i].contains("@") == true
                    && emails[i].indexOf("@") >= 3
                    && emails[i].indexOf("@") + 1 != emails[i].indexOf(".")
                    && emails[i].length() - emails[i].indexOf("@") - 1 >= 5
            ) {
                System.out.println("Email after the test → " + emails[i]);
            }
        }
    }
}


