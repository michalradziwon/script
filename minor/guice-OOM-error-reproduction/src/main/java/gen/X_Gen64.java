
  package gen;
  public class X_Gen64 {
  		@com.google.inject.Inject
  		public X_Gen64(X_Gen65 x_gen65){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen65 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  