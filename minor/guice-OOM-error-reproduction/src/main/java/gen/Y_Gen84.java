
  package gen;
  public class Y_Gen84 {
  		@com.google.inject.Inject
  		public Y_Gen84(Y_Gen85 y_gen85){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen85 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  