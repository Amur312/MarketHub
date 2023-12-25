//package ru.markethub.Model.Repository;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import ru.markethub.Model.Role;
//import org.junit.jupiter.api.Test;
//import static org.assertj.core.api.Assertions.assertThat;
//
//@DataJpaTest
//public class RoleRepositoryTest {
//
//    @Autowired
//    private RoleRepository roleRepository;
//
//    @Test
//    public void testCreateReadRole() {
//        // Создание новой роли
//        Role newRole = new Role();
//        newRole.setName(Role.RoleName.USER);
//        Role savedRole = roleRepository.save(newRole);
//
//        // Поиск роли
//        Role foundRole = roleRepository.findByName(Role.RoleName.USER);
//
//        // Проверка
//            assertThat(foundRole.getName()).isEqualTo(savedRole.getName());
//    }
//
//    // Дополнительные тесты...
//}
