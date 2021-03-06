package Spring.Playground.SpringREST;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class Employee {

  @Getter @Setter private @Id @GeneratedValue Long id;
  @Getter @Setter private String name;
  @Getter @Setter private String role;

  Employee() {}

  Employee(String name, String role) {
    this.name = name;
    this.role = role;
  }
}