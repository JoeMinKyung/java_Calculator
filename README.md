# Calculator
> 이 프로젝트는 간단한 계산기 프로그램입니다. 사용자가 입력한 두 숫자와 연산자를 바탕으로 사칙연산(더하기, 빼기, 곱하기, 나누기)을 수행합니다. 사용자가 계산을 계속할 수 있도록 기능을 제공하며, exit 명령어를 입력하면 프로그램이 종료됩니다.

<br>

## Table of Contents
* [Technologies Used](#technologies-used)
* [Calculator1_info](#calculator1_info)
* [Calculator1_Features](#Calculator1_Features)
* [Calculator1_Screenshots](#Calculator1_Screenshots)
* [Calculator1_Usage](#Calculator1_Usage)
* [Calculator2_info](#calculator2_info)
* [Calculator2_Features](#calculator2_Features)
* [Calculator2_Screenshots](#calculator2_Screenshots)
* [Calculator2_Usage](#calculator2_Usage)
* [Calculator3_info](#calculator3_info)
* [Calculator3_Features](#calculator3_Features)
* [Calculator3_Screenshots](#calculator3_Screenshots)
* [Calculator3_Usage](#calculator3_Usage)
* [Contact](#contact)

  <br>
## Technologies Used
<div align=center> 
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> 
    <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
  <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">
</div>

<br>

- **Java**
  - 계산기 로직과 사용자 입력 처리를 위한 핵심 프로그래밍 언어로 사용되었습니다. 반복문, 조건문, 예외 처리(try-catch) 등을 활용하여 프로그램의 안정성을 확보했습니다.

  - **Scanner**

    - 사용자 입력을 콘솔에서 받아오는 데 사용되었습니다. Scanner 클래스는 숫자와 연산자를 입력받는 데 사용됩니다.
  - **ArrayList**
    - 계산된 결과를 저장하고 관리하는 데 사용되었습니다. 동적으로 결과를 저장하고, 이를 쉽게 조회하거나 수정할 수 있도록 ArrayList를 활용했습니다.
  - **캡슐화 (Encapsulation)**
    - 계산기의 연산 결과는 private 필드로 캡슐화되어 있으며, 해당 필드를 수정하거나 조회할 수 있도록 public getter와 setter 메서드가 제공되어 올바른 접근을 보장합니다.
  - **Switch-Case**
    - 사용자가 입력한 연산자에 따라 사칙연산(+, -, *, /)을 처리하기 위해 switch-case 문을 사용했습니다. 이를 통해 프로그램을 모듈화하고 향후 추가적인 연산을 쉽게 확장할 수 있도록 했습니다.
  - **예외 처리 (try-catch)**
    - 정수 입력 오류나 0으로 나누기 오류 등을 처리하기 위해 예외 처리 기법을 사용하여, 프로그램이 예기치 않게 종료되지 않고 의미 있는 오류 메시지를 제공하도록 했습니다.

<br>

## Calculator1_info
> `Calculator` 클래스는 기본적인 사칙연산을 처리하며, 사용자에게 두 숫자와 연산자를 입력받고, 계산 결과를 출력합니다. 이 클래스에서는 결과를 저장하지 않고, 매번 계산 후 출력합니다. `exit`를 입력하기 전까지 연산을 계속해서 할 수 있습니다.
### `Calculator.java`


- **`input`**

  - `while` 문을 사용해 사용자의 입력을 계속해서 받습니다. (`exit` 입력 전까지)
  
  - `while` 문과 `try-catch` 문을 사용하여 입력된 문자가 **유효한 양의 정수인지 계속해서 판별**합니다.
  
  - `while` 문과 `try-catch` 문을 사용하여 입력된 문자가 **유효한 연산자인지 계속해서 판별**합니다.

 
- **`operations`** 

  - 사칙연산 수행 시 `validOperation` 변수를 사용하여 나눗셈 연산에서 분모에 0이 들어가는 오류를 처리합니다. 

- **`Operation finished`**
  
  - 연산을 계속하려면 아무 키나 누르고, 연산을 종료하고 싶으면 `exit`를 입력합니다.

<br>

## Calculator1_Features

- 양의 정수(0 포함) 두 개를 입력받아 사칙연산을 수행합니다.

- 입력한 연산 기호에 맞춰 연산을 진행합니다. (사칙연산 기호: `+`, `-`, `*`, `/`)

- 나누기 연산 시, 0으로 나누는 오류를 처리합니다.

- 사용자가 연산을 계속할지 종료할지 선택할 수 있습니다. (입력 `exit` 시 종료)

<br>


## Calculator1_Screenshots

![image](https://github.com/user-attachments/assets/b43e8e23-b144-4b45-bb0b-e5434c9e6459)
![image](https://github.com/user-attachments/assets/575e0a63-aaba-4118-9194-6ae9db12b335)

<br>

## Calculator1_Usage
1. 프로그램 실행 후, 첫 번째 숫자를 입력합니다.
2. 두 번째 숫자를 입력합니다.
3. 사칙연산 기호(+, -, *, /)를 입력합니다.
4. 연산 결과가 출력됩니다.
5. 연산을 계속하려면 아무 키나 누르고, 종료하려면 exit을 입력합니다.

<br><br>

## Calculator2_info
> `Calculator` 클래스는 기본적인 사칙연산을 처리하며, 사용자에게 두 숫자와 연산자를 입력받고, 계산 결과를 출력합니다. 이 클래스에서는 결과를 저장하고 조회/삭제가 가능합니다. `exit`를 입력하기 전까지 연산을 계속해서 할 수 있습니다.

### `Calculator2.java`
> `Calculator2` 클래스는 `Calculator1` 클래스의 연산 기능을 분리한 컬렉션 타입 필드의 클래스입니다. `Calculator2` 클래스는 연산 결과를 관리하고 계산을 수행하는 기능 및 결과를 저장/조회/삭제하는 기능을 제공합니다. 

 
- **`method`** 
  - `calculate(int a, int b, char c)` : 두 숫자와 연산 기호를 입력받아 연산을 수행하고 결과를 저장합니다.

  - `printResults()` : 저장된 연산 결과를 출력합니다.
  
  - `removeResult()` : 가장 먼저 저장된 연산 결과를 삭제합니다. 빈 배열일 때 발생하는 오류 처리를 했습니다.

  - `getResults()` : 저장된 연산 결과 목록을 가져옵니다.

  - `addResult(int result)` : 연산 결과를 리스트에 추가합니다.


<br>

### `App.java`
> App 클래스는 사용자 입력을 받고 Calculator2 클래스를 활용하여 계산 및 결과 관리 기능을 수행합니다.

- **`input`**

  - `while` 문을 사용해 사용자의 입력을 계속해서 받습니다. (`exit` 입력 전까지)
  
  - `getPositiveInteger` 메소드를 사용하여 입력된 문자가 **유효한 양의 정수인지 계속해서 판별**합니다.
  
  - `getOperator` 메소드 사용하여 입력된 문자가 **유효한 연산자인지 계속해서 판별**합니다.

- **`output`**

  - 계산 결과를 출력합니다.
    
  - 저장된 연산 결과를 조회하고 삭제할 수 있습니다.
    
- **`Operation finished`**
  
  - 연산을 계속하려면 아무 키나 누르고, 연산을 종료하고 싶으면 `exit`를 입력합니다.

<br>

## Calculator2_Features

- 양의 정수(0 포함) 두 개를 입력받아 사칙연산을 수행합니다.

- 입력한 연산 기호에 맞춰 연산을 진행합니다. (사칙연산 기호: `+`, `-`, `*`, `/`)

- 나누기 연산 시, 0으로 나누는 오류를 처리합니다.

- 연산 결과를 저장하고 조회할 수 있습니다.

- 연산 결과를 삭제할 수 있습니다.

- 사용자가 연산을 계속할지 종료할지 선택할 수 있습니다. (입력 `exit` 시 종료)

<br>


## Calculator2_Screenshots

![image](https://github.com/user-attachments/assets/de4bb8d6-2dd1-4ee6-8d5e-95abcc781eff)
![image](https://github.com/user-attachments/assets/cd0d77a4-0a75-4019-bbe7-71fdb8a2b594)



<br>

## Calculator2_Usage
1. 프로그램 실행 후, 첫 번째 숫자와 두 번째 숫자를 입력합니다.
2. 사칙연산 기호(+, -, *, /)를 입력합니다.
3. 연산 결과가 출력됩니다.
4. 연산 결과를 조회하거나 삭제하거나, 더 계산을 할 수 있습니다.
5. 연산을 계속하려면 아무 키나 누르고, 종료하려면 `exit`을 입력합니다.
   

<br>

## Calculator3_info
> `Calculator3` 패키지는 위의 `Calculator1/2` 클래스에 제너릭을 활용하여 다양한 숫자 타입(`int`, `double`, `float` 등)을 처리할 수 있는 계산기입니다. 이 클래스에서는 연산 결과를 계산 후 저장하며, 사용자가 계산을 계속할 수 있습니다.



### `ArithmeticCalculator.java`

> `ArithmeticCalculator`는 제너릭을 활용하여 계산 기능을 확장합니다. 사용자가 입력한 연산자에 대해 다양한 숫자 타입을 처리할 수 있도록 설계되었습니다. 연산을 수행한 후 결과를 출력하고, 필요에 따라 추가적인 계산을 처리할 수 있습니다.

- **`method`**

  - `calculate` 메서드 (연산 수행): 이 메서드는 제너릭 타입 `T`를 사용하여 다양한 숫자 타입(`Integer`, `Double`, `Float` 등)을 처리할 수 있습니다. 사용자가 입력한 두 숫자와 연산자에 따라 연산을 수행하고, 그 결과를 `results` 리스트에 저장합니다.

    - `T extends Number`로 제너릭 타입을 제한하여 `Number` 클래스를 상속하는 모든 숫자 타입을 처리합니다. 연산은 `Calculator3.OperatorType` 열거형의 `apply` 메서드를 통해 수행됩니다. 

  - `printResultsGreaterThan` 메서드: 이 메서드는 `results` 리스트에 저장된 연산 결과 중 주어진 값보다 큰 결과만 필터링하여 출력합니다. 람다식과 스트림 API를 사용하여 필터링을 처리합니다. 만약 해당 값보다 큰 결과가 없으면 "입력한 값보다 큰 결과는 없습니다."라는 메시지를 출력합니다.

    
<br>

### `Calculator3.java`
> `Calculator3`는 제너릭을 사용하여 다양한 숫자 타입을 지원하며, `OperatorType`을 사용한 사칙연산을 수행합니다. 각 연산은 연산자 기호를 기반으로 하여 처리됩니다. 또한, 계산된 결과를 저장하고 관리할 수 있습니다.

- **`method`**
  - `calculate(int a, int b, char operator)`: 이 메서드는 두 숫자와 연산자를 입력받아 연산을 수행하고, 그 결과를 출력합니다. `OperatorType` enum을 사용하여 연산자를 처리하고, 각 연산에 대한 구체적인 로직은 `OperatorType` enum 내에서 구현된 `apply` 메서드를 통해 호출됩니다.
 
  - `OperatorType` Enum: 연산자를 처리하는 `OperatorType` enum은 사칙연산을 모두 다루며, 각 연산자에 맞는 `apply` 메서드를 오버라이딩하여 연산을 수행합니다. 이를 통해 코드의 재사용성과 가독성을 높입니다.
 
  - `apply(T a, T b)`: `apply` 메서드는 제너릭 메서드로, 두 숫자를 받아 계산을 수행하고 결과를 반환합니다. 제너릭을 사용하여 `T` 타입으로 숫자를 처리할 수 있으므로, `Integer`, `Double` 등 다양한 타입을 처리할 수 있습니다. 이 메서드는 `OperatorType` enum 내에서 각 연산에 맞는 계산을 처리하는 중요한 역할을 합니다.
 
  - `fromSymbol(char symbol)`: 이 메서드는 연산자 기호를 입력받아 해당하는 `OperatorType enum` 값을 반환합니다. 예를 들어, 입력된 기호가 `+`일 경우 `OperatorType.ADD`를 반환합니다. 이 메서드는 연산자가 무엇인지를 처리하는 중요한 부분입니다.
 
  - `getSymbol()`: 각 `OperatorType` enum 값은 `getSymbol()` 메서드를 통해 해당 연산자의 기호를 반환합니다. 예를 들어, `OperatorType.ADD`는 `'+'`를 반환합니다. 이 메서드는 주로 `fromSymbol` 메서드 내에서 사용됩니다.

<br>

### `App.java`
> `App.java`는 사용자 입력을 받아 계산을 수행하고, 그 결과를 처리하는 역할을 합니다. 사용자가 계속해서 계산을 할 수 있도록 합니다.

<br>

## Calculator3_Features
- 제너릭을 사용하여 다양한 숫자 타입(int, float, double)을 처리할 수 있습니다.

- Enum을 사용하여 사칙연산 기호(+, -, *, /)에 맞는 연산을 수행합니다.

- 연산 결과를 계산 후 반환합니다.

- 연산 결과를 저장하고 조회할 수 있습니다.

- 0으로 나누기를 처리합니다.

- 사용자가 연산을 계속할지 종료할지 선택할 수 있습니다.

<br>

## Calculator3_Screenshots

<br>

## Calculator3_Usage
1. 프로그램 실행 후, 첫 번째 숫자와 두 번째 숫자를 입력합니다.
2. 사칙연산 기호(+, -, *, /)를 입력합니다.
3. 연산 결과가 출력됩니다.
4. 연산을 계속하려면 아무 키나 누르고, 종료하려면 exit을 입력합니다.

   <br>

   
## Contact
Created by 
[@JoeMinKyung](https://github.com/JoeMinKyung)
<br>

문의사항이 있다면 언제든지 연락주세요!
