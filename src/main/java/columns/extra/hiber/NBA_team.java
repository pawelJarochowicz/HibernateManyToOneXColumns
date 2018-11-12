package columns.extra.hiber;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "NBA_team")
public class NBA_team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NBA_team_id", nullable = false)
    @Getter
    @Setter
    private int NBA_team_id;

    @Column(name = "name", length = 255, nullable = false)
    @Getter
    @Setter
    private String name;

    @OneToMany(mappedBy = "nba_team")
    @Getter
    @Setter
    private Set<State> states = new HashSet<State>();
}
