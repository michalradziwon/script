
  package gen;
  public class Y_Gen183 {
  		@com.google.inject.Inject
  		public Y_Gen183(Y_Gen184 y_gen184){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen184 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  