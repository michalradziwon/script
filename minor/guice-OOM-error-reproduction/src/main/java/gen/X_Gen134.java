
  package gen;
  public class X_Gen134 {
  		@com.google.inject.Inject
  		public X_Gen134(X_Gen135 x_gen135){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen135 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  