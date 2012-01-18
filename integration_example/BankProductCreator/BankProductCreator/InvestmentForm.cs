using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Globalization;

namespace BankProductCreator
{
   class InvestmentForm
   {
      enum RiskLevel { Low=0, Medium, High, Speculative };

      private String id;

      public String Id
      {
         get { return id; }
         set { id = value; }
      }

      private String name;

      public String Name
      {
         get { return name; }
         set { name = value; }
      }

      private String description;

      public String Description
      {
         get { return description; }
         set { description = value; }
      }

      private int min_duration;

      public int Min_duration
      {
         get { return min_duration; }
         set { min_duration = value; }
      }

      private RiskLevel risklevel;

      private RiskLevel Risklevel
      {
         get { return risklevel; }
         set { risklevel = value; }
      }

      private double min_deposit;

      public double Min_deposit
      {
         get { return min_deposit; }
         set { min_deposit = value; }
      }

      private int revenue;

      public int Revenue
      {
         get { return revenue; }
         set { revenue = value; }
      }

      public String toCsv()
      {
         return "\"" + id + "\";\"" + name + "\";\"" + description + "\";" + min_duration + ";" + (int)risklevel + ";" + min_deposit.ToString(CultureInfo.InvariantCulture) + ";" + revenue;
      }
   }
}
