package com.pesona.group.dto.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GlobalRequestPaginate {
    public Integer pageIndex = 0;
    public Integer pageSize = 10;
    public String sortBy ; // default
    public String search ; // global search
    public String searchByAdv ; // search by col
    public String searchByAdvValue; // search by col val
    public String[] filterByColumns ;
}