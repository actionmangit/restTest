package hyoungki.conf.domain;

public class Conf {
	
	private Integer roomNo;
	private String ownerIdx;
	private String confServerIdx;
	private String roomId;
	private String roomPasswd;
	private Byte isDeleted;
	private Byte isPublic;
	private Integer availNum;
	private Integer confType;
	private Integer confMode;
	private Integer mcuMode;
	private Integer productCode;
	private Byte productVideoLevel;
	private Integer optionFlags;
	private String title;
	private String agenda;
	private String areaName;
	private String creatorUcid;
	private String stateCode;
	private String resvDate;
	private String startDate;
	private String endDate;
	private Long progTime;
	private String optionData1;
	private String optionData2;
	private String optionData3;
	private String optionData4;
	private String phoneEn;
	private Integer userLimit;
	private String workDate;
	private String workerId;
	private Byte optionType;
	private Integer timeZoneId;
	private Byte daylightSavingTime;
	private String subheading;
	private Byte useTimeLimit;
	private Integer timeLimitFrom;
	private Integer timeLimitTo;
	private Byte objectType;
	private String objectName;
	private Byte ownerType;
	private String ownerName;
	private Integer ownerRoomNo;
	//private Byte scheduleType;
	private ScheduleType scheduleType;
	private Integer scheduleValue;
	private Byte deleteConfFile;
	private Byte allowOpenConfFile;
	private Byte allowSaveConfFile;
	private String phoneEnPassword;
	private String pinCode;
	private Byte conflistMode;

	public Conf() {
		
	}
	
	public Conf(String ownerIdx, String roomId, String title, String creatorUcid, String resvDate, ScheduleType scheduleType) {
		
		this.ownerIdx		= ownerIdx;
		this.roomId			= roomId;
		this.title			= title;
		this.creatorUcid	= creatorUcid;
		this.resvDate		= resvDate;
		this.startDate		= resvDate;
		this.endDate		= resvDate;
		this.workDate		= resvDate;
		this.workerId		= creatorUcid;
		this.scheduleType	= scheduleType;
	}
	
	@Override
	public String toString() {
		
		return "Conf [roomNo=" + roomNo + ", ownerIdx=" + ownerIdx + ", confServerIdx=" + confServerIdx + ", roomId="
				+ roomId + ", roomPasswd=" + roomPasswd + ", isDeleted=" + isDeleted + ", isPublic=" + isPublic
				+ ", availNum=" + availNum + ", confType=" + confType + ", confMode=" + confMode + ", mcuMode="
				+ mcuMode + ", productCode=" + productCode + ", productVideoLevel=" + productVideoLevel
				+ ", optionFlags=" + optionFlags + ", title=" + title + ", agenda=" + agenda + ", areaName=" + areaName
				+ ", creatorUcid=" + creatorUcid + ", stateCode=" + stateCode + ", resvDate=" + resvDate
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", progTime=" + progTime + ", optionData1="
				+ optionData1 + ", optionData2=" + optionData2 + ", optionData3=" + optionData3 + ", optionData4="
				+ optionData4 + ", phoneEn=" + phoneEn + ", userLimit=" + userLimit + ", workDate=" + workDate
				+ ", workerId=" + workerId + ", optionType=" + optionType + ", timeZoneId=" + timeZoneId
				+ ", daylightSavingTime=" + daylightSavingTime + ", subheading=" + subheading + ", useTimeLimit="
				+ useTimeLimit + ", timeLimitFrom=" + timeLimitFrom + ", timeLimitTo=" + timeLimitTo + ", objectType="
				+ objectType + ", objectName=" + objectName + ", ownerType=" + ownerType + ", ownerName=" + ownerName
				+ ", ownerRoomNo=" + ownerRoomNo + ", scheduleType=" + scheduleType + ", scheduleValue=" + scheduleValue
				+ ", deleteConfFile=" + deleteConfFile + ", allowOpenConfFile=" + allowOpenConfFile
				+ ", allowSaveConfFile=" + allowSaveConfFile + ", phoneEnPassword=" + phoneEnPassword + ", pinCode="
				+ pinCode + ", conflistMode=" + conflistMode + "]";
	}
	
	public ScheduleType getScheduleType() {
		return scheduleType;
	}

	public void setScheduleType(ScheduleType scheduleType) {
		this.scheduleType = scheduleType;
	}

