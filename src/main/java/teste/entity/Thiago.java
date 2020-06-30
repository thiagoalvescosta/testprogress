package teste.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
    import cronapi.CronapiCloud;


/**
* Classe que representa a tabela THIAGO
* @generated
*/
@Entity
@Table(name = "\"THIAGO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("teste.entity.Thiago")
public class Thiago implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome;

    /**
    * @generated
    */
    @Column(name = "imagem", nullable = true, unique = false, insertable=true, updatable=true)
    @CronapiCloud(type = "dropbox", value="3Hoo9mBivzwAAAAAAAAIqPjjiJKG6wsf5NJyw2EulTH73RAMoMrGfysYg4NU1pOX", id="", secret="")
        
        private java.lang.String imagem;

    /**
    * @generated
    */
    @Column(name = "arquivo", nullable = true, unique = false, insertable=true, updatable=true)
    @CronapiCloud(type = "dropbox", value="3Hoo9mBivzwAAAAAAAAIqPjjiJKG6wsf5NJyw2EulTH73RAMoMrGfysYg4NU1pOX", id="", secret="")
        
        private java.lang.String arquivo;

    /**
    * Construtor
    * @generated
    */
    public Thiago(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Thiago setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    
    public java.lang.String getNome(){
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public Thiago setNome(java.lang.String nome){
        this.nome = nome;
        return this;
    }
    /**
    * Obtém imagem
    * return imagem
    * @generated
    */
    
    public java.lang.String getImagem(){
        return this.imagem;
    }

    /**
    * Define imagem
    * @param imagem imagem
    * @generated
    */
    public Thiago setImagem(java.lang.String imagem){
        this.imagem = imagem;
        return this;
    }
    /**
    * Obtém arquivo
    * return arquivo
    * @generated
    */
    
    public java.lang.String getArquivo(){
        return this.arquivo;
    }

    /**
    * Define arquivo
    * @param arquivo arquivo
    * @generated
    */
    public Thiago setArquivo(java.lang.String arquivo){
        this.arquivo = arquivo;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Thiago object = (Thiago)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}