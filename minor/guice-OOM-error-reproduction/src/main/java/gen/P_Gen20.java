
  package gen;
  public class P_Gen20 {
  		@com.google.inject.Inject
  		public P_Gen20(P_Gen21 p_gen21){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen21 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  