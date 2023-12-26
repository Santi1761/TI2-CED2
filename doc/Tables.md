# Test Cases

| Class       | Method                                   | Scenario                               | Input                                        | Output                                     |
|-------------|------------------------------------------|----------------------------------------|----------------------------------------------|--------------------------------------------|
| ReaderTest  | getData should return the first line     | Load data from "data1.txt"            | "src/test/scala/data/resources/data1.txt"    | "dsasadnaskndasjfnjaksfbnjasbfjakfsnkfsnamkfnaskjfnasjkfnasjfnalsjnfasjlnfslajnfasljfnajlfnaljfnasjf" |
| ReaderTest  | getData should return the second line    | Load data from "data1.txt"            | "src/test/scala/data/resources/data1.txt"    | "foiasinjoasnfjasnfjkasjofnqoighuojcvnmnvcbnxvjkbsjidhgbnsjngosihgnuosdjngbjsidbghsidbgyewbywbybhfba" |
| ReaderTest  | getData should return the third line     | Load data from "data1.txt"            | "src/test/scala/data/resources/data1.txt"    | "bvlcxpvbkcpoxjsopdihfuiodsbfhivbuhwvfutcfvxgfyvzsaduoashfuihgasfiyugayifgbayisfgyasifbhiafbhiafbhia" |
| ReaderTest  | getData should return the fourth line    | Load data from "data1.txt"            | "src/test/scala/data/resources/data1.txt"    | "dsipajdfsihjufhsuighdsphjpiojbniohnjvbhbasdhqufhrueihfgyudisbfijhdsngpsngvnjixnknvjkdsbgidhsihgbdfi" |
| ReaderTest  | getData should return the fifth line     | Load data from "data1.txt"            | "src/test/scala/data/resources/data1.txt"    | "ohasufhsafnsajpaoskposajpicmpkzbnxjcbvuoubbdioshnduvijsbnhgjivbnfgherbybwqtrvqbuotrboudhuoinoifhdnu" |
| ReaderTest  | getData should return the sixth line     | Load data from "data1.txt"            | "src/test/scala/data/resources/data1.txt"    | "pojosffpaijfoabfjiabnjvbnvsdapdjqpjweioqhroihewibihjvbcxhkjbbkdnmncnxbcxpjdsiofhqopjpwoqjroihbtojbf" |
| ReaderTest  | getData should return the seventh line   | Load data from "data1.txt"            | "src/test/scala/data/resources/data1.txt"    | "sfpiafhaiojqewiofhweuoghdusnlkdsmlfmpovocjxuiobnjdsbhjkfasvbhgvcbhigbizgbihabvshvdjgvqugvaguhvbqiqo" |
| ReaderTest  | getData should return the eighth line    | Load data from "data1.txt"            | "src/test/scala/data/resources/data1.txt"    | "jcnbxkjzbkcjbnaijbsnoiunqiojqpoijfiohnjsndjksnbksdbpfndksbfksbkfjbdskjfbsjkdbfhsdbfhsvgjfvwgjevgfwv" |
| ReaderTest  | getData should return the ninth line     | Load data from "data1.txt"            | "src/test/scala/data/resources/data1.txt"    | "dsiajodihsjqoijdsakiofjaspiofjpaoijgoihjfdsonvjxcnbjkvcxbvkjxbvuisdhbuihsuidgbhiusbubwehbewibewifxz" |
| ReaderTest  | getData should return the tenth line     | Load data from "data1.txt"            | "src/test/scala/data/resources/data1.txt"    | "ihjiosahouiashduiqhwuighquighquiegquigebiqurgyutgycxzbvjzxbnvlndshokjhojgfpjhfoibnjonzjvhauihuhsiau" |
| ReaderTest  | getData should be different the line 1 from 2 | Load data from "data1.txt"       | "src/test/scala/data/resources/data1.txt"    | Compare line 1 with line 2                 |


# Test Cases

| Class        | Method                                              | Scenario                                                | Input                                       | Expected Output   |
| ------------ | --------------------------------------------------- | ------------------------------------------------------- | -------------------------------------------- | ----------------- |
| WritterTest  | Verify file creation and content                   | Write results to "output_for_Tests.txt" and verify content | Results: ["2333", "39990", "324242", "3342", "232423"] | 2333              |
| WritterTest  | Should be equal                                     | Write results to "output_for_Tests.txt" and verify content | Results: ["2333", "39990", "324242", "3342", "232423"] | 324242            |
| WritterTest  | Should be different                                | Write results to "output_for_Tests.txt" and verify content | Results: ["2333", "39990", "324242", "3342", "232423"] | Not equal to 324242 |
| WritterTest  | This should be different as well                    | Write results to "output_for_Tests.txt" and verify content | Results: ["2333", "39990", "324242", "3342", "232423"] | Not equal to 232423 |



# Scenarios

| Name                                       | Class        | Scenario                               |
| ------------------------------------------ | ------------ | -------------------------------------- |
| getData should return the first line        | ReaderTest   | Load data from "data1.txt"             |
| getData should return the second line       | ReaderTest   | Load data from "data1.txt"             |
| getData should return the third line        | ReaderTest   | Load data from "data1.txt"             |
| getData should return the fourth line       | ReaderTest   | Load data from "data1.txt"             |
| getData should return the fifth line        | ReaderTest   | Load data from "data1.txt"             |
| getData should return the sixth line        | ReaderTest   | Load data from "data1.txt"             |
| getData should return the seventh line      | ReaderTest   | Load data from "data1.txt"             |
| getData should return the eighth line       | ReaderTest   | Load data from "data1.txt"             |
| getData should return the ninth line        | ReaderTest   | Load data from "data1.txt"             |
| getData should return the tenth line        | ReaderTest   | Load data from "data1.txt"             |
| getData should be different the line 1 from 2 | ReaderTest | Load data from "data1.txt"             |


# Scenarios

| Name                                      | Class        | Scenario                                               |
| ----------------------------------------- | ------------ | ------------------------------------------------------ |
| Verify File Creation and Expected Results | WritterTest   | Write results to "output_for_Tests.txt" and verify content |
| Should Equal                              | WritterTest   | Write results to "output_for_Tests.txt" and verify content |
| Should Be Different                       | WritterTest   | Write results to "output_for_Tests.txt" and verify content |
| Another Different Scenario                | WritterTest   | Write results to "output_for_Tests.txt" and verify content |

