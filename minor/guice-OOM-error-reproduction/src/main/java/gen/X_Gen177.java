
  package gen;
  public class X_Gen177 {
  		@com.google.inject.Inject
  		public X_Gen177(X_Gen178 x_gen178){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen178 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  