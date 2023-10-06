/*
 * Задание 3.* Добавьте функцию в класс UserRepository, которая разлогинивает всех пользователей,
кроме администраторов. Для этого, вам потребуется расширить класс User новым свойством,
указывающим, обладает ли пользователь админскими правами. Протестируйте данную функцию.
 */

// Класс User с новым свойством isAdmin
public class User {
    private String username;
    private boolean isLoggedIn;
    private boolean isAdmin; // Новое свойство для обозначения администратора

    public User(String username, boolean isAdmin) {
        this.username = username;
        this.isLoggedIn = false;
        this.isAdmin = isAdmin;
    }

    // Геттеры и сеттеры для свойств

    public boolean isAdmin() {
        return isAdmin;
    }
}

// Класс UserRepository с методом logoutNonAdminUsers
public class UserRepository {
    private List<User> users;

    public UserRepository() {
        this.users = new ArrayList<>();
    }

    // Добавление пользователя
    public void addUser(User user) {
        users.add(user);
    }

    // Метод для разлогинивания всех пользователей, кроме администраторов
    public void logoutNonAdminUsers() {
        for (User user : users) {
            if (!user.isAdmin()) {
                user.setLoggedIn(false);
            }
        }
    }
}
