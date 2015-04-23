
  package gen;
  public class X_Gen121 {
  		@com.google.inject.Inject
  		public X_Gen121(X_Gen122 x_gen122){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen122 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  