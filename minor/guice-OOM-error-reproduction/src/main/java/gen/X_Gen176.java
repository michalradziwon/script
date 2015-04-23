
  package gen;
  public class X_Gen176 {
  		@com.google.inject.Inject
  		public X_Gen176(X_Gen177 x_gen177){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen177 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  