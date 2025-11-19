package com.xworkz.coffee.DTO;

import java.io.Serializable;
import java.util.Objects;

public class CustomerFeedbackDTO implements Serializable,Comparable<String> {

    private String name;
    private String email;
    private String comments;
    private String rating;

    public CustomerFeedbackDTO(String name,String email,String comments,String rating){
        this.name=name;
        this.email=email;
        this.comments=comments;
        this.rating=rating;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CustomerFeedbackDTO that = (CustomerFeedbackDTO) o;
        return Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(comments, that.comments) && Objects.equals(rating, that.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, comments, rating);
    }

    @Override
    public String toString() {
        return "CustomerFeedbackDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", comments='" + comments + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
