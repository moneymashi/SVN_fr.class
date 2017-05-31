/*
	README
	- �Ʒ��� ������ ������� ���� �ؾ��Ѵ�.(���������� -> ���̺� ����)
	- Ư�� ������ �����ų���� �� ���� ������ ������ ���� (�����ư Ŭ��  �Ǵ� Ctrl+Enter) �Է� 
	- �������� ���̺��� ������ �� �տ� �ٴ� whyNot�� ���� �̸����� ���� ������ "SCOTT"�̶�� "SCOTT"���� �ٲ��ش�.
	- ������ �Է�,����(INSERT, UPDATE)�� ��������θ� ����� ���� ��õ�Ѵ�.
	- ��Ÿ ���Ǵ� �ۼ��ڿ��� �����ϼ���.
*/


/* ������ - AUCTION_USER */

CREATE SEQUENCE whyNot."AUCTION_USER_SEQ" MINVALUE 1
                                          MAXVALUE 1000
                                          INCREMENT BY 1
                                          START WITH 1
                                          NOCACHE
                                          NOORDER
                                          NOCYCLE;

/* ������ - AUCTION_ITEM */

CREATE SEQUENCE whyNot."AUCTION_ITEM_SEQ" MINVALUE 1
                                          MAXVALUE 1000
                                          INCREMENT BY 1
                                          START WITH 1
                                          NOCACHE
                                          NOORDER
                                          NOCYCLE;

/* ���̺� - AUCTION_USER */

CREATE TABLE whyNot."AUCTION_USER"
(
   "USER_ID"         NUMBER (10, 0),
   "USER_NAME"       VARCHAR2 (20 BYTE),
   "EMAIL"           VARCHAR2 (40 BYTE),
   "PASSWORD"        VARCHAR2 (20 BYTE),
   "REGISTER_DATE"   DATE,
   "AUTH"            NUMBER (1, 0) DEFAULT 1,
   PRIMARY KEY ("USER_ID")
      USING INDEX
         PCTFREE 10
         INITRANS 2
         MAXTRANS 255
         COMPUTE STATISTICS
         STORAGE (INITIAL 65536
                  NEXT 1048576
                  MINEXTENTS 1
                  MAXEXTENTS 2147483645
                  PCTINCREASE 0
                  FREELISTS 1
                  FREELIST GROUPS 1
                  BUFFER_POOL DEFAULT
                  FLASH_CACHE DEFAULT
                  CELL_FLASH_CACHE DEFAULT)
         TABLESPACE "USERS"
      ENABLE
)
SEGMENT CREATION IMMEDIATE
PCTFREE 10
PCTUSED 40
INITRANS 1
MAXTRANS 255
NOCOMPRESS
LOGGING
STORAGE (INITIAL 65536
         NEXT 1048576
         MINEXTENTS 1
         MAXEXTENTS 2147483645
         PCTINCREASE 0
         FREELISTS 1
         FREELIST GROUPS 1
         BUFFER_POOL DEFAULT
         FLASH_CACHE DEFAULT
         CELL_FLASH_CACHE DEFAULT)
TABLESPACE "USERS";


CREATE OR REPLACE TRIGGER whyNot."TG_AUCTION_USER"
   BEFORE INSERT
   ON whyNot."AUCTION_USER"
   FOR EACH ROW
BEGIN
   IF INSERTING
   THEN
      IF :NEW."USER_ID" IS NULL
      THEN
         SELECT AUCTION_USER_SEQ.NEXTVAL INTO :NEW."USER_ID" FROM DUAL;
      END IF;
   END IF;
END;
/

ALTER TRIGGER whyNot."TG_AUCTION_USER" ENABLE;

/* ���̺� - AUCTIONEER_INFO */

