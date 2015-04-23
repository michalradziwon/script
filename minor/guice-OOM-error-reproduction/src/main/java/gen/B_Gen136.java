
  package gen;
  public class B_Gen136 {
  		@com.google.inject.Inject
  		public B_Gen136(B_Gen137 b_gen137){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen137 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  