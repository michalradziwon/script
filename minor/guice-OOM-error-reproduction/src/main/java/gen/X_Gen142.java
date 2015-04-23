
  package gen;
  public class X_Gen142 {
  		@com.google.inject.Inject
  		public X_Gen142(X_Gen143 x_gen143){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen143 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  