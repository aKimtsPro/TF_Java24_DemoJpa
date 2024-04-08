package be.tftic.java;

import be.tftic.java.models.Section;
import be.tftic.java.repository.SectionRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_slide");

        SectionRepository repo = new SectionRepository(emf);

        Section section1 = repo.findById(1011L).get();

        section1.setName("new name 2");
        repo.insert(new Section(1012L, "", 1));

        emf.close();
    }
}

