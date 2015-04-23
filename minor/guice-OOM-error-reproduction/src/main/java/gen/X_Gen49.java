
  package gen;
  public class X_Gen49 {
  		@com.google.inject.Inject
  		public X_Gen49(X_Gen50 x_gen50){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen50 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  