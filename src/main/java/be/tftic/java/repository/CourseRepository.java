package be.tftic.java.repository;

import be.tftic.java.models.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;
import java.util.Optional;

public class CourseRepository implements ICrudRepository<Course, String> {

    private final EntityManager em;

    public CourseRepository(EntityManagerFactory emf) {
        em = emf.createEntityManager();
    }


    @Override
    public List<Course> findAll() {
        List<Course> courses = em.createQuery("SELECT c FROM Course c", Course.class)
                .getResultList();
        em.clear();
        return courses;
    }

    @Override
    public Optional<Course> findById(String id) {
        Course course = em.find(Course.class, id);
        em.clear();
        return Optional.ofNullable( course );
    }

    @Override
    public Course insert(Course course) {
        em.getTransaction().begin();
        em.persist(course);
        em.getTransaction().commit();
        return course;
    }

    @Override
    public Course update(Course course) {
        em.getTransaction().begin();

        Course toUpdate = em.find(Course.class, course.getId());
        if( toUpdate == null ){
            throw new RuntimeException("Course not found");
        }
        toUpdate.setName(course.getName());
        toUpdate.setEcts(course.getEcts());
        toUpdate.setProfId(course.getProfId());

        em.getTransaction().commit();
        return course;
    }

    @Override
    public Course delete(String id) {
        Course course = em.find(Course.class, id);
        if( course == null )
            throw new RuntimeException("Course not found");

        em.getTransaction().begin();
        em.remove(course);
        em.getTransaction().commit();
        return course;
    }
}
