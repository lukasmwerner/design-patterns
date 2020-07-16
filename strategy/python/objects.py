class ISnapshotBehavior:
    '''Base snapshot behavior'''
    def snapshot(self) -> str:
        '''Base photo behavior'''
        pass

class INikonSnapshotBehavior(ISnapshotBehavior):
    '''Nikon snapshot behavior'''
    def snapshot(self):
        return "Nikon"

class ICanonSnapshotBehavior(ISnapshotBehavior):
    '''Canon snapshot behavior'''
    def snapshot(self):
        return "Canon"

class Camera(object):
    def __init__(self, model: str, brand: str, snapshot_behavior: ISnapshotBehavior):
        self.model = model
        self.brand = brand
        self.snapshot_behavior = snapshot_behavior

    def snapshot(self) -> str:
        return self.snapshot_behavior.snapshot()

