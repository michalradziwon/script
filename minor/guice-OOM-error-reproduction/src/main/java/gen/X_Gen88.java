
  package gen;
  public class X_Gen88 {
  		@com.google.inject.Inject
  		public X_Gen88(X_Gen89 x_gen89){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen89 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  