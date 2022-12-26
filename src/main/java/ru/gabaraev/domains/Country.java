package ru.gabaraev.domains;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(schema = "world", name = "country")
@NoArgsConstructor
@Getter
@Setter
public class Country {

    @Id
    @Column(name = "id")
    private Integer countryId;

    @Column(name = "code")
    private String countryCode;

    @Column(name = "code_2")
    private String alternativeCountryCode;

    @Column(name = "name")
    private String countryName;

    @Column(name = "continent")
    @Enumerated(EnumType.ORDINAL)
    private Continent continent;

    @Column(name = "region")
    private String countryRegion;

    @Column(name = "surface_area")
    private BigDecimal countrySurfaceArea;

    @Column(name = "indep_year")
    private Short countryIndependenceYear;

    @Column(name = "population")
    private Integer countyPopulation;

    @Column(name = "life_expectancy")
    private BigDecimal countyLifeExpectancy;

    @Column(name = "gnp")
    private BigDecimal countyGnp;

    @Column(name = "gnpo_id")
    private BigDecimal countyGnpoId;

    @Column(name = "local_name")
    private String countyLocalName;

    @Column(name = "government_form")
    private String countryGovernmentForm;

    @Column(name = "head_of_state")
    private String countryHeadOfState;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "capital")
    private City city;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id")
    private Set<CountryLanguage> languages;

}
