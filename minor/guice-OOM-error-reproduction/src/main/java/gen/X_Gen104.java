
  package gen;
  public class X_Gen104 {
  		@com.google.inject.Inject
  		public X_Gen104(X_Gen105 x_gen105){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen105 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  