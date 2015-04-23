
  package gen;
  public class P_Gen115 {
  		@com.google.inject.Inject
  		public P_Gen115(P_Gen116 p_gen116){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen116 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  