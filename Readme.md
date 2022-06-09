## PIdea - плагин для поддержки языка [P](https://github.com/kajigor/fl-2022-itmo-spr/blob/proj/lang/P.md)

### Реализовано:
- Лексер с использованием JFlex, тесты
- Парсер на основе grammar-kit, тесты
- Подсветка синтаксиса
- Автодополнение при вводе аргументов (подсказывает true, false, отношения, декларация которых находится в том же файле)
- Resolve использования отношений (ctrl + click по вызову отношения)

Плагин распознает файлы с расширением "plang", в качестве примера можно использовать:

```
eval St (var X) U :- elem X St U.
eval St (conj X Y) true :- eval St X true, eval St Y true.
eval St (conj X Y) false :- eval St X false; eval St Y false.
eval St (disj X Y) true :- eval St X true; eval St Y true.
eval St (disj X Y) false :- eval St X false, eval St Y false.
eval St (not X) true :- eval St X false.
eval St (not X) false :- eval St X true.

elem zero (cons H T) H.
elem (succ N) (cons H T) V :- elem N T V.

? eval St (conj (disj X Y) (not (var Z))) true.
```

```
eval St (var X) U :- elem X St U.
eval St (conj X Y) U :- eval St X V, eval St Y W, and V W U.
eval St (disj X Y) U :- eval St X V, eval St Y W, or V W U.
eval St (not X) U :- eval St X V, neg U V.

elem zero (cons H T) H.
elem (succ N) (cons H T) V :- elem N T V.

nand false false true.
nand false true true.
nand true false true.
nand true true false.

neg X R :- nand X X R.

or X Y R :- nand X X Xx, nand Y Y Yy, nand Xx Yy R.

and X Y R :- nand X Y Xy, nand Xy Xy R.

? eval St (conj (disj X Y) (not (var Z))) true.
```