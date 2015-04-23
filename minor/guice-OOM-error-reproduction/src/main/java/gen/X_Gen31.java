
  package gen;
  public class X_Gen31 {
  		@com.google.inject.Inject
  		public X_Gen31(X_Gen32 x_gen32){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen32 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  