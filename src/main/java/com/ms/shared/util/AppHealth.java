package com.ms.shared.util;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AppHealth {

    String appName;
    String appVersion;
    String healthCheckAt;
}
