
  package gen;
  public class X_Gen119 {
  		@com.google.inject.Inject
  		public X_Gen119(X_Gen120 x_gen120){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen120 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  