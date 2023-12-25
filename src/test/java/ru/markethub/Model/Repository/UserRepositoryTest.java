//package ru.markethub.Model.Repository;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import ru.markethub.Model.User;
//
//import org.junit.jupiter.api.Test;
//import static org.assertj.core.api.Assertions.assertThat;
//
//@DataJpaTest
//public class UserRepositoryTest {
//
//    @Autowired
//    private TestEntityManager entityManager;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Test
//    public void testCreateReadUser() {
//        // Создание нового пользователя
//        User newUser = new User();
//        newUser.setName("testUser");
//        newUser.setPassword("password123");
//        entityManager.persist(newUser);
//        entityManager.flush();
//
//        // Поиск пользователя
//        User foundUser = userRepository.findByName("testUser");
//
//        // Проверка
//        assertThat(foundUser.getName()).isEqualTo(newUser.getName());
//    }
//
//    // Дополнительные тесты для других операций...
//}
