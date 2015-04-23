
  package gen;
  public class X_Gen45 {
  		@com.google.inject.Inject
  		public X_Gen45(X_Gen46 x_gen46){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen46 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  