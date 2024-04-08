package be.tftic.java.repository;

import be.tftic.java.models.Section;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;
import java.util.Optional;

public class SectionRepository extends AbstractRepository<Section, Long> {

    public SectionRepository(EntityManagerFactory entityManagerFactory) {
        super(entityManagerFactory, Section.class);
    }

    @Override
    protected Long getId(Section entity) {
        return entity.getId();
    }

    //
//    @Override
//    public List<Section> findAll() {
//        List<Section> sections = em.createQuery("SELECT s FROM Section s", Section.class)
//                .getResultList();
//        em.clear();
//        return sections;
//    }
//
//    @Override
//    public Optional<Section> findById(Long id) {
//        Section section = em.find(Section.class, id);
//        if(section != null)
//            em.detach(section);
//
//        return Optional.ofNullable( section );
//    }
//
//    @Override
//    public Section insert(Section section) {
//        em.getTransaction().begin();
//        em.persist(section);
//        em.getTransaction().commit();
//        return section;
//    }
//
//    @Override
//    public Section update(Section section) {
//        em.getTransaction().begin();
//        section = em.merge(section);
//        em.getTransaction().commit();
//        return section;
//    }
//
//    @Override
//    public Section delete(Long id) {
//        em.getTransaction().begin();
//        Section toDelete = em.find(Section.class, id);
//        em.remove(toDelete);
//        em.getTransaction().commit();
//        return toDelete;
//    }
//
//    public void delete(Section section) {
//        em.getTransaction().begin();
//        section = em.merge(section);
//        em.remove(section);
//        em.getTransaction().commit();
//    }
}
