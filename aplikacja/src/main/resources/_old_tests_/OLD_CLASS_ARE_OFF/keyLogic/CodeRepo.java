package pl.heinzelman.dbmodule.keyLogic;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CodeRepo extends CrudRepository<Code, Long> {

    Optional<Code> findByCodeString ( String codeString );

//     Iterable<T> findAllByActiveTrue();

//            long count();
//            long countAllByActiveTrue();


//    Optional<T> findAllByName( String name );
//    Optional<T> findAllByNameAndActiveTrue( String name );
//    Optional<T> findAllByIdAndActiveTrue( Long aLong );

//    boolean existsByIdAndActiveTrue( Long aLong );
//    boolean existsByNameAndActiveTrue( String name );


/*
    Optional<Code> findByCodeString ( String codeString );

    @Query( value = "SELECT * from code WHERE code_string LIKE :codeString AND active=1 " , nativeQuery = true )
    List<Code> likeByCodeString (@Param("codeString") String codeString );

    @Query( value = "SELECT MAX(exact_id) from code " , nativeQuery = true )
    Long getLastExactId();


    @Query( value = "" +
            " set IDENTITY_INSERT code ON; " +
            " INSERT INTO code ( code_id, code_string, active ) VALUES ( :codeId, :codeString , 1 ); " +
            " set IDENTITY_INSERT code OFF; " +
            " SELECT '1'; "  , nativeQuery = true )
    void insertWithID (@Param("codeId") Long codeId , @Param("codeString") String codeString );

  //  @Query( value = "SELECT * from code WHERE code.exact_id = :exact ", nativeQuery = true )
  //  Optional<Code> findByExactId (@Param("exact") Long exact );


    @Query( value = "SELECT * FROM code WHERE active = 1" , nativeQuery = true )
    Iterable<Code> findAll();

    @Query( value = "SELECT * FROM code " , nativeQuery = true )
    Iterable<Code> findAllWithInactive();



    // TEMPORARY !
    @Query( value = "" +
            " set IDENTITY_INSERT code ON; " +
            " INSERT INTO code ( code_id, exact_id, code_string, ean, active ) VALUES ( :codeId, :exactId, :codeString , :ean , 1 ); " +
            " set IDENTITY_INSERT code OFF; " +
            " SELECT '1'; "  , nativeQuery = true )
    void insertWithIDAndEAN (@Param("codeId") Long id ,
                             @Param("exactId") Long exactId,
                             @Param("codeString") String codeString,
                             @Param("ean") String EAN );


*/






}
