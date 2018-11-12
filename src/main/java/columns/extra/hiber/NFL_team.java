package columns.extra.hiber;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "NFL_team")
public class NFL_team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NFL_team_id", nullable = false)
    @Getter
    @Setter
    private int NFL_team_id;

    @Column(name = "name", length = 255, nullable = false)
    @Getter
    @Setter
    private String name;

    @OneToMany(mappedBy = "nfl_team")
    @Getter
    @Setter
    private Set<State> states = new HashSet<State>();


}
