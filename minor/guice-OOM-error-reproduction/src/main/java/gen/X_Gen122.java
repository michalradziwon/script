
  package gen;
  public class X_Gen122 {
  		@com.google.inject.Inject
  		public X_Gen122(X_Gen123 x_gen123){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen123 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  