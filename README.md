# COVID-19 Case Forecasting Final Year Project

This repository contains the workflow for building and evaluating machine learning models to forecast COVID-19 cases in Malaysia.

---

## **Project Structure**
- `datasets/`: Contains the datasets used for training and testing.
- `models/`: Stores trained machine learning models.
- `notebooks/`: Contains Jupyter Notebooks for training and evaluating models.
- `.gitignore`: Specifies files and folders to ignore in version control.
- `requirements.txt`: Lists the dependencies required to run this project.

---

## **Steps to Use**
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/fyp-master.git
   cd fyp-master
   ```

2. Install the dependencies:
   ```bash
   pip install -r requirements.txt
   ```



---

## **Dataset**
- The dataset is sourced from the official **Ministry of Health (MoH) Malaysia GitHub repository**:  
  🔗 [MoH-Malaysia COVID-19 Public Data](https://github.com/MoH-Malaysia/covid19-public)
- It includes daily COVID-19 case counts and other relevant time series data.

---

## **Models Used**
The following machine learning models were trained and evaluated for forecasting COVID-19 case trends:
- **ARIMA** (AutoRegressive Integrated Moving Average)
- **LSTM** (Long Short-Term Memory Neural Network)
- **Random Forest** (for time series regression)
- **Hybrid Model** (Combining Random Forest + LSTM)

---

## **Dependencies**
To run this project, install the required dependencies using:

```bash
pip install -r requirements.txt
```

Or manually install the key dependencies:

```bash
pip install numpy pandas scikit-learn scipy matplotlib seaborn statsmodels tensorflow h5py joblib
```

