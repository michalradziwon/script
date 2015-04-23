
  package gen;
  public class X_Gen62 {
  		@com.google.inject.Inject
  		public X_Gen62(X_Gen63 x_gen63){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen63 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  