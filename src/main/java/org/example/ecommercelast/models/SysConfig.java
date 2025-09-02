package org.example.ecommercelast.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "sys_config", schema = "sys")
public class SysConfig {
    @Id
    @Column(name = "variable", nullable = false, length = 128)
    private String variable;

    @Column(name = "value", length = 128)
    private String value;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "set_time")
    private Instant setTime;

    @Column(name = "set_by", length = 128)
    private String setBy;

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Instant getSetTime() {
        return setTime;
    }

    public void setSetTime(Instant setTime) {
        this.setTime = setTime;
    }

    public String getSetBy() {
        return setBy;
    }

    public void setSetBy(String setBy) {
        this.setBy = setBy;
    }

}