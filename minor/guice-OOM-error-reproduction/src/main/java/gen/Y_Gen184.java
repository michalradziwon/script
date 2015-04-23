
  package gen;
  public class Y_Gen184 {
  		@com.google.inject.Inject
  		public Y_Gen184(Y_Gen185 y_gen185){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen185 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  