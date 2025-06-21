package dev.lpa.model;

public class LPAStudent extends Student {

    private double percentComplete;

    public LPAStudent() {
        // 暗黙的にスーパクラスのコンストラクタを実行し、他のフィールドを生成する。
        percentComplete = random.nextDouble(0, 100.001);
    }

    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(
                super.toString(), // スーパクラスで生成された文字列に
                percentComplete); // この新しいフィールドと追加する
    }

    public double getPercentComplete() {
        return percentComplete;
    }
}
