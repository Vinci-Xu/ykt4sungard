 /**************************************************************
 **�����µĺ����У�������ֵ��HT-2800��0<=x<=127��0<=y<=127��  **
 **                ������ֵ��HT-1820��0<=x<=127��0<=y<=63��   **
 **                ��HT-2800�ϣ��к�Ϊ1~8���к�Ϊ1~16��       **
 **                ��HT-1820�ϣ��к�Ϊ1~4���к�Ϊ1~16��       **
 **                �ı����������������Ϊ25���������Ϊ80��   **
 **************************************************************/

   #define Lcd28_Buffer 5120*2
   #define _attr_NORM 0x07
   #define _attr_INVE 0x70

   #define _F1  0x3b00
   #define _F10 0x4400
   #define _DEL 0x5300
   #define _ESC 0x011b
   #define _ENT 0x1c0d
   #define _SPC 0x3920
   #define _DWN 0x5000
   #define _UP  0x4800
   #define _LFT 0x4b00
   #define _RGT 0x4d00
   #define _PLS 0x0d2b
   #define _MIN 0x0c2d
   #define _MUL 0x092a
   #define _DIV 0x352f

  typedef struct {
    char *menubar;
    unsigned char menukey;
  } MENU_ITM;


  extern void blankscreen(unsigned char UpperLeftX, unsigned char UpperLeftY,
			  unsigned char LowerRightX, unsigned char LowerRightY);
    /*
    1.�����Ļ
    ������UpperLeftX         ���Ͻǵ��к�
          UpperLeftY         ���Ͻǵ��к�
	  LowerRightX        ���½ǵ��к�
          LowerRightY        ���½ǵ��к�
          ��HT-2800�У����ϵ��к���Ϊ1~8���к�Ϊ1~16��
          ��HT-1820�У����ϵ��к���Ϊ1~4���к�Ϊ1~16��
    ���ز�������
    ����ֵ����
    */

  extern void scrollupscr(unsigned char UpperLeftX, unsigned char UpperLeftY,
			  unsigned char LowerRightX, unsigned char LowerRightY,
			  unsigned char ScrollLines);
    /*
    2.���Ϲ�����Ļ
    ������UpperLeftX         ���Ͻǵ��к�
          UpperLeftY         ���Ͻǵ��к�
	  LowerRightX        ���½ǵ��к�
          LowerRightY        ���½ǵ��к�
          ScrollLines        ���Ϲ���������
          ��HT-2800�У����ϵ��к���Ϊ1~8���к�Ϊ1~16��
          ��HT-1820�У����ϵ��к���Ϊ1~4���к�Ϊ1~16��
    ���ز�������
    ����ֵ����
    */

  extern void scrolldownscr(unsigned char UpperLeftX, unsigned char UpperLeftY,
			    unsigned char LowerRightX, unsigned char LowerRightY,
			    unsigned char ScrollLines);
    /*
    3.���¹�����Ļ
    ������UpperLeftX         ���Ͻǵ��к�
          UpperLeftY         ���Ͻǵ��к�
	  LowerRightX        ���½ǵ��к�
          LowerRightY        ���½ǵ��к�
          ScrollLines        ���¹���������
          ��HT-2800�У����ϵ��к���Ϊ1~8���к�Ϊ1~16��
          ��HT-1820�У����ϵ��к���Ϊ1~4���к�Ϊ1~16��
    ���ز�������
    ����ֵ����
    */

  extern void saycstr(unsigned char atX, unsigned char atY, char *str, unsigned char attr);
    /*
    4.��ָ����괦��ʾ�ַ���
    ������atX         �к�
          atY         �к�
	  str         Ҫ��ʾ���ַ���
          attr        ���е����ԣ�_attr_NORM:��ͨ�� _attr_INVE:��ɫ��
          ��HT-2800�У����ϵ��к���Ϊ1~8���к�Ϊ1~16��
          ��HT-1820�У����ϵ��к���Ϊ1~4���к�Ϊ1~16��
    ���ز�������
    ����ֵ����
    */

  extern void saystr(char *str, unsigned len);
    /*
    5.�ڵ�ǰ��괦��ʾ�ַ���
    ������str         Ҫ��ʾ���ַ���
          len         �ַ����ĳ���
    ���ز�������
    ����ֵ����
    */

  extern unsigned readspckey(void);
    /*
    6.������
    ��������
    ���ز�������
    ����ֵ�� ��ֵ
    */

  extern void toxy(unsigned char X, unsigned char Y);
    /*
    7.ָ�����λ��
    ������X     �к�
          Y     �к�
          ��HT-2800�У����ϵ��к���Ϊ1~8���к�Ϊ1~16��
          ��HT-1820�У����ϵ��к���Ϊ1~4���к�Ϊ1~16��
    ���ز�������
    ����ֵ����
    */

  extern void OpenLCDWindow(unsigned char luX, unsigned char luY,
		     unsigned char rlX, unsigned char rlY,
		     unsigned char ColCnt, unsigned char RowCnt,
		     char _far *Buffer);
    /*
    8.������
    ������luX          ���ڵ����Ͻǵ�X����
          luY          ���ڵ����Ͻǵ�Y����
          rlX          ���ڵ����½ǵ�X����
          rlY          ���ڵ����½ǵ�Y����
          ColCnt       ��ǰ�ı�������������
          RowCnt       ��ǰ�ı�������������
          Buffer       ���滺������ַ
          ��HT-2800�У����ϵ�X��Y����Ϊ0~127��
          ��HT-1820�У����ϵ�X����Ϊ0~127��Y����Ϊ0~63��
    ���ز�������
    ����ֵ����
    */

  extern void CloseLCDWindow(char _far *Buffer);
    /*
    9.�ش���
    ������Buffer       ���滺������ַ
    ���ز�������
    ����ֵ����
    */

  extern void HideCursor(void);
    /*
    10.���ι��
    ��������
    ���ز�������
    ����ֵ����
    */

  extern void ShowCursor(void);
    /*
    11.��ʾ���
    ��������
    ���ز�������
    ����ֵ����
    */

  extern unsigned char menu(MENU_ITM menuset[],
		     char *title, unsigned char deflbar,
		     unsigned char atX, unsigned char atY);
    /*
    12.�����˵�
    ������menuset      �˵���
          title        �˵��ı���
          deflbar      ȱʡʱ�߹����ڲ˵��е�λ��
          atX          �˵����Ͻǵ��к�
          atY          �˵����Ͻǵ��к�
          ��HT-2800�У����ϵ��к���Ϊ1~8���к�Ϊ1~16��
          ��HT-1820�У����ϵ��к���Ϊ1~4���к�Ϊ1~16��
    ���ز�������
    ����ֵ���˵����KEYֵ
    */

  extern unsigned char menuwin(unsigned char luX, unsigned char luY,
			unsigned char rlX, unsigned char rlY,
			unsigned char ColCnt, unsigned char RowCnt,
			MENU_ITM menuset[],
			char *title,  unsigned char deflbar);
    /*
    13.��������ʽ���ڲ˵�
    ������luX          ���ڵ����Ͻǵ�X����
          luY          ���ڵ����Ͻǵ�Y����
          rlX          ���ڵ����½ǵ�X����
          rlY          ���ڵ����½ǵ�Y����
          ColCnt       ��ǰ�ı�������������
          RowCnt       ��ǰ�ı�������������
          menuset      �˵���
          title        �˵��ı���
          deflbar      ȱʡʱ�߹����ڲ˵��е�λ��
          ��HT-2800�У����ϵ�X��Y����Ϊ0~127��
          ��HT-1820�У����ϵ�X����Ϊ0~127��Y����Ϊ0~63��
    ���ز�������
    ����ֵ���˵����KEYֵ
    */

  extern int show2lnbox(char *fstLine, char *sndLine,...);
    /*
    14.��������ʽ������ʾ��Ϣ
    ������fstLine     ��һ����ʾ��Ϣ
          sndLine     �ڶ�����ʾ��Ϣ
          ...         һ�����Ͳ�����HT-1820���Բ��Ӵ˲�����
                      1     HT-1820
                      2     HT-2800
    ���ز�������
    ����ֵ�� ��ֵ
    */
