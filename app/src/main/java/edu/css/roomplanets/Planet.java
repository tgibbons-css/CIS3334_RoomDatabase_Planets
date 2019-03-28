package edu.css.roomplanets;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by tgibbons on 3/28/2019.
 */

@Entity(tableName = "planet_table")
public class Planet {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "planet_id")             // use ColumnInfo if the database field name should be different than the variable name
    public Long _id;        // database record id

    @ColumnInfo(name = "planet_name")           // use ColumnInfo if the database field name should be different than the variable name
    public String name;        // planet name

    public Float gravity;      // gravity value on this planet's surface

    /*
    public Planet(Long _id, String name, Float gravity) {
        this._id = _id;
        this.name = name;
        this.gravity = gravity;
    }
    */

    public Planet(String name, Float gravity) {
        this._id = null;
        this.name = name;
        this.gravity = gravity;
    }

    public Long get_id() {
        return _id;
    }

    public Float getGravity() {
        return gravity;
    }

    public void setGravity(Float gravity) {
        this.gravity = gravity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", gravity=" + gravity +
                '}';
    }

}