CREATE TABLE whyNot."AUCTIONEER_INFO"
(
   "AUCTIONEER_ID"   NUMBER (10, 0),
   "LEVEL"           NUMBER (1, 0) DEFAULT 1,
   "SATISFACTION"    NUMBER (3, 0) DEFAULT 0,
   PRIMARY KEY ("AUCTIONEER_ID")
      USING INDEX
         PCTFREE 10
         INITRANS 2
         MAXTRANS 255
         COMPUTE STATISTICS
         STORAGE (INITIAL 65536
                  NEXT 1048576
                  MINEXTENTS 1
                  MAXEXTENTS 2147483645
                  PCTINCREASE 0
                  FREELISTS 1
                  FREELIST GROUPS 1
                  BUFFER_POOL DEFAULT
                  FLASH_CACHE DEFAULT
                  CELL_FLASH_CACHE DEFAULT)
         TABLESPACE "USERS"
      ENABLE,
   CONSTRAINT "FK_AUCTION_USER" FOREIGN KEY ("AUCTIONEER_ID")
   REFERENCES whyNot."AUCTION_USER" ("USER_ID")
   ENABLE
)
SEGMENT CREATION IMMEDIATE
PCTFREE 10
PCTUSED 40
INITRANS 1
MAXTRANS 255
NOCOMPRESS
LOGGING
STORAGE (INITIAL 65536
         NEXT 1048576
         MINEXTENTS 1
         MAXEXTENTS 2147483645
         PCTINCREASE 0
         FREELISTS 1
         FREELIST GROUPS 1
         BUFFER_POOL DEFAULT
         FLASH_CACHE DEFAULT
         CELL_FLASH_CACHE DEFAULT)
TABLESPACE "USERS";



CREATE TABLE whyNot."AUCTION_ITEM"
(
   "AUCTIONEER_ID"        NUMBER (10, 0),
   "AUCTION_ID"           NUMBER (10, 0),
   "ITEM_NAME"            VARCHAR2 (20 BYTE),
   "START_DATE"           DATE,
   "END_DATE"             DATE,
   "STATE"                NUMBER (1, 0) DEFAULT 1,
   "CURRENT_BID_AMOUNT"   NUMBER (10, 0),
   CONSTRAINT "PK_AUCTION_ID" PRIMARY KEY ("AUCTION_ID")
   USING INDEX
      PCTFREE 10
      INITRANS 2
      MAXTRANS 255
      COMPUTE STATISTICS
      STORAGE (INITIAL 65536
               NEXT 1048576
               MINEXTENTS 1
               MAXEXTENTS 2147483645
               PCTINCREASE 0
               FREELISTS 1
               FREELIST GROUPS 1
               BUFFER_POOL DEFAULT
               FLASH_CACHE DEFAULT
               CELL_FLASH_CACHE DEFAULT)
      TABLESPACE "USERS"
   ENABLE,
   CONSTRAINT "FK_AUCTIONEER_ID" FOREIGN KEY ("AUCTIONEER_ID")
   REFERENCES whyNot."AUCTION_USER" ("USER_ID")
   ENABLE
)
SEGMENT CREATION IMMEDIATE
PCTFREE 10
PCTUSED 40
INITRANS 1
MAXTRANS 255
NOCOMPRESS
LOGGING
STORAGE (INITIAL 65536
         NEXT 1048576
         MINEXTENTS 1
         MAXEXTENTS 2147483645
         PCTINCREASE 0
         FREELISTS 1
         FREELIST GROUPS 1
         BUFFER_POOL DEFAULT
         FLASH_CACHE DEFAULT
         CELL_FLASH_CACHE DEFAULT)
TABLESPACE "USERS";

 /* ���̺� - AUCTION_ITEM */

CREATE OR REPLACE TRIGGER whyNot."TG_AUCTION_ITEM"
   BEFORE INSERT
   ON whyNot."AUCTION_ITEM"
   FOR EACH ROW
BEGIN
   IF INSERTING
   THEN
      IF :NEW."AUCTION_ID" IS NULL
      THEN
         SELECT AUCTION_ITEM_SEQ.NEXTVAL INTO :NEW."AUCTION_ID" FROM DUAL;
      END IF;
   END IF;
END;
/

ALTER TRIGGER whyNot."TG_AUCTION_ITEM" ENABLE;

/* ���̺� - AUCTION_BID */

