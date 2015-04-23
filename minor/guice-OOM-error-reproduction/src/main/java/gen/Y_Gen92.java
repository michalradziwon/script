
  package gen;
  public class Y_Gen92 {
  		@com.google.inject.Inject
  		public Y_Gen92(Y_Gen93 y_gen93){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen93 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  