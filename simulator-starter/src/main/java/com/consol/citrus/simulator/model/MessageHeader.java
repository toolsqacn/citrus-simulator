package com.consol.citrus.simulator.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

/**
 * JPA entity for representing message headers
 *
 * @author Georgi Todorov
 */
@Entity
public class MessageHeader implements Serializable {

    private static final long serialVersionUID = 6645135139541485915L;

    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HEADER_ID")
    private Long headerId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String value;

    @JsonIgnore
    @ManyToOne
    private Message message;

    public MessageHeader() {
    }

    public MessageHeader(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public Long getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Long headerId) {
        this.headerId = headerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MessageHeader{" +
                "headerId=" + headerId +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

}
