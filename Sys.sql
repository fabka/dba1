CREATE USER LOGAN IDENTIFIED BY LOGAN;
GRANT CONNECT TO LOGAN;
GRANT RESOURCE TO LOGAN;
GRANT DBA TO LOGAN;

grant select on DBA_USERS to LOGAN;
grant select on DBA_TABLES to LOGAN;
grant select on DBA_VIEWS to LOGAN;
grant select on DBA_MVIEWS to LOGAN;
grant select on DBA_TRIGGERS to LOGAN;
grant select on DBA_TAB_COLUMNS to LOGAN;
grant select on DBA_CONS_COLUMNS to LOGAN;
grant select on all_constraints to LOGAN;