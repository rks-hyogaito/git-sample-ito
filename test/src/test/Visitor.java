package test;

public class Visitor {
	
	/** �u�搶�v�A�u�ݍZ���v�A�u���Ɛ��v�A�u�ފw�ҁv�A�u��ʐl�v�Ȃǂ����� */
	private String type;
	/** ����\���B true�Ȃ狖����B */
	private boolean isPermission;

	/** �R���X�g���N�^ */
	public Visitor(String type, boolean isParmission) {
		this.type = type;
		this.isPermission = isParmission;
	}

	public Visitor() {
	}

	// �ȉ��Agetter,setter,toString

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isPermission() {
		return isPermission;
	}

	public void setPermission(boolean isPermission) {
		this.isPermission = isPermission;
	}

}