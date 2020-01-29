DROP TABLE FINTAEOI2_COUNTRY if exists;
DROP TABLE FINTDAC6_ARRANGEMENT if exists;
DROP TABLE FINTDAC6_LANGUAGE if exists;
DROP TABLE FINTDAC6_DRAFT if exists;
DROP TABLE FINTDAC6_SIF_DRAFT_STATUS if exists;

CREATE TABLE FINTAEOI2_COUNTRY (COUNTRY_ID integer not null, CODE varchar(2), COUNTRY_HR varchar(50), COUNTRY_EN varchar(50), EU_OECD varchar(10), CREATED_BY varchar(20), CREATED_ON timestamp, MODIFIED_BY varchar(20), MODIFIED_ON timestamp, primary key (COUNTRY_ID));
CREATE TABLE FINTDAC6_ARRANGEMENT (ID integer not null, ARRENGEMENT_ID varchar(255), MESSAGE_REF_ID varchar(255), TIMESTAMP timestamp, TRANSMITTING_COUNTRY_ID integer, primary key (ID));
CREATE TABLE FINTDAC6_LANGUAGE (ID integer not null, LANGUAGE_CODE varchar(255), name varchar(255), primary key (ID));
CREATE TABLE FINTDAC6_DRAFT (ID integer not null primary key, OIB_IZVJESTITELJA varchar(11), DRAFT_NAME varchar, DRAFT clob, DRAFT_STATUS integer not null, ARRANGEMENT_ID integer not null, CREATED_BY varchar(200), CREATED_ON timestamp, MODIFIED_BY varchar(200), MODIFIED_ON timestamp );
CREATE TABLE FINTDAC6_SIF_DRAFT_STATUS (ID integer not null, STATUS varchar(200));
ALTER TABLE FINTDAC6_DRAFT
    ADD FOREIGN KEY (DRAFT_STATUS) 
    REFERENCES FINTDAC6_SIF_DRAFT_STATUS(ID);