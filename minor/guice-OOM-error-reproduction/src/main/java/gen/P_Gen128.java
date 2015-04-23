
  package gen;
  public class P_Gen128 {
  		@com.google.inject.Inject
  		public P_Gen128(P_Gen129 p_gen129){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen129 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  