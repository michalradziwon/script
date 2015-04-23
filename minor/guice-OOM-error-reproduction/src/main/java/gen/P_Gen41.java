
  package gen;
  public class P_Gen41 {
  		@com.google.inject.Inject
  		public P_Gen41(P_Gen42 p_gen42){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen42 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  