CREATE DATABASE IF NOT EXISTS CURIX55
;

USE CURIX55
;

CREATE TABLE CONF_TBL 
(
	OWNER_IDX				CHAR(36)			NOT NULL,
	CONF_SERVER_IDX			CHAR(36)			NULL,
	ROOM_ID					CHAR(36)		 	NULL,
	ROOM_NO					INT 				AUTO_INCREMENT NOT NULL PRIMARY KEY,
	ROOM_PASSWD				VARCHAR(256) 		NULL,
	PIN_CODE				VARCHAR(64)			NULL UNIQUE,
	IS_DELETED				TINYINT 			DEFAULT 0,
	IS_PUBLIC				TINYINT 			NULL,
	AVAIL_NUM				INT 				NULL,
	CONF_TYPE				INT 				DEFAULT 0,
	CONF_MODE				INT		 			NULL,
	CONFLIST_MODE 			TINYINT 			DEFAULT 0,
	MCU_MODE				INT					DEFAULT 0,
	PRODUCT_CODE			INT 				DEFAULT 0 NOT NULL,
	PRODUCT_VIDEO_LEVEL		TINYINT 			DEFAULT 0 NOT NULL,
	OPTION_FLAGS			INT 				NULL,
	TITLE					NVARCHAR(500) 		NOT NULL,
	AGENDA					NVARCHAR(2000) 		NULL,
	AREA_NAME				NVARCHAR(64)		NULL,
	CREATOR_UCID			VARCHAR(256) 		NOT NULL,
	STATE_CODE				VARCHAR(2) 			NULL,
	RESV_DATE				VARCHAR(14) 		NOT NULL,
	START_DATE				VARCHAR(14) 		NOT NULL,
	END_DATE				VARCHAR(14) 		NOT NULL,
	PROG_TIME				BIGINT 				NULL,
	USE_ADMISSION_DATE		TINYINT				DEFAULT 0 NOT NULL,
	ADMISSION_START_DATE	VARCHAR(14)			NULL,
	ADMISSION_END_DATE		VARCHAR(14)			NULL,
	OPTION_DATA1			VARCHAR(2000)		NULL,
	OPTION_DATA2			VARCHAR(2000)		NULL,
	OPTION_DATA3			VARCHAR(2000)		NULL,
	OPTION_DATA4			VARCHAR(2000)		NULL,
	PHONE_EN				VARCHAR(20)			NULL,
	PHONE_EN_PASSWORD		VARCHAR(256)		NULL,
	USER_LIMIT				INT		 			DEFAULT 2,
	WORK_DATE				VARCHAR(14) 		NOT NULL,
	WORKER_ID				VARCHAR(256) 		NOT NULL,
	OPTION_TYPE				TINYINT				DEFAULT 0 NOT NULL,		## 설정 방법. 0 : 간편 설정, 1 : 고급 설정
	TIME_ZONE_ID			INT					NULL,					## 타임존 아이디 (숫자). NULL이면 클라이언트 LOCALE. "Time  Zone List" 시트 참조
	DAYLIGHT_SAVING_TIME	TINYINT				DEFAULT 0 NOT NULL,		## 0 : 사용안함, 1 : 사용함. "Time Zone List"에서 DST가 X인 곳은 표시안됨.
	SUBHEADING				NVARCHAR(500)		NULL,					## 소제목
	USE_TIME_LIMIT			TINYINT				DEFAULT 0 NOT NULL,		## 0 : 입장 제한 시간 사용 안함, 1 : 입장 제한 시간 사용
	TIME_LIMIT_FROM			INT					NULL,					## 회의 시작 몇 분 전 (양수)
	TIME_LIMIT_TO			INT					NULL,					## 회의 종료 몇 분 후 (양수)
	OBJECT_TYPE				TINYINT				DEFAULT 0 NOT NULL,		## 0 : 일반, 1 : 회의 그룹, 2 : 템플릿
	OBJECT_NAME				NVARCHAR(128)		NULL,					## 객체 이름 (현재는 템플릿일 경우에만 존재)
	OWNER_TYPE				TINYINT				DEFAULT 0 NOT NULL,		## 부모 타입. 0 : 없음, 1 : 회의 그룹, 2 : 템플릿
	OWNER_NAME				NVARCHAR(128)		NULL,					## 부모 이름 (현재는 템플릿일 경우에만 존재)
	OWNER_ROOM_NO			INT					NULL,					## 템플릿이나 반복회의에서 파생 또는 그룹에 속해있는 경우 그 부모 방 번호
	SCHEDULE_TYPE			TINYINT				DEFAULT 0 NOT NULL,		## 0 : 반복없음, 1 : 매일, 2 : 주중, 3 : 매주, 4 : 매월 (날짜), 5 : 매월 (몇번째 무슨요일)
	SCHEDULE_VALUE			INT					NULL,					## SCHEDULE_TYPE이 3, 4, 5일 경우에 의미가 있다. 3일 경우 월 = 1, 화 = 2, 수 = 4, 목 = 8, 금 = 16, 토 = 32, 일 = 64의 값을 더해서 나타내게 된다. 간격은 1주는 0, 2주는 1000, 3주는 2000... 식으로 주에서 1을 뺀 값에 1000을 곱한 값으로 표시한다. 4일 경우 날짜를 넣게 되며 말일은 40의 값을 가진다. 5일 경우 첫번째는 0, 두번째는 10, 세번째는 20, … , 다섯번째는 40의 값을 가지며 월요일은 1, 화요일은 2, 수요일은 3, 목요일은 4, …, 일요일은 7의 값을 가지게 된다.
	DELETE_CONF_FILE		TINYINT				DEFAULT 0 NOT NULL,		## 회의 종료 후에 자료를 삭제할 지 여부. 0 : 삭제 안함, 1 : 삭제함
	ALLOW_OPEN_CONF_FILE	TINYINT				DEFAULT 0 NOT NULL,		## 회의 종료 후에 자료열람을 누구에게 허용할 지. 0 : 모두 허용안함, 1 : 참석자에게만 허용함, 2 : 모두에게 허용함
	ALLOW_SAVE_CONF_FILE	TINYINT				DEFAULT 0 NOT NULL,		## 회의 종료 후에 자료저장을 누구에게 허용할 지. 0 : 모두 허용안함, 1 : 참석자에게만 허용함, 2 : 모두에게 허용함
	IS_DEMO 				TINYINT  			DEFAULT 0 NOT NULL,     ## 데모 회의인지 		
	INDEX (OWNER_IDX)
)
;