	public Integer getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(Integer roomNo) {
		this.roomNo = roomNo;
	}
	public String getOwnerIdx() {
		return ownerIdx;
	}
	public void setOwnerIdx(String ownerIdx) {
		this.ownerIdx = ownerIdx;
	}
	public String getConfServerIdx() {
		return confServerIdx;
	}
	public void setConfServerIdx(String confServerIdx) {
		this.confServerIdx = confServerIdx;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getRoomPasswd() {
		return roomPasswd;
	}
	public void setRoomPasswd(String roomPasswd) {
		this.roomPasswd = roomPasswd;
	}
	public Byte getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Byte isDeleted) {
		this.isDeleted = isDeleted;
	}
	public Byte getIsPublic() {
		return isPublic;
	}
	public void setIsPublic(Byte isPublic) {
		this.isPublic = isPublic;
	}
	public Integer getAvailNum() {
		return availNum;
	}
	public void setAvailNum(Integer availNum) {
		this.availNum = availNum;
	}
	public Integer getConfType() {
		return confType;
	}
	public void setConfType(Integer confType) {
		this.confType = confType;
	}
	public Integer getConfMode() {
		return confMode;
	}
	public void setConfMode(Integer confMode) {
		this.confMode = confMode;
	}
	public Integer getMcuMode() {
		return mcuMode;
	}
	public void setMcuMode(Integer mcuMode) {
		this.mcuMode = mcuMode;
	}
	public Integer getProductCode() {
		return productCode;
	}
	public void setProductCode(Integer productCode) {
		this.productCode = productCode;
	}
	public Byte getProductVideoLevel() {
		return productVideoLevel;
	}
	public void setProductVideoLevel(Byte productVideoLevel) {
		this.productVideoLevel = productVideoLevel;
	}
	public Integer getOptionFlags() {
		return optionFlags;
	}
	public void setOptionFlags(Integer optionFlags) {
		this.optionFlags = optionFlags;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAgenda() {
		return agenda;
	}
	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCreatorUcid() {
		return creatorUcid;
	}
	public void setCreatorUcid(String creatorUcid) {
		this.creatorUcid = creatorUcid;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getResvDate() {
		return resvDate;
	}
	public void setResvDate(String resvDate) {
		this.resvDate = resvDate;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Long getProgTime() {
		return progTime;
	}
	public void setProgTime(Long progTime) {
		this.progTime = progTime;
	}
	public String getOptionData1() {
		return optionData1;
	}
	public void setOptionData1(String optionData1) {
		this.optionData1 = optionData1;
	}
	public String getOptionData2() {
		return optionData2;
	}
	public void setOptionData2(String optionData2) {
		this.optionData2 = optionData2;
	}
	public String getOptionData3() {
		return optionData3;
	}
	public void setOptionData3(String optionData3) {
		this.optionData3 = optionData3;
	}
	public String getOptionData4() {
		return optionData4;
	}
	public void setOptionData4(String optionData4) {
		this.optionData4 = optionData4;
	}
	public String getPhoneEn() {
		return phoneEn;
	}
	public void setPhoneEn(String phoneEn) {
		this.phoneEn = phoneEn;
	}
	public Integer getUserLimit() {
		return userLimit;
	}
	public void setUserLimit(Integer userLimit) {
		this.userLimit = userLimit;
	}
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	public String getWorkerId() {
		return workerId;
	}
	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}
	public Byte getOptionType() {
		return optionType;
	}
	public void setOptionType(Byte optionType) {
		this.optionType = optionType;
	}
	public Integer getTimeZoneId() {
		return timeZoneId;
	}
	public void setTimeZoneId(Integer timeZoneId) {
		this.timeZoneId = timeZoneId;
	}
	public Byte getDaylightSavingTime() {
		return daylightSavingTime;
	}
	public void setDaylightSavingTime(Byte daylightSavingTime) {
		this.daylightSavingTime = daylightSavingTime;
	}
	public String getSubheading() {
		return subheading;
	}
	public void setSubheading(String subheading) {
		this.subheading = subheading;
	}
	public Byte getUseTimeLimit() {
		return useTimeLimit;
	}
	public void setUseTimeLimit(Byte useTimeLimit) {
		this.useTimeLimit = useTimeLimit;
	}
	public Integer getTimeLimitFrom() {
		return timeLimitFrom;
	}
	public void setTimeLimitFrom(Integer timeLimitFrom) {
		this.timeLimitFrom = timeLimitFrom;
	}
	public Integer getTimeLimitTo() {
		return timeLimitTo;
	}
	public void setTimeLimitTo(Integer timeLimitTo) {
		this.timeLimitTo = timeLimitTo;
	}
	public Byte getObjectType() {
		return objectType;
	}
	public void setObjectType(Byte objectType) {
		this.objectType = objectType;
	}
	public String getObjectName() {
		return objectName;
	}
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}
	public Byte getOwnerType() {
		return ownerType;
	}
	public void setOwnerType(Byte ownerType) {
		this.ownerType = ownerType;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Integer getOwnerRoomNo() {
		return ownerRoomNo;
	}
	public void setOwnerRoomNo(Integer ownerRoomNo) {
		this.ownerRoomNo = ownerRoomNo;
	}
	public Integer getScheduleValue() {
		return scheduleValue;
	}
	public void setScheduleValue(Integer scheduleValue) {
		this.scheduleValue = scheduleValue;
	}
	public Byte getDeleteConfFile() {
		return deleteConfFile;
	}
	public void setDeleteConfFile(Byte deleteConfFile) {
		this.deleteConfFile = deleteConfFile;
	}
	public Byte getAllowOpenConfFile() {
		return allowOpenConfFile;
	}
	public void setAllowOpenConfFile(Byte allowOpenConfFile) {
		this.allowOpenConfFile = allowOpenConfFile;
	}
	public Byte getAllowSaveConfFile() {
		return allowSaveConfFile;
	}
	public void setAllowSaveConfFile(Byte allowSaveConfFile) {
		this.allowSaveConfFile = allowSaveConfFile;
	}
	public String getPhoneEnPassword() {
		return phoneEnPassword;
	}
	public void setPhoneEnPassword(String phoneEnPassword) {
		this.phoneEnPassword = phoneEnPassword;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public Byte getConflistMode() {
		return conflistMode;
	}
	public void setConflistMode(Byte conflistMode) {
		this.conflistMode = conflistMode;
	}
}
