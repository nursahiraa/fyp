# Covid19 Data in Malaysia
## Metadata

1) `date`: yyyy-mm-dd format; data correct as of 1200hrs on that date
2) `state`: name of state (present in state file, but not country file)
3) `cases_new`: cases reported in the 24h since the last report
4) `cases_import`: imported cases reported in the 24h since the last report
5) `cases_active`: Covid+ individuals who have not recovered or died
6) `cases_recovered` recovered cases reported in the 24h since the last report
7) `cases_cluster`: number of cases attributable to clusters; the difference between `cases_new` and the sum of cases attributable to clusters is the number of sporadic cases
8) `cluster_x`: cases attributable to clusters under category `x`; possible values for `x` are import, religious, community, highRisk, education, detentionCentre, and workplace
9) `cases_agecat`: cases falling into one of 4 age categories, i.e. child (0-11), adolescent (12-17), adult (18-59), elderly (60+); note that the sum of cases by age may not equal the total cases for that day, as some cases are registered without ages or with unverifiable age data 
10) `cases_unvax`: number of unvaccinated individuals who tested positive for Covid (perfect subset of `cases_new`), where "unvaccinated" is defined as not having received any dose of a COVID-19 vaccine prior to testing positive.
12) `cases_pvax`: number of partially-vaccinated individuals who tested positive for Covid (perfect subset of `cases_new`), where "partially vaccinated" is defined as receiving at least 1 dose of a 2-dose vaccine at least 1 day prior to testing positive, or receiving the Cansino vaccine between 1-27 days before testing positive
13) `cases_fvax`: number of fully-vaccinated who tested positive for Covid (perfect subset of `cases_new`), where "fully vaccinated" is defined as receiving the 2nd dose of a 2-dose vaccine at least 14 days prior to testing positive, or receiving the Cansino vaccine at least 28 days before testing positive
14)  `cases_boost`: Number of individuals who tested positive for COVID-19 and had received a booster dose (perfect subset of `cases_new`), where "booster" is defined as receiving an additional dose of a COVID-19 vaccine beyond the original protocol at least 1 day prior to testing positive.
