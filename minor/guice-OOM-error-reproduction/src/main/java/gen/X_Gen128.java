
  package gen;
  public class X_Gen128 {
  		@com.google.inject.Inject
  		public X_Gen128(X_Gen129 x_gen129){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen129 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  