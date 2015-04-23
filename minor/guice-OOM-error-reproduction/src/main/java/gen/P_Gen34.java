
  package gen;
  public class P_Gen34 {
  		@com.google.inject.Inject
  		public P_Gen34(P_Gen35 p_gen35){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen35 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  