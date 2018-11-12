package columns.extra.hiber;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "state")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "state_id", nullable = false)
    @Getter
    @Setter
    private int state_id;

    @Column(name = "name", length = 255, nullable = false)
    @Getter
    @Setter
    private String name;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "NBA_team_id")
    @Getter
    @Setter
    private NBA_team nba_team;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "NFL_team_id")
    @Getter
    @Setter
    private NFL_team nfl_team;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "NHL_team_id")
    @Getter
    @Setter
    private NHL_team nhl_team;

    @Column(name = "City")
    @Getter
    @Setter
    private String city;

    @Column(name = "Registered_date")
    @Getter
    @Setter
    @Temporal(TemporalType.DATE)
    private Date Registered_date;

}
