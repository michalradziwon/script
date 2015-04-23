
  package gen;
  public class X_Gen138 {
  		@com.google.inject.Inject
  		public X_Gen138(X_Gen139 x_gen139){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen139 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  