
  package gen;
  public class P_Gen33 {
  		@com.google.inject.Inject
  		public P_Gen33(P_Gen34 p_gen34){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen34 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  