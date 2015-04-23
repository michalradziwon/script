
  package gen;
  public class X_Gen172 {
  		@com.google.inject.Inject
  		public X_Gen172(X_Gen173 x_gen173){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen173 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  