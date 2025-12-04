package DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;
@Getter
@Setter
@NoArgsConstructor
public class EventDTO implements Serializable,Comparable<String> {
    private String name;
    private String email;
    private String phone;
    private String type;
    private String city;

    public EventDTO(String name,String email,String phone,String type,String city){
        this.name=name;
        this.email=email;
        this.phone=phone;
        this.type=type;
        this.city=city;
    }

    @Override
    public String toString() {
        return "EventDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", type='" + type + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EventDTO eventDTO = (EventDTO) o;
        return Objects.equals(name, eventDTO.name) && Objects.equals(email, eventDTO.email) && Objects.equals(phone, eventDTO.phone) && Objects.equals(type, eventDTO.type) && Objects.equals(city, eventDTO.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, phone, type, city);
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
