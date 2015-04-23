
  package gen;
  public class X_Gen125 {
  		@com.google.inject.Inject
  		public X_Gen125(X_Gen126 x_gen126){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen126 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  