grammar Vetrix;
         
calculateVectors returns [List<Double> values]
	: exp=arythmVectors {$values = $exp.values;};    	

arythmVectors returns [List<Double> values]
	// Summarizes vectors. Eg: [1, 2, 3] + [4, 7.43, -5]
	:    (sum1 = vector {}
         ( PLUS sum2 = vector {
         	List<Double> vector1 = $sum1.values;
         	List<Double> vector2 = $sum2.values;
         	List<Double> summary = new ArrayList<Double>();
         	for(int i = 0; i < vector2.size(); i++){
         		summary.add(vector1.get(i) + vector2.get(i));
         	}
         	$values = summary;
         } 
         |MINUS sum2 = vector {
         	List<Double> vector1 = $sum1.values;
         	List<Double> vector2 = $sum2.values;
         	List<Double> subtraction = new ArrayList<Double>();
         	for(int i = 0; i < vector2.size(); i++){
         		subtraction.add(vector1.get(i) - vector2.get(i));
         	}
         	$values = subtraction;
         } 
         | MULT sum2 = vector {
         	List<Double> vector1 = $sum1.values;
         	List<Double> vector2 = $sum2.values;
         	List<Double> summary = new ArrayList<Double>();
         	for(int i = 0; i < vector2.size(); i++){
         		summary.add(vector1.get(i) * vector2.get(i));
         	}
         	$values = summary;
         }
         | MULT sum3 = number {
         	List<Double> vector1 = $sum1.values;
         	Double number = $sum3.value;
         	//if(vector1.size() != vector2.size()){ throw new EmptyStackException(); }
         	List<Double> multiplication = new ArrayList<Double>();
         	for(int i = 0; i < vector1.size(); i++){
         		multiplication.add(vector1.get(i) * number);
         	}
         	$values = multiplication;
         })+)
         | (sum5 = number (
         	MULT sum6 = vector {
         		Double number = $sum5.value;
	         	List<Double> vector1 = $sum6.values;
	         	//if(vector1.size() != vector2.size()){ throw new EmptyStackException(); }
	         	List<Double> multiplication = new ArrayList<Double>();
	         	for(int i = 0; i < vector1.size(); i++){
	         		multiplication.add(vector1.get(i) * number);
	         	}
	         	$values = multiplication;
         	} 
         )+)
    ;
   
number returns  [Double value]
	: input = NUMBER {
		String input = $input.text;
		$value = Double.parseDouble(input);
	}
	;
              	     
vector returns [List<Double> values]
    /*represents vectors as a List. Eg: [4, 8, 15, 16, 23, 42]*/ 
	: input1 = VECTOR {
		String input = $input1.text;
		input = input.substring(1, input.length() - 1);
		String[] numbers = input.split(",");
		List<Double> list = new ArrayList<Double>();
		for(int i = 0; i < numbers.length; i++){
			list.add(Double.parseDouble(numbers[i]));
		}
		$values = list;
	}
	| STICK input2 = VECTOR STICK{
		String input = $input2.text;
		input = input.substring(1, input.length() - 1);
		String[] numbers = input.split(",");
		List<Double> list = new ArrayList<Double>();
		for(int i = 0; i < numbers.length; i++){
			list.add(Math.abs(Double.parseDouble(numbers[i])));
		}
		$values = list;
	}
	| L_C_BR exp1=arythmVectors R_C_BR {$values = $exp1.values;}
	| STICK L_C_BR exp2=arythmVectors R_C_BR STICK {
		List<Double> vector = $exp2.values;
		List<Double> moduledValues = new ArrayList<Double>();
		for(int i = 0; i < vector.size(); i++){
			moduledValues.add(Math.abs(vector.get(i)));
		} 
		$values = moduledValues;
	}
	;

VECTOR: L_BR (NUMBER COMMA)+ NUMBER R_BR;
SUMMED_VECTORS: VECTOR PLUS VECTOR;


STICK: '|';
L_BR: '[';
R_BR: ']';
L_C_BR: '(';
R_C_BR: ')';
NUMBER :    ('-')?('0'..'9')+ ('.' ('0'..'9')+)?; // float number
WS  :   (' ' | '\t' | '\r'| '\n') -> channel(HIDDEN); // Ignore WhiteSpace characters
ID:  ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*; // match lower-case identifiers

//Dividers:
COMMA: ',';
SEMICOLON: ';';

//Types
VECTOR_TYPE: 'Vector';
PRINT: 'print';

//Operations:
PLUS: '+';
EQUALS: '=';
MINUS: '-';
MULT: '*';


//r  : 'vetrix' ID ;         // match keyword hello followed by an identifier
//LOG_SIGN : '<'|'>'|'==';
//ID:  ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*; // match lower-case identifiers
//INT : '0'..'9'+    ;
//WS:   ( ' '| '\t'| '\r'| '\n'        ) -> channel(HIDDEN)   ;
//
//assign: ID EQUALS expr;
//
//vector_name: ID;
//
//var_value    : ID | vector_name;
//type: VECTOR_TYPE;
//
//expr : expr ('*'|'/') expr
//     | expr ('+'|'-') expr
//		 | INT
//		 ;


