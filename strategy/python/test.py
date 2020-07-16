from .objects import *

nikonCamera = Camera("D5600", "Nikon", INikonSnapshotBehavior())
print(nikonCamera.snapshot())

canonCamera = Camera("EOS R", "Canon", ICanonSnapshotBehavior())
print(canonCamera.snapshot())
