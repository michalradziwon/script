
  package gen;
  public class X_Gen28 {
  		@com.google.inject.Inject
  		public X_Gen28(X_Gen29 x_gen29){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen29 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  