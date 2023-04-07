/* eslint-disable class-methods-use-this */
import { BsLock } from 'react-icons/bs';
import { CompositeNode } from 'app/domain/composite';
import * as AppActions from 'app/store/actions/app';
import { EntityType } from 'app/utils/domain.constants';
import DeviceAction from './DeviceAction';

export default class EndEmergency extends DeviceAction {
    name = 'endEmergency';

    label = 'End Emergency Mode';

    icon = BsLock;

    requireConfirmation(): boolean {
        return true;
    }

    execute(device: CompositeNode): void {
        if (device?.id) {
            const deviceAction = {
                entityType: EntityType.DOOR,
                deviceId: device.id,
                action: this.name,
            };
            this.dispatch(AppActions.deviceAction(deviceAction));
        }
    }
}
