
  package gen;
  public class X_Gen168 {
  		@com.google.inject.Inject
  		public X_Gen168(X_Gen169 x_gen169){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen169 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  