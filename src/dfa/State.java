package dfa;

import java.util.HashMap;
import java.util.Map;

public class State {
  
  private int stateID;// ����transformMap
  private Map<Character, Integer> transformMap = new HashMap<>();// ״̬ת����
  private static Map<Integer, String> finalStateOutputMap = new HashMap<>();// ��̬��Ӧ�������Ϣ����Token��Ӧ�������Ϣ

  /**
   * @dec �õ�StateID�����÷�������ɣ�������Ҫ������Ķ�
   * @return stateID
   */
  public int getStateID() {
    return this.stateID;
  }
  
  /**
   * @dec ���캯������ʼ��isEndState��stateID��transformMap��������ɷ�������������Ķ�
   */
  public State() {
    
  }
  
  /**
   * @dec ����Ƿ�����ƶ���������bool��������÷�������ɣ�������Ҫ������Ķ�
   * @param currentCharacter �����ַ�
   * @return �Ƿ�����ƶ�
   */
  public boolean checkMove(char currentCharacter) {
    try {
      this.transformMap.get(currentCharacter);
      return true;
    } catch (NullPointerException e) {
      return false;
    }
  }
  
  /**
   * @dec �ƶ����������ƶ����stateID�����÷�������ɣ�������Ҫ������Ķ�
   * @param currentCharacter �����ַ�
   * @return �ƶ����stateID
   */
  public int move(char currentCharacter) {
    return this.transformMap.get(currentCharacter);
  }
  
  /**
   * @dec ����Ƿ�����̬��������bool��������÷�������ɣ�������Ҫ������Ķ�
   * @param stateID ������stateID
   * @return �Ƿ�����̬
   */
  public static boolean checkFinalState(int stateID) {
    return finalStateOutputMap.containsKey(stateID);
  }
  
  /**
   * @dec ������̬��Ӧ�������Ϣ����Token��Ӧ�������Ϣ�����÷�������ɣ�������Ҫ������Ķ�
   * @param stateID ��Ӧ��̬
   * @return �����Ϣ
   */
  public static String finalStateOutput(int stateID) {
    return finalStateOutput(stateID);
  }
  
}