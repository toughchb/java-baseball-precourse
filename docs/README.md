##메세지 처리
* 리소스 번들을 이용해서 메세지 정의하기 [v]

##메세지를 이용 하여 view 구현
* 숫자 입력 메세지 출력 [v]
  - SystemView::requestBallNumberInput()
* retry 메세지 출력 [v]
  - SystemView::requestRetryOption()
* 스코어 메세지 출력 [v]
  - SystemView::printScore()
* 게임 끝 메세지 출력 [v]
  - SystemView::printGameFinish()

##입력 받은 숫자 parsing 기능
- 한자리씩 Integer parsing 하여 리스트에 추가 [v]

##숫자 검증 기능
- 입력 받은 숫자가 3개 인지 확인 [v]
- 입력 받은 숫자가 1~9의 숫자인지 확인 [v]
- 입력 받은 숫자에 중복이 없는지 확인 [v]

##BaseballGameController 구현
- 게임 흐름 [v]
- BaseballGameService 초기화 [v]
- BaseballGameService start [v]
- BaseballGameService finish [v]
- retry [v]

##숫자 비교 하기
###플레이어공 하나 와 컴퓨터 공 하나 비교하기 -> Ball
- 위치와 숫자 값이 같은 경우 - 스트라이크
- 위치는 다른데 숫자 값이 같은 경우 - 볼
- 숫자 값이 다른 경우 - 낫싱

###내공 하나 와 컴퓨터 공 세개 비교하기 -> BaseballGame
- 위치와 숫자 값이 같은 경우 - 스트라이크
- 위치는 다른데 숫자 값이 같은 경우 - 볼
- 숫자 값이 다른 경우 - 낫싱