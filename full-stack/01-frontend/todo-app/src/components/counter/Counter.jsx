import { useState } from 'react'
import './Counter.css'
import PropTypes from 'prop-types';
function Counter({ by= 10 }) {
    console.log('Counter rendered with by =', by);  // Add this line

    const [count, setCount] = useState(0);

    function incrementCounterFunction() {
        setCount(count + by)
        // console.log('count is:', count)
    }

    function decrementCounterFunction() {
        setCount(count - by)
    }

    return (
        <div className="Counter">
            <span className="count">{count}</span>
            <div>
                    <button className="counterButton"
                    onClick={incrementCounterFunction}>+{by}</button>
                    <button className='counterButton'
                    onClick={decrementCounterFunction}>-{by}</button>
            </div>
        </div>
    )
}

Counter.propTypes = {
    by: PropTypes.number
}

export default Counter;