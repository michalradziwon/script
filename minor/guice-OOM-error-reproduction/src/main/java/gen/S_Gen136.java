
  package gen;
  public class S_Gen136 {
  		@com.google.inject.Inject
  		public S_Gen136(S_Gen137 s_gen137){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen137 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  