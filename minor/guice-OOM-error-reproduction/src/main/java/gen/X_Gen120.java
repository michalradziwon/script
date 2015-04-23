
  package gen;
  public class X_Gen120 {
  		@com.google.inject.Inject
  		public X_Gen120(X_Gen121 x_gen121){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen121 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  