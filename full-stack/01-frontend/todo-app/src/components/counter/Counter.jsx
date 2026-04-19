import { useState } from 'react'
import './Counter.css'
import PropTypes from 'prop-types';

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
function CounterButton({ by= 10,  incrementMethod }) {
    const [count, setCount] = useState(0);

    function incrementCounterFunction() {
        setCount(count + by)
        incrementMethod(by)
        // console.log('count is:', count)
    }

    function decrementCounterFunction() {
        setCount(count - by)
        incrementMethod(-by)
    }

    return (
        <div className="Counter">
            <div>
                    <button className="counterButton"
                    onClick={incrementCounterFunction}>+{by}</button>
                    <button className='counterButton'
                    onClick={decrementCounterFunction}>-{by}</button>
            </div>
        </div>
    )
}

CounterButton.propTypes = {
    by: PropTypes.number
}