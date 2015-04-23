
  package gen;
  public class X_Gen96 {
  		@com.google.inject.Inject
  		public X_Gen96(X_Gen97 x_gen97){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen97 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  