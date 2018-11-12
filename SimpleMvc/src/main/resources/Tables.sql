--Tables
CREATE TABLE USERS
  (
    "USER_ID"           NUMBER(18,0) NOT NULL ENABLE,
    "NAME"      VARCHAR2(80 CHAR),
	"DESIGNATION"      VARCHAR2(80 CHAR),
	"EMAIL"      VARCHAR2(80 CHAR),
    "DOB" DATE,
    "DAT_CREATION" TIMESTAMP (6),
    "DAT_LAST_UPDATE" TIMESTAMP (6),
    
	CONSTRAINT "PK_USER_ID" PRIMARY KEY ("USER_ID") ENABLE
 );
  
CREATE TABLE ADDRESS
  (
    "ADDRESS_ID"           NUMBER(18,0) NOT NULL ENABLE,
	"USER_ID"              NUMBER(18,0) NOT NULL ENABLE,
    "STREET"     		   VARCHAR2(80 CHAR),
	"CITY"      		   VARCHAR2(80 CHAR),
	"STATE"                VARCHAR2(80 CHAR),
    "COUNTRY"              VARCHAR2(80 CHAR),
	"ID_ADDRESS_TYPE"       NUMBER(5,0) NOT NULL ENABLE,
    "DAT_CREATION" TIMESTAMP (6),
    "DAT_LAST_UPDATE" TIMESTAMP (6), 
	CONSTRAINT "PK_ADDRESS_ID" PRIMARY KEY ("ADDRESS_ID") ENABLE,
    CONSTRAINT "FK_USER_ID" FOREIGN KEY ("USER_ID") REFERENCES "USERS" ("USER_ID") ENABLE
);
    