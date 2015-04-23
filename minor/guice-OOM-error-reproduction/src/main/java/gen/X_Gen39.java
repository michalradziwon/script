
  package gen;
  public class X_Gen39 {
  		@com.google.inject.Inject
  		public X_Gen39(X_Gen40 x_gen40){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen40 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  