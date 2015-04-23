
  package gen;
  public class P_Gen11 {
  		@com.google.inject.Inject
  		public P_Gen11(P_Gen12 p_gen12){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen12 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  