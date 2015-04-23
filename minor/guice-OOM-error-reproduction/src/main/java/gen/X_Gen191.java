
  package gen;
  public class X_Gen191 {
  		@com.google.inject.Inject
  		public X_Gen191(X_Gen192 x_gen192){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen192 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  