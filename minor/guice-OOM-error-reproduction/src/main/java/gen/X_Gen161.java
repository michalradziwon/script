
  package gen;
  public class X_Gen161 {
  		@com.google.inject.Inject
  		public X_Gen161(X_Gen162 x_gen162){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen162 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  