
  package gen;
  public class L_Gen136 {
  		@com.google.inject.Inject
  		public L_Gen136(L_Gen137 l_gen137){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen137 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  