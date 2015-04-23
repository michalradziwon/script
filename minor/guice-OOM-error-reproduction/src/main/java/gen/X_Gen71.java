
  package gen;
  public class X_Gen71 {
  		@com.google.inject.Inject
  		public X_Gen71(X_Gen72 x_gen72){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen72 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  