
  package gen;
  public class X_Gen70 {
  		@com.google.inject.Inject
  		public X_Gen70(X_Gen71 x_gen71){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen71 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  