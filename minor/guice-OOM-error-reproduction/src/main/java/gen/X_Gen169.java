
  package gen;
  public class X_Gen169 {
  		@com.google.inject.Inject
  		public X_Gen169(X_Gen170 x_gen170){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen170 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  