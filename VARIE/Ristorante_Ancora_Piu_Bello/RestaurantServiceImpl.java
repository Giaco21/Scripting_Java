import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RestaurantServiceImpl implements RestaurantService {

    private UserRepository userRepository = new UserRepositoryImpl();
    private OrderRepository orderRepository = new OrderRepositoryImpl();
    private User currentUser;

    @Override
    public void register(String username, String password, String firstName, String lastName) throws RegistrationException {
        if (userRepository.findByUsername(username) != null) {
            throw new RegistrationException("Username already taken");
        }
        User user = new User(username, password, firstName, lastName, false);
        userRepository.save(user);
    }

    @Override
    public void login(String username, String password) throws AuthenticationException {
        User user = userRepository.findByUsername(username);
        if (user == null || !user.getPassword().equals(password)) {
            throw new AuthenticationException("Invalid username or password");
        }
        currentUser = user;
    }

    @Override
    public void logout() {
        currentUser = null;
    }

    @Override
    public boolean isAdmin() {
        return currentUser != null && currentUser.isAdmin();
    }

    @Override
    public void placeOrder(String itemName, int quantity) throws OrderException {
        if (currentUser == null) {
            throw new OrderException("Not logged in");
        }
        Order order = new Order(currentUser.getUsername(), itemName, quantity);
        orderRepository.save(order);
    }

    @Override
    public List<Order> getOrders() {
        if (currentUser == null) {
            return new ArrayList<>();
        }
        return orderRepository.findByUsername(currentUser.getUsername());
    }

    @Override
    public List<User> getUsers() {
        if (!isAdmin()) {
            return new ArrayList<>();
        }
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(String username) throws UserException {
        if (!isAdmin()) {
            throw new UserException("Not authorized");
        }
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UserException("User not found");
        }
        userRepository.delete(user);
    }

    @Override
    public void updateUser(String username, String firstName, String lastName) throws UserException {
        if (!isAdmin()) {
            throw new UserException("Not authorized");
        }
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UserException("User not found");
        }
        if (firstName != null && !firstName.isEmpty()) {
            user.setFirstName(firstName);
        }
        if (lastName != null && !lastName.isEmpty()) {
            user.setLastName(lastName);
        }
        userRepository.update(user);
    }
}