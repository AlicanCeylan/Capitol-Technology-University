#include <p18f8722.inc>

SETF TRISD, 0
CLRF PORTD, 0
CLRF TRISC, 0
CLRF PORTC, 0
CLRF WREG

BACK CLRF WREG
CALL SWITCH
GOTO BACK

SWITCH
BTFSC PORTD, 0
ADDLW 0x01
BTFSC PORTD, 1
ADDLW 0x02
BTFSC PORTD, 2
ADDLW 0x03
BTFSC PORTD, 3
ADDLW 0x04
BTFSC PORTD, 4
ADDLW 0x05
BTFSC PORTD, 5
ADDLW 0x06
INCF 0x10
MOVWF 0x10
CLRF WREG
CALL DISPLAY
RETURN

DISPLAY
DCFSNZ 0x10
CALL ONE
DCFSNZ 0x10
CALL TWO
DCFSNZ 0x10
CALL THREE
DCFSNZ 0x10
CALL FOUR
DCFSNZ 0x10
CALL FIVE
DCFSNZ 0x10
CALL SIX
DCFSNZ 0x10
CALL SEVEN
DCFSNZ 0x10
CALL EIGHT
DCFSNZ 0x10
CALL NINE
RETURN

ZERO
MOVLW 0x3F
MOVWF PORTC, 0
RETURN

ONE
MOVLW 0x06
MOVWF PORTC, 0
RETURN

TWO
MOVLW 0x5B
MOVWF PORTC, 0
RETURN

THREE
MOVLW 0x4F
MOVWF PORTC, 0
RETURN

FOUR
MOVLW 0x66
MOVWF PORTC, 0
RETURN

FIVE
MOVLW 0x6D
MOVWF PORTC, 0
RETURN

SIX
MOVLW 0x7D
MOVWF PORTC, 0
RETURN

SEVEN
MOVLW 0x07
MOVWF PORTC, 0
RETURN

EIGHT
MOVLW 0x7F
MOVWF PORTC, 0
RETURN

NINE
MOVLW 0x6F
MOVWF PORTC, 0
RETURN

end