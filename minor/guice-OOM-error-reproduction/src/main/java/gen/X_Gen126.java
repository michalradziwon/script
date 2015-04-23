
  package gen;
  public class X_Gen126 {
  		@com.google.inject.Inject
  		public X_Gen126(X_Gen127 x_gen127){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen127 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  