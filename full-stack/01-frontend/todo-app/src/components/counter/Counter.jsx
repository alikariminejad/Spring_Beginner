import { useState } from 'react'
import './Counter.css'
import CounterButton from './CounterButton';

export default function Counter() {
    const [count, setCount] = useState(0);

    function incrementCounterParentFunction(by) {
        setCount(count + by)
    }

    return (
        <>
        <span className="totoalCount">{count}</span>
        <CounterButton by={1} incrementMethod={incrementCounterParentFunction} />
        <CounterButton by={2} incrementMethod={incrementCounterParentFunction} />
        <CounterButton by={3} incrementMethod={incrementCounterParentFunction} />
        </>
    )
}