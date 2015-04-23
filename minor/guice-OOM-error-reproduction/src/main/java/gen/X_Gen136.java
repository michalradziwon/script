
  package gen;
  public class X_Gen136 {
  		@com.google.inject.Inject
  		public X_Gen136(X_Gen137 x_gen137){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen137 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  