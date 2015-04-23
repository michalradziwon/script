
  package gen;
  public class J_Gen136 {
  		@com.google.inject.Inject
  		public J_Gen136(J_Gen137 j_gen137){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen137 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  