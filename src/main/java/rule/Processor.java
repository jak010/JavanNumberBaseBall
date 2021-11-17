//package rule;
//
//
//import utils.DEFINE;
//
//public class Processor {
//
//    public int strike_count = 0;
//    public int ball_count = 0;
//
//    final private StringBuffer playerNumber = new StringBuffer(DEFINE.GUESS_NUMBER_DIGIT);
//    final private StringBuffer managerNumber = new StringBuffer(DEFINE.GUESS_NUMBER_DIGIT);
//
//
//    public Processor(StringBuffer p_number, StringBuffer m_number) {
//        this.playerNumber.append(p_number);
//        this.managerNumber.append(m_number);
//
//        process();
//    }
//
//    public void process() {
//        /* 입력한 숫자에 의해 stirke와 ball의 카운트 처리 */
//
//
//        for (int i = 0; i < DEFINE.GUESS_NUMBER_DIGIT ; i++) {
//            for (int j = 0; j < DEFINE.GUESS_NUMBER_DIGIT ; j++) {
//                /*위치가 같고 값이 같은 경우 strike */
//                if ((i == j) && (playerNumber.charAt(i) == managerNumber.charAt(j))) {
//                    strike_count += 1;
//                    continue;
//                }
//                /* 위치가 다르고 값이 같은 경우는 ball*/
//                if (playerNumber.charAt(i) == managerNumber.charAt(j)) {
//                    ball_count += 1;
//                }
//            }
//
//        }
//        /* End */
//
//    }
//
//
//}
