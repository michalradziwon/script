
  package gen;
  public class X_Gen89 {
  		@com.google.inject.Inject
  		public X_Gen89(X_Gen90 x_gen90){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen90 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  