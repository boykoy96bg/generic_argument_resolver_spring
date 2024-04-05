package com.example.baseentity.resolver;

import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IDResolver<T> {

    private T id;
}
