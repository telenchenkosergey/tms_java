package telenchenkosergey.homework.homework6.password;

public class Password {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        System.out.println(Password.check("login123Kczlekfa", "123", "123"));
    }

    public static boolean check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        String[] loginArr = login.split("");
        String[] passwordArr = password.split("");
        boolean isOK = true;
        try {
            for (String c : loginArr) {
                if (!c.matches("\\w") || loginArr.length >= 20) {
                    throw new WrongLoginException("Wrong Login!");
                }
            }
        } catch (WrongLoginException e) {
            e.getMessage();
            isOK = false;
        }

        try {
            for (String c : passwordArr) {
                if (!c.matches("\\w") || passwordArr.length >= 20 || !password.equals(confirmPassword)) {
                    throw new WrongPasswordException("Wrong Password!");
                }
            }
        } catch (WrongPasswordException e) {
            e.getMessage();
            isOK = false;
        }

        return isOK;
    }
}
