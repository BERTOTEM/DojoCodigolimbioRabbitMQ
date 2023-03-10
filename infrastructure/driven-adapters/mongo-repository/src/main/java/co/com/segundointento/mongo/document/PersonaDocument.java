package co.com.segundointento.mongo.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Personas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonaDocument {
    @Id
    private String id;
    private String nombre;
    private String correo;
}
