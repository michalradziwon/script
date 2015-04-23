
  package gen;
  public class X_Gen36 {
  		@com.google.inject.Inject
  		public X_Gen36(X_Gen37 x_gen37){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen37 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  