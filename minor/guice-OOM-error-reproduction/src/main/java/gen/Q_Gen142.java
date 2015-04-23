
  package gen;
  public class Q_Gen142 {
  		@com.google.inject.Inject
  		public Q_Gen142(Q_Gen143 q_gen143){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen143 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  