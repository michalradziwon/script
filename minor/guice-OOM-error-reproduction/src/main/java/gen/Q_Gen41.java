
  package gen;
  public class Q_Gen41 {
  		@com.google.inject.Inject
  		public Q_Gen41(Q_Gen42 q_gen42){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen42 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  