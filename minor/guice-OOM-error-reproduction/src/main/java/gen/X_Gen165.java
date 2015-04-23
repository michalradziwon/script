
  package gen;
  public class X_Gen165 {
  		@com.google.inject.Inject
  		public X_Gen165(X_Gen166 x_gen166){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen166 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  