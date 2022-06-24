package telenchenkosergey.homework.homework6.password;

public class Password {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        System.out.println(Password.check("login123Kczlekfa", "123", "123"));
    }

    public static boolean check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        String[] loginArr = login.split("");
        String[] passwordArr = password.split("");
        try {
            for (String c : loginArr) {
                if (!c.matches("\\w") || loginArr.length > 20) {
                    throw new WrongLoginException("Wrong Login!");
                }
            }

            for (String c : passwordArr) {
                if (!c.matches("\\w") || passwordArr.length > 20 || !password.equals(confirmPassword)) {
                    throw new WrongPasswordException("Wrong Password!");
                }
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            return false;
        }

        return true;
    }
}
