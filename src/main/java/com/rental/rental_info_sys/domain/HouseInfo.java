package com.rental.rental_info_sys.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HouseInfo implements Serializable {

  private Integer houseId;
  private String houseDesc;
  private Integer typeId;
  private Integer monthlyRent;
  private Timestamp publishDate;

  private HouseType houseType;

}
