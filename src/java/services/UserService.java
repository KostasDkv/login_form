package services;

import entities.User;
import java.util.NoSuchElementException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class UserService {

    @PersistenceContext
    EntityManager em;

    @Transactional
    public User login(User u) {
        try {
            System.out.println("TRYING...");
            User user = em
                    .createNamedQuery("User.login", User.class)
                    .setParameter("username", u.getUsername())
                    .setParameter("password", u.getPassword())
                    .getSingleResult();
            System.out.println("SUCCESS " + user.getName());
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

}
