package test;

public class Main {

	public static void main(String[] args) {

		Visitor vistor1 = new Visitor("�搶", false);
		Visitor vistor2 = new Visitor("�ݍZ��", true);
		Visitor vistor3 = new Visitor("���Ɛ�", true);
		Visitor vistor4 = new Visitor("��ʐl", false);
		Visitor vistor5 = new Visitor("��ʐl", true);

		jdugOpenGate(vistor1);
		jdugOpenGate(vistor2);
		jdugOpenGate(vistor3);
		jdugOpenGate(vistor4);
		jdugOpenGate(vistor5);

	}

	// �K��҂��m�F���āA�����ɍ����ΊJ�傷��
//	public static void jdugOpenGate(Visitor visitor) {
//		// �G���[�������ɏ���
//		if (!"�搶".equals(visitor.getType()) 
//				&& !"�ݍZ��".equals(visitor.getType()) 
//				&& !visitor.isPermission()) {
//			// ��͊J���Ȃ�
//		} else {
//			// ����J���鏈��
//		}
//	}
	
	// �K��҂��m�F���āA�����ɍ����ΊJ�傷��
	public static void jdugOpenGate(Visitor visitor) {
		// �G���[�������ɏ���
		if ("�搶".equals(visitor.getType())) {
			//�搶
		}else if("�ݍZ��".equals(visitor.getType()) ) {
			//�ݍZ��
		}else if(visitor.isPermission()) {
			//���̑��̋�������l
		}else {
			//��͊J���Ȃ�
			return;
		}
			//�ȉ��J�又��
		
		}
}