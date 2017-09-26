package monitor.entities;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_log")
public class Log {

    @Id
    @Column(name = "log_id")
    @SequenceGenerator(name = "logGenerator", sequenceName = "log_id_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "logGenerator")
    private int id;
    @Column(name = "timestamp")
    private Timestamp timestamp;
    @Column(name = "evento")
    private String evento;

    public Log() {
    }

    public Log(int id, Timestamp timestamp, String evento) {
        this.id = id;
        this.timestamp = timestamp;
        this.evento = evento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }
}
