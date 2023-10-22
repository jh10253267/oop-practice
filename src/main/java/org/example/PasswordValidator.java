package org.example;

public class PasswordValidator {

    private static final String PASSWORD_LENGTH_EXCEPTION = "비밀번호는 최소 8자 이상 12자 이하여야한다.";
    public static void validate(String password) {
        int length = password.length();

        if(length < 8 || length > 12) {
            throw new IllegalArgumentException(PASSWORD_LENGTH_EXCEPTION);
        }
    }
}
