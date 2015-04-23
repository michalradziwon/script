
  package gen;
  public class X_Gen199 {
  		@com.google.inject.Inject
  		public X_Gen199(X_Gen200 x_gen200){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen200 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  