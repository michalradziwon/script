
  package gen;
  public class X_Gen106 {
  		@com.google.inject.Inject
  		public X_Gen106(X_Gen107 x_gen107){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen107 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  