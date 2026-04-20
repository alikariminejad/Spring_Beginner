import { useState } from 'react'
import { PropTypes } from 'prop-types';

export default function CounterButton({ by = 10, incrementMethod }) {
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