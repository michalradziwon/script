
  package gen;
  public class X_Gen27 {
  		@com.google.inject.Inject
  		public X_Gen27(X_Gen28 x_gen28){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen28 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  