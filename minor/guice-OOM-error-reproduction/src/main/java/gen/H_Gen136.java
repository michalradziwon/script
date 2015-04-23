
  package gen;
  public class H_Gen136 {
  		@com.google.inject.Inject
  		public H_Gen136(H_Gen137 h_gen137){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen137 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  