#include<p18f8722.inc>
	clrf TRISD, 0
	MOVLW 0x00
	MOVWF PORTD, 0
ADD INCF PORTD, 1
	CALL DELAY
	GOTO ADD

DELAY
	Counter1 EQU 0X0C
	Counter2 EQU 0X0D
	Counter3 EQU 0X0E
	MOVLW 0Xb5
	MOVWF Counter1
	MOVLW 0Xaf
	MOVWF Counter2
	MOVLW 0X0d
	MOVWF Counter3
LOOP DECFSZ Counter1, 1
	GOTO LOOP
	DECFSZ Counter2, 1
	GOTO LOOP
	DECFSZ Counter3, 1
	GOTO LOOP
RETURN
end