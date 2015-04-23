
  package gen;
  public class D_Gen136 {
  		@com.google.inject.Inject
  		public D_Gen136(D_Gen137 d_gen137){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen137 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  