
  package gen;
  public class X_Gen69 {
  		@com.google.inject.Inject
  		public X_Gen69(X_Gen70 x_gen70){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen70 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  