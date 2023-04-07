/* eslint-disable @typescript-eslint/explicit-module-boundary-types */
/* eslint-disable @typescript-eslint/no-explicit-any */
import { useEffect, useRef } from 'react';

export function useMemoCompare(next: any, compare: any): any {
    // Ref for storing previous value
    const previousRef = useRef();
    const previous = previousRef.current;
    // Pass previous and next value to compare function
    // to determine whether to consider them equal.
    const isEqual = compare(previous, next);
    // If not equal update previousRef to next value.
    // We only update if not equal so that this hook continues to return
    // the same old value if compare keeps returning true.
    useEffect(() => {
        if (!isEqual) {
            previousRef.current = next;
        }
    });
    // Finally, if equal then return the previous value
    return isEqual ? previous : next;
}
