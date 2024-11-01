package dk.kea.serverservernameinfodat23c.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class GenderDTO {
    String gender;
    String name;
    int count;
    double probability;
}
