//objectMethods
//객체메소드(object method),계산된 프로퍼티(computed property)</

//computed property (계산된 프로퍼티)
    let a= 'age';
    const user={
        name:'jin',
        [a]:30  //->{age:30}
    } //계산식도 가능

    //객체메소드

    //Object.assign({초기값}, 복사할 객체) 객체복사
    //Object.keys() 키 배열 반환
    //Object.values()값 배열 반환
    //Object.entries() 키/값 모두 배열 반환
    //Object.fromEntries() 키/값 배열을 객체로 
