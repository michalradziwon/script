
  package gen;
  public class P_Gen79 {
  		@com.google.inject.Inject
  		public P_Gen79(P_Gen80 p_gen80){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen80 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  