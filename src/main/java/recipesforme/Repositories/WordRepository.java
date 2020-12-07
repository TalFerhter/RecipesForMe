package recipesforme.Repositories;

import recipesforme.models.Word;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WordRepository extends CrudRepository<Word, String> {

    Optional<Word> findById(String word);

    Iterable<Word> findAll();
}