CREATE TABLE whyNot."AUCTION_BID"
(
   "BIDDER_ID"      NUMBER (10, 0),
   "AUCTION_ID"     NUMBER (10, 0),
   "BIDDING_DATE"   DATE,
   "BID_AMOUNT"     NUMBER (10, 0),
   PRIMARY KEY ("AUCTION_ID", "BIDDER_ID", "BIDDING_DATE")
      USING INDEX
         PCTFREE 10
         INITRANS 2
         MAXTRANS 255
         COMPUTE STATISTICS
         STORAGE (INITIAL 65536
                  NEXT 1048576
                  MINEXTENTS 1
                  MAXEXTENTS 2147483645
                  PCTINCREASE 0
                  FREELISTS 1
                  FREELIST GROUPS 1
                  BUFFER_POOL DEFAULT
                  FLASH_CACHE DEFAULT
                  CELL_FLASH_CACHE DEFAULT)
         TABLESPACE "USERS"
      ENABLE,
   CONSTRAINT "FK_BIDDER_ID" FOREIGN KEY ("BIDDER_ID")
   REFERENCES whyNot."AUCTION_USER" ("USER_ID")
   ENABLE,
   CONSTRAINT "FK_AUCTION_ID" FOREIGN KEY ("AUCTION_ID")
   REFERENCES whyNot."AUCTION_ITEM" ("AUCTION_ID")
   ENABLE
)
SEGMENT CREATION IMMEDIATE
PCTFREE 10
PCTUSED 40
INITRANS 1
MAXTRANS 255
NOCOMPRESS
LOGGING
STORAGE (INITIAL 65536
         NEXT 1048576
         MINEXTENTS 1
         MAXEXTENTS 2147483645
         PCTINCREASE 0
         FREELISTS 1
         FREELIST GROUPS 1
         BUFFER_POOL DEFAULT
         FLASH_CACHE DEFAULT
         CELL_FLASH_CACHE DEFAULT)
TABLESPACE "USERS";

/* ���̵����� ���� ���� */

SELECT * FROM AUCTION_USER;

/* ���� ���� */

INSERT INTO auction_user (USER_NAME,
                          PASSWORD,
                          EMAIL,
                          REGISTER_DATE)
     VALUES ('admin',
             '1111',
             'admin@test.com',
             SYSDATE - (5/24));

INSERT INTO auction_user (USER_NAME,
                          PASSWORD,
                          EMAIL,
                          REGISTER_DATE)
     VALUES ('user01',
             '1111',
             'user01@test.com',
             SYSDATE - (3/24));

INSERT INTO auction_user (USER_NAME,
                          PASSWORD,
                          EMAIL,
                          REGISTER_DATE)
     VALUES ('user02',
             '1111',
             'user02@test.com',
             SYSDATE - (1/24));
			 
SELECT * FROM AUCTIONEER_INFO;

/* �Ǹ��� ��� */

INSERT INTO auctioneer_info (AUCTIONEER_ID)
     VALUES (1);

INSERT INTO auctioneer_info (AUCTIONEER_ID)
     VALUES (2);

INSERT INTO auctioneer_info (AUCTIONEER_ID)
     VALUES (3);

SELECT * FROM AUCTION_ITEM;

/* ��� ��Ǯ ��� */

INSERT INTO auction_ITEM (AUCTIONEER_ID,
                          ITEM_NAME,
                          START_DATE,
                          END_DATE,
                          CURRENT_BID_AMOUNT)
     VALUES (1,
             'LOTTO',
             SYSDATE,
             SYSDATE + 7,
             1000);

/* ������ ��� ��ǰ�� ���� ������ ������(�̷� ���� ������ ���� �̷��������) */

UPDATE auction_item
   SET current_bid_amount = 1100
 WHERE auction_id = 1;

UPDATE auction_item
   SET current_bid_amount = 1200
 WHERE auction_id = 1;

UPDATE auction_item
   SET current_bid_amount = 1300
 WHERE auction_id = 1;

SELECT * FROM AUCTION_BID;

/* �����ڰ� ���ʷ� ���� */

INSERT INTO auction_bid (BIDDER_ID,
                         AUCTION_ID,
                         BIDDING_DATE,
                         BID_AMOUNT)
     VALUES (1,
             1,
             SYSDATE - (2/(24*60)),
             1100);

INSERT INTO auction_bid (BIDDER_ID,
                         AUCTION_ID,
                         BIDDING_DATE,
                         BID_AMOUNT)
     VALUES (2,
             1,
             SYSDATE - (1/(24*60)),
             1200);

INSERT INTO auction_bid (BIDDER_ID,
                         AUCTION_ID,
                         BIDDING_DATE,
                         BID_AMOUNT)
     VALUES (3,
             1,
             SYSDATE,
             1300);



SELECT * FROM AUCTION_BID;
SELECT * FROM AUCTION_item;
SELECT * FROM AUCTION_user;
SELECT * FROM AUCTIONeer_info;

INSERT INTO auction_user (USER_NAME,
                          PASSWORD,
                          EMAIL,
                          REGISTER_DATE)
     VALUES ('ŷ��¯',
             'whywhy',
             'why@not',
             SYSDATE);

SELECT COUNT(*) FROM AUCTION_USER;

COMMIT;
