
  package gen;
  public class X_Gen141 {
  		@com.google.inject.Inject
  		public X_Gen141(X_Gen142 x_gen142){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen142 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  