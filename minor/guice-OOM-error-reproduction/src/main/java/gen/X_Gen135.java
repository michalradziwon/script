
  package gen;
  public class X_Gen135 {
  		@com.google.inject.Inject
  		public X_Gen135(X_Gen136 x_gen136){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen136 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  