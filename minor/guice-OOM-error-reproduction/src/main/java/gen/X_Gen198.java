
  package gen;
  public class X_Gen198 {
  		@com.google.inject.Inject
  		public X_Gen198(X_Gen199 x_gen199){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen199 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  