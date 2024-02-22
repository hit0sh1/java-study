public class RockPaperScissors {
    public static void main(String[] args) {
        // プレイヤーの手を選択
        String playerChoice = "rock"; // プレイヤーの選択 ("rock", "paper", "scissors" のいずれか)

        // コンピューターの手をランダムで選択
        String[] choices = {"rock", "paper", "scissors"};
        int randomIndex = (int) (Math.random() * choices.length);
        String computerChoice = choices[randomIndex];

        // 勝敗を判定
        if (playerChoice.equals(computerChoice)) {
            System.out.println("引き分けです！");
        } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("プレイヤーの勝ちです！");
        } else {
            System.out.println("コンピューターの勝ちです！");
        }
    }
}
