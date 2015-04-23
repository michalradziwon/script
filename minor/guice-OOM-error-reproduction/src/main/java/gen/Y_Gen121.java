
  package gen;
  public class Y_Gen121 {
  		@com.google.inject.Inject
  		public Y_Gen121(Y_Gen122 y_gen122){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen122 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  