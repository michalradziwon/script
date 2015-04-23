
  package gen;
  public class P_Gen40 {
  		@com.google.inject.Inject
  		public P_Gen40(P_Gen41 p_gen41){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen41 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  