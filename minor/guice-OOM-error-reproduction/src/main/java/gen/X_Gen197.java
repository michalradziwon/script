
  package gen;
  public class X_Gen197 {
  		@com.google.inject.Inject
  		public X_Gen197(X_Gen198 x_gen198){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen198 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  