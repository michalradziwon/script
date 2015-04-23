
  package gen;
  public class X_Gen37 {
  		@com.google.inject.Inject
  		public X_Gen37(X_Gen38 x_gen38){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen38 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  