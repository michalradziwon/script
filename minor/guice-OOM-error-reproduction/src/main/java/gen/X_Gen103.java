
  package gen;
  public class X_Gen103 {
  		@com.google.inject.Inject
  		public X_Gen103(X_Gen104 x_gen104){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen104 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  