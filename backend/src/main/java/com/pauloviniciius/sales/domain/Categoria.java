package com.pauloviniciius.sales.domain;


import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;


}
