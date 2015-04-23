
  package gen;
  public class P_Gen142 {
  		@com.google.inject.Inject
  		public P_Gen142(P_Gen143 p_gen143){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen143 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  