
  package gen;
  public class P_Gen114 {
  		@com.google.inject.Inject
  		public P_Gen114(P_Gen115 p_gen115){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen115 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  