
  package gen;
  public class X_Gen195 {
  		@com.google.inject.Inject
  		public X_Gen195(X_Gen196 x_gen196){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen196 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  