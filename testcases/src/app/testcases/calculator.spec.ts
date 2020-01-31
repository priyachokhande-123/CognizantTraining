import { Calculator } from "./calculator";

describe("Testing function calc1 of Calculator", ()=>{

it('testing calc1 for negative values',()=>{

    let calc=new Calculator();
    let response=calc.calc1(-5);

    expect(response).toBe(0);
})

    it('Testing calc1 for positive values', ()=>{
        let calc = new Calculator();
        let response = calc.calc1(5);
        
        expect(response).toBe(6);
    })
    

})
describe("Testing function calc2 of Calculator", ()=>{
    it('testing function calc2 for true result',()=>{
    let calc=new Calculator();
    let response=calc.calc2(64);

    expect(response).toBe(8);

})

})



