package com.twuc.shopping.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.lang.model.element.Name;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Goods {

    @NotNull
    private String name;

    @NotNull
    private String price;

    @NotNull
    @Size(min = 1)
    private int number;

    @NotNull
    private String picture;
}
