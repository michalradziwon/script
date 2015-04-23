
  package gen;
  public class X_Gen196 {
  		@com.google.inject.Inject
  		public X_Gen196(X_Gen197 x_gen197){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen197 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  