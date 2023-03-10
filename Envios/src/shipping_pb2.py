# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: shipping.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x0eshipping.proto\x12\x13shipping.interfaces\"\x86\x01\n\x05Order\x12\x16\n\x0estatusPurchase\x18\x01 \x01(\t\x12\r\n\x05\x62uyer\x18\x02 \x01(\t\x12\x0c\n\x04name\x18\x03 \x01(\t\x12\r\n\x05price\x18\x04 \x01(\x02\x12\x0f\n\x07\x61\x64\x64ress\x18\x05 \x01(\t\x12\x12\n\nphoneBuyer\x18\x06 \x01(\t\x12\x14\n\x0c\x63ityDelivery\x18\x07 \x01(\t\"?\n\x12\x43reateOrderRequest\x12)\n\x05order\x18\x01 \x01(\x0b\x32\x1a.shipping.interfaces.Order\"4\n\x13\x43reateOrderResponse\x12\x1d\n\x15messageOfConfirmation\x18\x01 \x01(\t\"\x1f\n\x0fGetOrderRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\"=\n\x10GetOrderResponse\x12)\n\x05order\x18\x01 \x01(\x0b\x32\x1a.shipping.interfaces.Order\"M\n\x12UpdateOrderRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\x12)\n\x05order\x18\x02 \x01(\x0b\x32\x1a.shipping.interfaces.Order\"4\n\x13UpdateOrderResponse\x12\x1d\n\x15messageOfConfirmation\x18\x01 \x01(\t2\xab\x02\n\x0cOrderService\x12`\n\x0b\x63reateOrder\x12\'.shipping.interfaces.CreateOrderRequest\x1a(.shipping.interfaces.CreateOrderResponse\x12W\n\x08getOrder\x12$.shipping.interfaces.GetOrderRequest\x1a%.shipping.interfaces.GetOrderResponse\x12`\n\x0bupdateOrder\x12\'.shipping.interfaces.UpdateOrderRequest\x1a(.shipping.interfaces.UpdateOrderResponseb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'shipping_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  _ORDER._serialized_start=40
  _ORDER._serialized_end=174
  _CREATEORDERREQUEST._serialized_start=176
  _CREATEORDERREQUEST._serialized_end=239
  _CREATEORDERRESPONSE._serialized_start=241
  _CREATEORDERRESPONSE._serialized_end=293
  _GETORDERREQUEST._serialized_start=295
  _GETORDERREQUEST._serialized_end=326
  _GETORDERRESPONSE._serialized_start=328
  _GETORDERRESPONSE._serialized_end=389
  _UPDATEORDERREQUEST._serialized_start=391
  _UPDATEORDERREQUEST._serialized_end=468
  _UPDATEORDERRESPONSE._serialized_start=470
  _UPDATEORDERRESPONSE._serialized_end=522
  _ORDERSERVICE._serialized_start=525
  _ORDERSERVICE._serialized_end=824
# @@protoc_insertion_point(module_scope)
