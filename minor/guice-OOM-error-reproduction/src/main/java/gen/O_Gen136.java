
  package gen;
  public class O_Gen136 {
  		@com.google.inject.Inject
  		public O_Gen136(O_Gen137 o_gen137){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen137 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  