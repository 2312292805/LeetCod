package Nov13;
/*
5911. ģ�����߻����� II
����һ���� XY ƽ���ϵ� width x height ������ͼ�����½� �ĸ���Ϊ (0, 0) �����Ͻ� �ĸ���Ϊ (width - 1, height - 1) ������ͼ�����ڸ���Ϊ�ĸ���������֮һ��"North"��"East"��"South" �� "West"����һ�������� ��ʼ �ڸ��� (0, 0) ������Ϊ "East" ��

�����˿��Ը���ָ���ƶ�ָ���� ���� ��ÿһ����������ִ�����²�����

���ŵ�ǰ������ ��ǰһ�� ��
�����������һ��������ĸ��� �����˱߽� �������˻� ��ʱ�� ת 90 �ȣ�Ȼ���ٳ�����ǰһ����
��������������ָ��Ҫ����ƶ�����������ֹͣ�ƶ����ȴ���һ��ָ�

����ʵ�� Robot �ࣺ

Robot(int width, int height) ��ʼ��һ�� width x height ������ͼ�������˳�ʼ�� (0, 0) ������ "East" ��
void move(int num) ���������´�ǰ�� num ����ָ�
int[] getPos() ���ػ����˵�ǰ�����ĸ���λ�ã���һ������Ϊ 2 ������ [x, y] ��ʾ��
String getDir() ���ص�ǰ�����˵ĳ���Ϊ "North" ��"East" ��"South" ���� "West" ��


ʾ�� 1��

example-1

���룺
["Robot", "move", "move", "getPos", "getDir", "move", "move", "move", "getPos", "getDir"]
[[6, 3], [2], [2], [], [], [2], [1], [4], [], []]
�����
[null, null, null, [4, 0], "East", null, null, null, [1, 2], "West"]

���ͣ�
Robot robot = new Robot(6, 3); // ��ʼ������ͼ���������� (0, 0) ��������
robot.move(2);  // �����˳����ƶ� 2 �������� (2, 0) ����������
robot.move(2);  // �����˳����ƶ� 2 �������� (4, 0) ����������
robot.getPos(); // ���� [4, 0]
robot.getDir(); // ���� "East"
robot.move(2);  // �����ƶ� 1 ������ (5, 0) ����������
                // ��һ�����������ƶ������磬������ʱ��ת�䷽�򳯱���
                // Ȼ�������ƶ� 1 ������ (5, 1) ����������
robot.move(1);  // �����ƶ� 1 ������ (5, 2) ������ �� �����ǳ�������
robot.move(4);  // ��һ�����������ƶ������磬������ʱ��ת�䷽������
                // Ȼ���ƶ� 4 ���� (1, 2) ����������
robot.getPos(); // ���� [1, 2]
robot.getDir(); // ���� "West"

 */
public class EX2 {
    private int width, height, num;

    public EX2(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void move(int num) {
        this.num += num;
    }

    public int[] getPos() {
        if (num % (2 * (width + height) - 4) < width) {
            return new int[] { num % (2 * (width + height) - 4), 0 };
        } else if (num % (2 * (width + height) - 4) < width + height - 1) {
            return new int[] { width - 1, num % (2 * (width + height) - 4) - width + 1 };
        } else if (num % (2 * (width + height) - 4) < 2 * width + height - 2) {
            return new int[] { 2 * width + height - num % (2 * (width + height) - 4) - 3, height - 1 };
        } else {
            return new int[] { 0, 2 * (width + height) - num % (2 * (width + height) - 4) - 4 };
        }
    }

    public String getDir() {
        if (num > 0 && (num % (2 * (width + height) - 4) == 0
                || num % (2 * (width + height) - 4) > 2 * width + height - 3)) {
            return "South";
        } else if (num % (2 * (width + height) - 4) < width) {
            return "East";
        } else if (num % (2 * (width + height) - 4) < width + height - 1) {
            return "North";
        } else {
            return "West";
        }
    }
}
