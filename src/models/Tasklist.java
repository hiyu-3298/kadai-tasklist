package models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tasklist")
public class Tasklist {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "created_at",nullable = false)
    private Timestamp created_at;

    @Column(name = "update_at",nullable = false)
    private Timestamp update_at;

    @Column(name = "content",length = 255,nullable = false)
    private String content;

}
