
  package gen;
  public class X_Gen147 {
  		@com.google.inject.Inject
  		public X_Gen147(X_Gen148 x_gen148){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen148 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  