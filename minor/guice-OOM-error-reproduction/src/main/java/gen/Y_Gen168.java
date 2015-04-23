
  package gen;
  public class Y_Gen168 {
  		@com.google.inject.Inject
  		public Y_Gen168(Y_Gen169 y_gen169){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen169 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  