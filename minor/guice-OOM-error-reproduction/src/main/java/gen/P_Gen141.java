
  package gen;
  public class P_Gen141 {
  		@com.google.inject.Inject
  		public P_Gen141(P_Gen142 p_gen142){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen142 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  