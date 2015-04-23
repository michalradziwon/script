
  package gen;
  public class X_Gen68 {
  		@com.google.inject.Inject
  		public X_Gen68(X_Gen69 x_gen69){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen69 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  