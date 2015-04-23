
  package gen;
  public class X_Gen12 {
  		@com.google.inject.Inject
  		public X_Gen12(X_Gen13 x_gen13){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen13 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  