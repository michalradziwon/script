
  package gen;
  public class P_Gen136 {
  		@com.google.inject.Inject
  		public P_Gen136(P_Gen137 p_gen137){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen137 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  