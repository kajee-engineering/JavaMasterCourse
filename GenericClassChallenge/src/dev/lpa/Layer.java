package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Layer <T extends Mappable> {

    private List<T> layerElements;

    public Layer( // コンストラクタ
            T[] layerElements // ジェネリック型Tの配列を引数として受け取る
    ) {
        this.layerElements = new ArrayList<T>( // クラスプロパティにTタイプを持つ配列を代入する
                List.of(layerElements) // layerElementsを要素とする固定長のリストを生成する。
        );
    }

    public void addElements(T... elements) {
        layerElements.addAll(List.of(elements));
    }

    public void renderLayer() {

        for (T element : layerElements) {
            element.render();
        }
    }
}
