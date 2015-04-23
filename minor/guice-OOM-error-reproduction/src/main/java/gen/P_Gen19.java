
  package gen;
  public class P_Gen19 {
  		@com.google.inject.Inject
  		public P_Gen19(P_Gen20 p_gen20){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen20 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  